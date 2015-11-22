package ua.ivanskyi.rozetka.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ua.ivanskyi.rozetka.service.ProductService;

@Controller
@RequestMapping(value = "/product")
public class ProductController {

	@Inject
	private ProductService productService;

	@RequestMapping()
	public ModelAndView getProducts(ModelAndView model) {

		model.addObject("products", productService.getAllProduct());
		model.setViewName("product");

		return model;
	}

	@RequestMapping(value = "/{categoryName}", method = RequestMethod.GET)
	public ModelAndView productsByCategory(ModelAndView model, @PathVariable String categoryName) {
		String category = categoryName;
		model.addObject("productsByCategory", productService.getProductByCategory(category));
		model.setViewName("phone");

		return model;
	}

}

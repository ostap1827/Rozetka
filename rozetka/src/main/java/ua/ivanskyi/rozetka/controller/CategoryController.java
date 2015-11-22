package ua.ivanskyi.rozetka.controller;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import ua.ivanskyi.rozetka.model.Category;
import ua.ivanskyi.rozetka.service.CategoryService;
import ua.ivanskyi.rozetka.service.ProductService;

@Controller
public class CategoryController {
	@Inject
	private CategoryService categoryService;

	@RequestMapping(value = "categories/all", method = RequestMethod.GET)
	public @ResponseBody List<String> getCategory() {
		List<String> categoryList = new ArrayList<>();
		for (Category c : categoryService.findAllCategory()) {
			categoryList.add(c.getCategoryName().toLowerCase());
		}
		return categoryList;

	}

}

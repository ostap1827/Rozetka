package ua.ivanskyi.rozetka.controller;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import ua.ivanskyi.rozetka.model.Category;
import ua.ivanskyi.rozetka.service.CategoryService;

@Controller
public class CategoryController {
	@Inject
	private CategoryService categoryService;

	@RequestMapping(value = "category/all", method = RequestMethod.GET)

	public @ResponseBody List<String> getCategory() {
		List<String> categoryList = new ArrayList<>();
		for (Category c : categoryService.findAllCategory()) {
			categoryList.add(c.getCategoryName());
		}
		return categoryList;

	}

}

package ua.ivanskyi.rozetka.service;

import java.util.List;

import ua.ivanskyi.rozetka.model.Category;

public interface CategoryService {

	List<Category> findAllCategory();

	Category findCategory(long categoryId);

	void saveCategory(String categoryName);

}

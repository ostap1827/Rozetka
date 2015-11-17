package ua.ivanskyi.rozetka.service.impl;

import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import ua.ivanskyi.rozetka.dao.CategoryDao;
import ua.ivanskyi.rozetka.model.Category;
import ua.ivanskyi.rozetka.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {
	@Inject
	private CategoryDao categoryDao;

	@Transactional
	public List<Category> findAllCategory() {
		return categoryDao.findAll();
	}

	@Transactional
	public Category findCategory(long categoryId) {
		categoryDao.findById(categoryId);
		return null;
	}

	@Transactional
	public void saveCategory(String categoryName) {
		categoryDao.save(new Category(categoryName));
	}

}

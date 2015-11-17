package ua.ivanskyi.rozetka.dao.impl;

import org.springframework.stereotype.Repository;

import ua.ivanskyi.rozetka.dao.CategoryDao;
import ua.ivanskyi.rozetka.model.Category;

@Repository
public class CategoryDaoImpl extends BaseDaoImpl<Category, Long> implements CategoryDao {

	public CategoryDaoImpl() {
		super(Category.class);
	}

}

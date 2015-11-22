package ua.ivanskyi.rozetka.dao;

import java.util.List;

import ua.ivanskyi.rozetka.model.Product;

public interface ProductDao extends BaseDao<Product, Long> {

	List<Product> findByCategory(String categoryName);
}

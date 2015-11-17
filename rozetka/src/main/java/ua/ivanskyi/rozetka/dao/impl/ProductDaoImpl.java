package ua.ivanskyi.rozetka.dao.impl;

import org.springframework.stereotype.Repository;

import ua.ivanskyi.rozetka.dao.ProductDao;
import ua.ivanskyi.rozetka.model.Product;
@Repository
public class ProductDaoImpl extends BaseDaoImpl<Product, Long> implements ProductDao {
	public ProductDaoImpl() {
		super(Product.class);
	}
}

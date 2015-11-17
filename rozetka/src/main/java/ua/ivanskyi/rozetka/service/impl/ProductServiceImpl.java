package ua.ivanskyi.rozetka.service.impl;

import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import ua.ivanskyi.rozetka.dao.ProductDao;
import ua.ivanskyi.rozetka.model.Product;
import ua.ivanskyi.rozetka.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
	@Inject
	private ProductDao productDao;

	@Transactional
	public List<Product> getAllProduct() {

		return productDao.findAll();
	}

	@Transactional
	public Product getProductInfo(long productId) {
		Product product = productDao.findById(productId);
		if (product != null) {
			return product;
		} else {
			return new Product();
		}
	}

	@Transactional
	public void saveProduct(String productName, String reference, int price) {
		productDao.save(new Product(productName, reference, price));

	}
}

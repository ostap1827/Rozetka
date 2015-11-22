package ua.ivanskyi.rozetka.service;

import java.util.List;

import ua.ivanskyi.rozetka.model.Product;

public interface ProductService {
	List<Product> getAllProduct();

	Product getProductInfo(long productId);

	List<Product> getProductByCategory(String categoryName);

	void saveProduct(String productName, String reference, int price);
}

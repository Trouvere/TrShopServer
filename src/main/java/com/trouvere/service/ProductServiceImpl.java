package com.trouvere.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.trouvere.entity.Product;
import com.trouvere.repository.ProductRepository;

public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;

	@Override
	public List<Product> getAllProduct() {
		return (List<Product>) productRepository.findAll();
	}

	@Override
	public Product getByIDProduct(long id) {
		return productRepository.findOne(id);
	}

	@Override
	public Product saveProduct(Product product) {
		return productRepository.save(product);
	}

	@Override
	public void removeProduct(long id) {
		productRepository.delete(id);

	}

}

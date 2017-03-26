package com.trouvere.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trouvere.entity.Category;
import com.trouvere.entity.Product;
import com.trouvere.repository.CategoryRepository;
import com.trouvere.repository.ProductRepository;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CategoryRepository сategoryRepository;
	@Autowired
	private ProductRepository productRepository;

	@Override
	public List<Category> getAllCategory() {
		return (List<Category>) сategoryRepository.findAll();
	}

	@Override
	public Category getByIDCategory(long id) {
		return сategoryRepository.findOne(id);
	}

	@Override
	public Category saveCategory(Category category) {
		return сategoryRepository.save(category);
	}

	@Override
	public void removeCategory(long id) {
		сategoryRepository.delete(id);
	}

	@Override
	public List<Product> getByCategoryProduct(Category category) {

		return productRepository.findByCategory(category);
	}

	@Override
	public List<Product> getByCategoryIDProduct(long categorytId) {
		Category category = сategoryRepository.findOne(categorytId);
		return getByCategoryProduct(category);
	}

}

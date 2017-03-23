package com.trouvere.service;

import java.util.List;

import com.trouvere.entity.Category;
import com.trouvere.entity.Product;

public interface CategoryService {

	List<Category> getAllCategory();

	Category getByIDCategory(long id);

	Category saveCategory(Category category);

	void removeCategory(long id);

	List<Product> getByCategoryProduct(Category category);

	List<Product> getByCategoryIDProduct(long categorytId);

}

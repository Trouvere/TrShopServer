package com.trouvere.service;

import java.util.List;

import com.trouvere.entity.Product;

//Разделить на несколько сервисов
public interface ProductService {

	List<Product> getAllProduct();

	Product getByIDProduct(long id);

	Product saveProduct(Product product);

	void removeProduct(long id);

}

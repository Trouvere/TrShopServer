package com.trouvere.service;

import java.util.List;
import java.util.Set;

import com.trouvere.entity.Category;
import com.trouvere.entity.Orders;
import com.trouvere.entity.Product;
import com.trouvere.entity.User;

//Разделить на несколько сервисов
public interface CategoryService {

	// Category

	List<Category> getAllCategory();

	Category getByIDCategory(long id);

	Category saveCategory(Category category);

	void removeCategory(long id);

	// Product

	List<Product> getAllProduct();

	Product getByIDProduct(long id);

	List<Product> getByCategoryProduct(Category category);

	List<Product> getByCategoryIDProduct(long categorytId);

	Product saveProduct(Product product);

	void removeProduct(long id);

	// User

	List<User> getAllUser();

	User getByIDUser(long userID);

	// Order

	List<Orders> getAllOrderForUser(long userID);

	Orders getByIDOrder(long id);

	Set<Product> getAllProductInOrder(long orderID);

	// ShoppingBag

	Set<Product> getAllProductInShoppingBag(long userID);

	Set<Product> saveProductInShoppingBag(long userID, Product product);

	Set<Product> removeProductInShoppingBag(long userID, long productID);

	// Покупка
	Orders payShoppingBag(long userID);

	Orders payProduct(long userID, Product product);

}

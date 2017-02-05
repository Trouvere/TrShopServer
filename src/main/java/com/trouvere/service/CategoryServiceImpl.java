package com.trouvere.service;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trouvere.entity.Category;
import com.trouvere.entity.Orders;
import com.trouvere.entity.Product;
import com.trouvere.entity.User;
import com.trouvere.repository.CategoryRepository;
import com.trouvere.repository.OrderRepository;
import com.trouvere.repository.ProductRepository;
import com.trouvere.repository.UserRepository;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CategoryRepository сategoryRepository;
	@Autowired
	private OrderRepository orderRepository;
	@Autowired
	private ProductRepository productRepository;
	@Autowired
	private UserRepository userRepository;

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
	// Product

	@Override
	public List<Product> getAllProduct() {
		return (List<Product>) productRepository.findAll();
	}

	@Override
	public Product getByIDProduct(long id) {
		return productRepository.findOne(id);
	}

	@Override
	public List<Product> getByCategoryProduct(Category category) {
		return category.getProduct();
	}

	@Override
	public List<Product> getByCategoryIDProduct(long categorytId) {
		return сategoryRepository.findOne(categorytId).getProduct();
	}

	@Override
	public Product saveProduct(Product product) {
		return productRepository.save(product);
	}

	@Override
	public void removeProduct(long id) {
		productRepository.delete(id);

	}

	@Override
	public List<User> getAllUser() {
		return (List<User>) userRepository.findAll();
	}

	@Override
	public User getByIDUser(long userID) {
		return userRepository.findOne(userID);
	}

	@Override
	public List<Orders> getAllOrderForUser(long userID) {
		return userRepository.findOne(userID).getOrder();
	}

	@Override
	public Orders getByIDOrder(long id) {
		return orderRepository.findOne(id);
	}

	@Override
	public Set<Product> getAllProductInOrder(long orderID) {
		return orderRepository.findOne(orderID).getProduct();
	}

	@Override
	public Set<Product> getAllProductInShoppingBag(long userID) {
		return userRepository.findOne(userID).getShoppingBag();
	}

	@Override
	public Set<Product> saveProductInShoppingBag(long userID, Product product) {
		User user = userRepository.findOne(userID);
		Set<Product> shoppingBag = user.getShoppingBag();
		shoppingBag.add(product);
		userRepository.save(user);
		return shoppingBag;
	}

	@Override
	public Set<Product> removeProductInShoppingBag(long userID, long productID) {
		Set<Product> shoppingBag = userRepository.findOne(userID).getShoppingBag();
		shoppingBag.remove(productRepository.findOne(productID));
		return shoppingBag;
	}

	@Override
	public Orders payShoppingBag(long userID) {
		Date ordersDate = new Date();
		User user = userRepository.findOne(userID);
		Set<Product> product = user.getShoppingBag();
		Orders order = new Orders(ordersDate, product, user);
		orderRepository.save(order);
		return order;
	}

	@Override
	public Orders payProduct(long userID, Product product) {
		Date ordersDate = new Date();
		User user = userRepository.findOne(userID);
		Set<Product> productList = new HashSet<Product>();
		productList.add(product);
		Orders order = new Orders(ordersDate, productList, user);
		orderRepository.save(order);
		return order;
	}

}

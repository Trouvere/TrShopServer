package com.trouvere.controller;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.trouvere.entity.Orders;
import com.trouvere.entity.Product;
import com.trouvere.entity.User;
import com.trouvere.service.CategoryService;

//Для пользователей, корзины, листов покупок и совершения покупок.
//Доступно только для авторизованных пользователей
@Controller
@RequestMapping("/shop/user")
public class UserController {
	@Autowired
	private CategoryService service;

	// User
	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public List<User> getAllUser() {
		return service.getAllUser();
	}

	@RequestMapping(value = "/{userID}", method = RequestMethod.GET)
	@ResponseBody
	public User getUser(@PathVariable("userID") long userID) {
		return service.getByIDUser(userID);
	}

	// Order
	@RequestMapping(value = "/{userID}/order", method = RequestMethod.GET)
	@ResponseBody
	public List<Orders> getAllOrderForUser(@PathVariable("userID") long userID) {
		return service.getAllOrderForUser(userID);
	}

	@RequestMapping(value = "/{userID}/order/{orderID}", method = RequestMethod.GET)
	@ResponseBody
	public Orders getByIDOrder(@PathVariable("orderID") long orderID) {
		return service.getByIDOrder(orderID);
	}

	@RequestMapping(value = "/{userID}/order/{orderID}/product", method = RequestMethod.GET)
	@ResponseBody
	public Set<Product> getAllProductInOrder(@PathVariable("orderID") long orderID) {
		return service.getAllProductInOrder(orderID);
	}

	//
	//
	@RequestMapping(value = "/{userID}/shoppingBag", method = RequestMethod.GET)
	@ResponseBody
	public Set<Product> getAllProductInShoppingBag(@PathVariable("userID") long userID) {
		return service.getAllProductInShoppingBag(userID);
	}

	@RequestMapping(value = "/{userID}/shoppingBag", method = RequestMethod.POST)
	@ResponseBody
	public Set<Product> addProductInOrder(@PathVariable("userID") long userID, @RequestBody Product product) {
		return service.saveProductInShoppingBag(userID, product);
	}

	@RequestMapping(value = "/{userID}/shoppingBag/{productID}", method = RequestMethod.DELETE)
	@ResponseBody
	public Set<Product> removeProductInShoppingBag(@PathVariable("idOrder") long userID,
			@PathVariable("id") long productID) {
		return service.removeProductInShoppingBag(userID, productID);
	}

	// Покупка

	@RequestMapping(value = "/{userID}/payShoppingBag", method = RequestMethod.GET)
	@ResponseBody
	public Orders payshoppingBag(@PathVariable("userID") long userID) {
		return service.payShoppingBag(userID);
	}

	// Реализовать потом возможность покупки нескольких продуктов.
	@RequestMapping(value = "/{userID}/payProduct", method = RequestMethod.POST)
	@ResponseBody
	public Orders payProduct(@PathVariable("userID") long userID, @RequestBody Product product) {
		return service.payProduct(userID, product);

	}
}

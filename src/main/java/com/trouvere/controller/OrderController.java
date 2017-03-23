package com.trouvere.controller;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.trouvere.entity.Orders;
import com.trouvere.entity.Product;
import com.trouvere.service.OrderService;

//Для пользователей, корзины, листов покупок и совершения покупок.
//Доступно только для авторизованных пользователей
@Controller
@RequestMapping("/user")
public class OrderController {
	@Autowired
	private OrderService service;

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

}

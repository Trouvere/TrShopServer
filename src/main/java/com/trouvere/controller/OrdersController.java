package com.trouvere.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.trouvere.entity.Orders;
import com.trouvere.service.OrdersService;

//Для пользователей, корзины, листов покупок и совершения покупок.
//Доступно только для авторизованных пользователей
@Controller
@RequestMapping("/orders")
public class OrdersController {
	@Autowired
	private OrdersService service;

	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public List<Orders> getAllOrders() {
		return service.getAllOrders();
	}

	@RequestMapping(value = "/{ordersID}", method = RequestMethod.GET)
	@ResponseBody
	public Orders getOrders(@PathVariable("ordersID") long ordersID) {
		return service.getByIDOrders(ordersID);
	}

	@RequestMapping(method = RequestMethod.POST)
	@ResponseBody
	public String saveOrders(@RequestBody Orders orders) {
		return service.saveOrders(orders);
	}

	@RequestMapping(value = "/{ordersID}", method = RequestMethod.DELETE)
	@ResponseBody
	public String deleteOrders(@PathVariable("ordersID") long ordersID) {
		return service.removeOrders(ordersID);
	}

	@RequestMapping(value = "/{ordersID}/payOrders", method = RequestMethod.GET)
	@ResponseBody
	public Orders payOrders(@PathVariable("ordersID") long ordersID) {
		return service.payOrders(ordersID);
	}

}

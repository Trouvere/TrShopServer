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
import com.trouvere.entity.User;
import com.trouvere.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService service;

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

	@RequestMapping(method = RequestMethod.POST)
	@ResponseBody
	public User saveProduct(@RequestBody User user) {
		return service.saveUser(user);
	}

	@RequestMapping(value = "/{userID}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteProduct(@PathVariable long userID) {
		service.removeUser(userID);
	}

	@RequestMapping(value = "/{userID}/order", method = RequestMethod.GET)
	@ResponseBody
	public List<Orders> getAllOrderForUser(@PathVariable("userID") long userID) {
		return service.getAllOrderByUserID(userID);
	}

	@RequestMapping(value = "/{userID}/neworder", method = RequestMethod.GET)
	@ResponseBody
	public Orders newOrders(@PathVariable("userID") long userID) {
		return service.newOrders(userID);
	}

}

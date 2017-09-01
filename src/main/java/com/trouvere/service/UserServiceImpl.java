package com.trouvere.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trouvere.entity.Orders;
import com.trouvere.entity.User;
import com.trouvere.repository.OrdersRepository;
import com.trouvere.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private OrdersRepository ordersRepository;

	@Override
	public List<User> getAllUser() {
		return (List<User>) userRepository.findAll();
	}

	@Override
	public User getByIDUser(long userID) {
		return userRepository.findOne(userID);
	}

	@Override
	public User saveUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public void removeUser(long id) {
		userRepository.delete(id);
	}

	@Override
	public List<Orders> getAllOrderByUser(User user) {
		return ordersRepository.findByUser(user);
	}

	@Override
	public List<Orders> getAllOrderByUserID(long userID) {
		User user = userRepository.findOne(userID);
		return getAllOrderByUser(user);
	}

	@Override
	public Orders newOrders(long userID) {
		User user = userRepository.findOne(userID);
		Orders orders = new Orders(user, false);
		ordersRepository.save(orders);
		return orders;
	}

	@Override
	public User getByUsernameUser(String username) {
		System.out.println("getByUsernameUser");
		return userRepository.findByUsername(username);

	}

}

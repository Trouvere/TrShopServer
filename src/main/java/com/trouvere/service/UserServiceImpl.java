package com.trouvere.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trouvere.entity.Orders;
import com.trouvere.entity.User1;
import com.trouvere.repository.OrdersRepository;
import com.trouvere.repository.User1Repository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private User1Repository userRepository;

	@Autowired
	private OrdersRepository ordersRepository;

	@Override
	public List<User1> getAllUser() {
		return (List<User1>) userRepository.findAll();
	}

	@Override
	public User1 getByIDUser(long userID) {
		return userRepository.findOne(userID);
	}

	@Override
	public User1 saveUser(User1 user) {
		return userRepository.save(user);
	}

	@Override
	public void removeUser(long id) {
		userRepository.delete(id);
	}

	@Override
	public List<Orders> getAllOrderByUser(User1 user) {
		return ordersRepository.findByUser(user);
	}

	@Override
	public List<Orders> getAllOrderByUserID(long userID) {
		User1 user = userRepository.findOne(userID);
		return getAllOrderByUser(user);
	}

	@Override
	public Orders newOrders(long userID) {
		User1 user = userRepository.findOne(userID);
		Orders orders = new Orders(user, false);
		ordersRepository.save(orders);
		return orders;
	}

}

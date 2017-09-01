package com.trouvere.service;

import java.util.List;

import com.trouvere.entity.Orders;
import com.trouvere.entity.User;

//Разделить на несколько сервисов
public interface UserService {

	List<User> getAllUser();

	User getByIDUser(long userID);

	User saveUser(User user);

	void removeUser(long id);

	List<Orders> getAllOrderByUser(User user);

	List<Orders> getAllOrderByUserID(long userID);

	Orders newOrders(long userID);

	User getByUsernameUser(String username);
}

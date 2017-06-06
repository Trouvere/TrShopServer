package com.trouvere.service;

import java.util.List;

import com.trouvere.entity.Orders;
import com.trouvere.entity.User1;

//Разделить на несколько сервисов
public interface UserService {

	List<User1> getAllUser();

	User1 getByIDUser(long userID);

	User1 saveUser(User1 user);

	void removeUser(long id);

	List<Orders> getAllOrderByUser(User1 user);

	List<Orders> getAllOrderByUserID(long userID);

	Orders newOrders(long userID);
}

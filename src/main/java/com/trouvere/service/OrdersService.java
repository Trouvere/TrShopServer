package com.trouvere.service;

import java.util.List;

import com.trouvere.entity.Orders;

//после
public interface OrdersService {

	List<Orders> getAllOrders();

	Orders getByIDOrders(long id);

	String saveOrders(Orders orders);

	String removeOrders(long id);

	Orders payOrders(long id);

	boolean isOrdersPaid(Orders orders);

}

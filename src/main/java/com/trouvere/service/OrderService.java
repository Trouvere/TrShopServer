package com.trouvere.service;

import java.util.List;

import com.trouvere.entity.Orders;

//после
public interface OrderService {

	List<Orders> getAllOrders();

	Orders getByIDOrder(long id);

	Orders saveOrders(Orders orders);

	void removeOrders(long id);

	List<Orders> getAllOrderByUser(long userID);

	Orders payOrder(long id);

	Orders addProductInOrder(long idOrder, long productID, Long quantity);

	String removeProductInOrder(long idOrder, long productID, Long quantity);

}

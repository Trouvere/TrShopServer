package com.trouvere.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.trouvere.entity.Orders;

@Service
public class OrderServiceImpl implements OrderService {

	@Override
	public List<Orders> getAllOrders() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Orders getByIDOrder(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Orders saveOrders(Orders orders) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeOrders(long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Orders> getAllOrderByUser(long userID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Orders payOrder(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Orders addProductInOrder(long idOrder, long productID, Long quantity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String removeProductInOrder(long idOrder, long productID, Long quantity) {
		// TODO Auto-generated method stub
		return null;
	}

}

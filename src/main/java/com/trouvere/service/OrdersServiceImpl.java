package com.trouvere.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trouvere.entity.Orders;
import com.trouvere.repository.OrdersRepository;

@Service
public class OrdersServiceImpl implements OrdersService {

	@Autowired
	private OrdersRepository ordersRepository;

	@Override
	public List<Orders> getAllOrders() {
		return (List<Orders>) ordersRepository.findAll();
	}

	@Override
	public Orders getByIDOrders(long id) {
		return ordersRepository.findOne(id);
	}

	@Override
	public String saveOrders(Orders orders) {
		String s;
		if (!isOrdersPaid(orders)) {
			ordersRepository.save(orders);
			s = "Orders saved";
		} else {
			s = "You can not change paid orders";
		}
		return s;
	}

	@Override
	public String removeOrders(long id) {
		Orders orders = ordersRepository.findOne(id);
		String s;
		if (!isOrdersPaid(orders)) {
			ordersRepository.delete(id);
			s = "Orders deleted";
		} else {
			// Нельзя изменять оплаченные заказы
			s = "You can not change paid orders";
		}
		return s;
	}

	@Override
	public Orders payOrders(long id) {
		Orders orders = ordersRepository.findOne(id);
		if (!isOrdersPaid(orders)) {
			Date ordersDate = new Date();
			orders.setOrdersDate(ordersDate);
			orders.setPaid(true);
			ordersRepository.save(orders);
		}
		return orders;
	}

	@Override
	public boolean isOrdersPaid(Orders orders) {
		return orders.getPaid();
	}

}

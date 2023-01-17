package com.prowess.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prowess.demo.Order;

@Service
public class OrderService {
	
	@Autowired
	private OrderDao orderDao;


	public void setOrderDao(OrderDao orderDao) {
		this.orderDao = orderDao;
	}
	
	public Order getOrder() {
		return orderDao.getOrders();
	}
	
	public Order getOrderInfo(Order order) {
		return orderDao.getOrdersInfo(order);
	}
	
	public List<Order> get(){
		Order order=new Order("ord123",1L);
		List<Order> listOrders= new ArrayList<>();
		listOrders.add(order);
		order=new Order("ord1234",2L);
		listOrders.add(order);
		return listOrders;
	}

	public Order save(Order order) {
		
		return order;
	}

	public Order get(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void delete(long id) {
		// TODO Auto-generated method stub
		
	}

	public Order update(Order order) {
		// TODO Auto-generated method stub
		return order;
	}
	

}

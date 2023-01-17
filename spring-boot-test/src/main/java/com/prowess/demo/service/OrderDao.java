package com.prowess.demo.service;

import org.springframework.stereotype.Service;

import com.prowess.demo.Order;
@Service
public class OrderDao {

	public Order getOrders() {
		Order order =new Order("sample", 343243L);
		//db.save
		
		return order;
	}
	
	public Order getOrdersInfo(Order order) {
		//Order order =new Order("sample", 343243L);
		//db.save
		Long orderNumber =order.getOrderNumber();
		//db.sve
		Long odre = orderNumber+34;
		order.setOrderNumber(odre);
		return order;
	}

}

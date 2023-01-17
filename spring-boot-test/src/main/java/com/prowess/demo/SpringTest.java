package com.prowess.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.prowess.demo.service.OrderService;

public class SpringTest {

	public static void main(String[] args) {
		{
	        ClassPathXmlApplicationContext ac = new  ClassPathXmlApplicationContext("spring-beans.xml");
	        Order order = (Order) ac.getBean("order");
	        String name = order.getName();
	        System.out.println("Order name: "+name);
	        long orderNumber = order.getOrderNumber();
	        System.out.println("Order number: "+orderNumber);
	        Order2 orderSetter = (Order2) ac.getBean("orderTwo");
	        System.out.println(orderSetter.getName()+"----"+orderSetter.getOrderNumber());
	        OrderService orderService = (OrderService) ac.getBean("orderService");
	        System.out.println(orderService.getOrder().getName()+"---"+orderService.getOrder().getOrderNumber());
	        
	        Order orderww =orderService.getOrderInfo(order);
	        System.out.println(orderww.getOrderNumber());
	        ac.close();
	    }

	}

}

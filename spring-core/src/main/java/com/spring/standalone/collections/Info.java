package com.spring.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Info {


	public static void main(String[] args) {
		
		ApplicationContext cxt= new ClassPathXmlApplicationContext("com/spring/standalone/collections/listconfig.xml");
		  ProductList pl= (ProductList) cxt.getBean("productlist");
		  System.out.println(pl);
		  
	}
}

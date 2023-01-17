package com.spring.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Info {


	public static void main(String[] args) {
		
		ApplicationContext cxt= new ClassPathXmlApplicationContext("com/spring/autowiring/listconfig.xml");
		  Employee emp= (Employee) cxt.getBean("employee");
		  System.out.println(emp);
		  
	}
}

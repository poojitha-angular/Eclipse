package com.list;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Info {


	public static void main(String[] args) {
		ApplicationContext cxt= new ClassPathXmlApplicationContext("com/list/listconfig.xml");
		  Hospital hsp= (Hospital) cxt.getBean("hospital");
		  System.out.println(hsp.getName());
		  System.out.println(hsp.getDepartments());
	}
}

package com.spring.reftype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Info {


	public static void main(String[] args) {
		
		ApplicationContext cxt= new ClassPathXmlApplicationContext("com/spring/reftype/listconfig.xml");
		  Student student= (Student) cxt.getBean("student");
		  System.out.println(student);
		  
		 
		  
		  
		  
	}
}

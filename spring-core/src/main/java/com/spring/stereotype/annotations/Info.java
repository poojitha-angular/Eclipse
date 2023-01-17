package com.spring.stereotype.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Info {


	public static void main(String[] args) {
		
		ApplicationContext cxt= new ClassPathXmlApplicationContext("com/spring/stereotype/annotations/listconfig.xml");
		  Instructor instructor= (Instructor) cxt.getBean("instructor");
		  System.out.println(instructor);
		  
	}
}

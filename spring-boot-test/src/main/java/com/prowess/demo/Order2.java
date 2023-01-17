package com.prowess.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Order2 implements InitializingBean,DisposableBean{
	
	 private String name;
	 private Long orderNumber;
	 
	    public String getName() {
	        return name;
	    }
	    public void setName(String name) {
	        this.name = name;
	    }
		public Long getOrderNumber() {
			return orderNumber;
		}
		public void setOrderNumber(Long orderNumber) {
			this.orderNumber = orderNumber;
		}
		@Override
		public void destroy() throws Exception {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void afterPropertiesSet() throws Exception {
			// TODO Auto-generated method stub
			
		}
	    

}

package com.prowess.demo;

public class Order {
	
	 private String name;
	 private Long orderNumber;
	 
	    public Order(String name, Long orderNumber) {
	        super();
	        this.name = name;
	        this.orderNumber = orderNumber;
	    }
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
	    

}

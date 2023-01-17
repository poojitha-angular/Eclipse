package com.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.service.InfoService;

@RestController
public class ProductController {
	
	//@Autowired
	//private InfoService infoService;

//mapping the getProduct() method to /product
	@GetMapping(value = "/test")
	public String getProduct() {
		InfoService infoService =new InfoService();
		return infoService.call("invoke");
	}
}

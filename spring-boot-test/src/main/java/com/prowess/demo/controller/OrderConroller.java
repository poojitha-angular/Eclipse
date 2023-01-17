package com.prowess.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prowess.demo.Order;
import com.prowess.demo.service.OrderService;

import io.swagger.annotations.ApiOperation;
import io.swagger.v3.oas.annotations.Operation;



@RestController
@RequestMapping("/v1/order")
public class OrderConroller {
	
	@Autowired
	private OrderService orderService;
	
	@GetMapping("/")
	@Operation(tags = {"Order"})
	@ApiOperation(value = "fetch all order Info", consumes = "application/json", response = Order.class)
	public List<Order> get() {
		return orderService.get();
	}
	
	@GetMapping("/{id}")
	@Operation(tags = {"Order"})
	@ApiOperation(value = "order Info by id", consumes = "application/json", response = Order.class)
	public Order get(@PathVariable("id") long id) {
		return orderService.get(id);
	}

	@PostMapping("/")
	@Operation(tags = {"Order"})
	@ApiOperation(value = "Create order", consumes = "application/json",produces = "application/json", response = Order.class)
	public ResponseEntity<Order> create(@RequestBody Order order) {
		Order order_dto = orderService.save(order);
		return new ResponseEntity<>(order_dto, HttpStatus.CREATED);
	}

	@PutMapping("/")
	@Operation(tags = {"Order"})
	@ApiOperation(value = "Update order", consumes = "application/json", response = Order.class)
	public ResponseEntity<Order> update(@RequestBody Order order) {
		Order order_dto = orderService.update(order);
		return new ResponseEntity<>(order_dto, HttpStatus.CREATED);
	}

	@DeleteMapping("/{id}")
	@Operation(tags = {"Order"})
	@ApiOperation(value = "Delete order", consumes = "application/json", response = Order.class)
	public String delete(@PathVariable("id") long id) {
		orderService.delete(id);
		return "deleted";
	}

}

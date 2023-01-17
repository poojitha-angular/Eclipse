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

import com.prowess.demo.dto.ProductDto;
import com.prowess.demo.service.ProductService;

import io.swagger.annotations.ApiOperation;
import io.swagger.v3.oas.annotations.Operation;



@RestController
@RequestMapping("/v1/product")
public class ProductConroller {
	
	@Autowired
	private ProductService productService;
	
	@GetMapping("/")
	@Operation(tags = {"ProductDto"})
	@ApiOperation(value = "fetch all ProductDto Info", consumes = "application/json", response = ProductDto.class)
	public List<ProductDto> get() {
		return productService.getAllRecords();
	}
	
	@GetMapping("/{id}")
	@Operation(tags = {"ProductDto"})
	@ApiOperation(value = "ProductDto Info by id", consumes = "application/json", response = ProductDto.class)
	public ProductDto get(@PathVariable("id") Integer id) {
		return productService.getById(id);
	}

	@PostMapping("/")
	@Operation(tags = {"ProductDto"})
	@ApiOperation(value = "Create ProductDto", consumes = "application/json",produces = "application/json", response = ProductDto.class)
	public ResponseEntity<ProductDto> create(@RequestBody ProductDto ProductDto) {
		ProductDto ProductDto_dto = productService.save(ProductDto);
		return new ResponseEntity<>(ProductDto_dto, HttpStatus.CREATED);
	}

	@PutMapping("/")
	@Operation(tags = {"ProductDto"})
	@ApiOperation(value = "Update ProductDto", consumes = "application/json", response = ProductDto.class)
	public ResponseEntity<ProductDto> update(@RequestBody ProductDto ProductDto) {
		ProductDto ProductDto_dto = productService.update(ProductDto);
		return new ResponseEntity<>(ProductDto_dto, HttpStatus.CREATED);
	}

	@DeleteMapping("/{id}")
	@Operation(tags = {"ProductDto"})
	@ApiOperation(value = "Delete ProductDto", consumes = "application/json", response = ProductDto.class)
	public String delete(@PathVariable("id") Integer id) {
		productService.delete(id);
		return "deleted";
	}

}

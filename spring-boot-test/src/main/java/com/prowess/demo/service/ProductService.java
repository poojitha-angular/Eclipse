package com.prowess.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prowess.demo.dto.ProductDto;
import com.prowess.demo.entities.Product;
import com.prowess.demo.repo.ProductRepo;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepo productRepo;
	
	public ProductDto save(ProductDto productDto) {
		Product product=new Product();
		product.setName(productDto.getName());
		product.setPrice(productDto.getPrice());
		Product prd=productRepo.save(product);
		productDto.setId(prd.getId());
		return productDto;
	}
	
	public ProductDto update(ProductDto productDto) {
		
		Product product=new Product();
		product.setName(productDto.getName());
		product.setPrice(productDto.getPrice());
		product.setId(productDto.getId());
		Product prd=productRepo.save(product);
		
		return productDto;
	}
	
	public List<ProductDto> getAllRecords() {

		List<ProductDto> productDtos =new ArrayList<>();
		List<Product> products=productRepo.findAll();
		for(Product prod:products) {
			ProductDto productDto=new ProductDto();
			productDto.setName(prod.getName());
			productDto.setPrice(prod.getPrice());
			productDto.setId(prod.getId());
			productDtos.add(productDto);
		}
		return productDtos;
	}
	
	public ProductDto getById(Integer id) {
		Product prod =productRepo.getById(id);
		ProductDto product=new ProductDto();
		product.setName(prod.getName());
		product.setPrice(prod.getPrice());
		product.setId(prod.getId());
		return product;
		
	}
	
	public void delete(Integer id) {
		Product product=new Product();
		product.setId(id);
		productRepo.delete(product);
	}

}

package com.prowess.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.prowess.demo.entities.Product;

@Repository
public interface ProductRepo  extends JpaRepository<Product, Integer> {
	
	@Query("Select prod from Product prod where prod.id =?0")
	public Product getProducts(Integer id);

}

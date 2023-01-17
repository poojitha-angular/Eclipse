package com.prowess.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Product {
	
public void listOfProducts() {
	ArrayList<ProductVO> prodlist=new ArrayList<>();
	
	prodlist.add(new ProductVO(1,"Apple",90000f));
	prodlist.add(new ProductVO(2,"Samsung",20000f));
	prodlist.add(new ProductVO(3,"HP",40000f));
	prodlist.add(new ProductVO(4,"Lenova",30000f));
	
	// Using Filter 
	List<Float> prodList2 = prodlist.stream().filter(p->p.price >30000).map(p->p.price).collect(Collectors.toList());
	System.out.println(prodList2);
	
	// Using count
	
	long count= prodlist.stream().filter(p->p.price < 910000).count();
	System.out.println(count);
	
	// toSet()
	Set<String> prodlist3= prodlist.stream().filter(p->p.prodName == "Apple").map(p->p.prodName).collect(Collectors.toSet());
	System.out.println(prodlist3);
	
	//filter & Foreach
	prodlist.stream().filter(p->p.price < 150000).forEach(p->System.out.println(p.prodName)); 
	
	//Sum by collector methods
	double totalPrice3 = prodlist.stream().collect(Collectors.summingDouble(product->product.price));  
    System.out.println(totalPrice3);
    
    
    
    
	
	
}
public static void main(String[] args) {
	Product product=new Product();
	product.listOfProducts();
}

}

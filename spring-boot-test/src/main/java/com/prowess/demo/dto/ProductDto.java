package com.prowess.demo.dto;


public class ProductDto {
    private Integer id;
    private String name;
    private float price;
 
    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public ProductDto() {
    }
 
    public ProductDto(Integer id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
 
    public Integer getId() {
        return id;
    }
 
    // other getters and setters...
}
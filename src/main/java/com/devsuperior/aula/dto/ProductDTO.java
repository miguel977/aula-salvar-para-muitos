package com.devsuperior.aula.dto;

import java.util.ArrayList;
import java.util.List;

import com.devsuperior.aula.entities.Category;
import com.devsuperior.aula.entities.Product;




public class ProductDTO {
	private Long id;
	private String name;
	private double price;
	
	private List<CategoryDTO> categories = new ArrayList<>();
	
	public ProductDTO() {
		
	}
	public ProductDTO(Long id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
	public ProductDTO(Product entity) {
		id = entity.getId();
		name = entity.getName();
		price = entity.getPrice();
		for(Category cat: entity.getCategories()){
			categories.add(new CategoryDTO(cat));
		}
		
	}
	public Long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
	public List<CategoryDTO> getCategories() {
		return categories;
	}
}

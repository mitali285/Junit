package com.yash.models;

public enum DrinksType {
	TEA("TEA", 10.0), COFFEE("COFFEE", 15.0), BLACK_COFFEE("BLACK_COFFEE", 10.0), BLACK_TEA("BLACK_TEA", 5.0);

	
	private final Double price;

	DrinksType(String name, Double price) {
	
		this.price = price;
	}

	

	public Double getPrice() {
		return price;
	}
	
}

package com.grocery.model;

import java.util.List;

public class ListProduct {
	private List<Product> allProducts;

	public List<Product> getAllProducts() {
		return allProducts;
	}

	public void setAllProducts(List<Product> allProducts) {
		this.allProducts = allProducts;
	}

	@Override
	public String toString() {
		return "ListProduct [allProducts=" + allProducts + "]";
	}
	
	

}

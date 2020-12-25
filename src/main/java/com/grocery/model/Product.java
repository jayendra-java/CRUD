package com.grocery.model;

import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;
@Entity
public class Product {
	@Id
	@Column(name = "id",unique=true,columnDefinition="VARCHAR(64)")
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;
	private String name;
	private String quantity;
	private String price;
	private String customerid;
	
	public String getCustomerid() {
		return customerid;
	}

	public void setCustomerid(String customerid) {
		this.customerid = customerid;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", quantity=" + quantity + ", price=" + price + ", customerid="
				+ customerid + "]";
	}

	
	

}

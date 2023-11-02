package com.boot.springbootrest.entity;

public class Product {
	private int id;
	private String pname;
	private double price;
	private int noofproduct;

//default constructor  
	public Product() {

	}

//constructor using fields  
	public Product(int id, String pname, double price, int noofproduct) {
		super();
		this.id = id;
		this.pname = pname;
		this.price = price;
		this.noofproduct = noofproduct;
	}

//getters and setters  
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getNoofproduct() {
		return noofproduct;
	}

	public void setNoofproduct(int noofproduct) {
		this.noofproduct = noofproduct;
	}
}
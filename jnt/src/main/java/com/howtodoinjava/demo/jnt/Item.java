package com.howtodoinjava.demo.jnt;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Item 
{
	private String model;
	private int qty;
	private String brand;
	private double price;
	private int id;
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString()
	{
		return "Item [brand=" + brand + ", model=" + model + ", qty=" + qty + ", price=" + price + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}

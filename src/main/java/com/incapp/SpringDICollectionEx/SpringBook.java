package com.incapp.SpringDICollectionEx;

import java.util.Map;


public class SpringBook {
	private String name;
	private double price;
	private Map author;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Map getAuthor() {
		return author;
	}
	public void setAuthor(Map author) {
		this.author = author;
	}
}

package com.incapp.SpringDICollectionEx;

import java.util.Set;

public class PythonBook {
	private String name;
	private double price;
	private Set author;
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
	public Set getAuthor() {
		return author;
	}
	public void setAuthor(Set author) {
		this.author = author;
	}
}

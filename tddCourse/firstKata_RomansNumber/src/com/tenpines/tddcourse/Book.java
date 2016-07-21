package com.tenpines.tddcourse;

import java.util.ArrayList;

public class Book {
	
	private String name;
	private int quantity;

	public Book() {
		quantity = 0;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


}

package com.tenpines.tddcourse;

import java.util.ArrayList;
import java.util.List;

public class Cart {
	
	private List<Book> books;
	
	public Cart() {
		books = new ArrayList<Book>();
	}

	public void addBook(Book book) {
		books.add(book);
	}
	
	public List<Book> getBooks() {
		return books;
	}

}

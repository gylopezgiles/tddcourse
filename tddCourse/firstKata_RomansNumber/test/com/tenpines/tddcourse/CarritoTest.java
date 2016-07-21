package com.tenpines.tddcourse;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class CarritoTest {

	/*
	Carrito 

	Given: un carito
	When: crear un carrito nuevo 
	Then: Assert carrito vacio


	Given: un carrito
	When: agrego un libro
	Then: Assert que el libro este


	Given: un carrito
	When: agrego mas de un libro
	Then: Assert que el libro este

	Given: un carrito
	When: agrego menos un libro
	Then: Assert excepcion


	Given: un carrito
	When: agrego varios de un libro
	Then: Assert que esten

	Given: un carrito
	When: agrego libro de otra editorial
	Then: Assert excepcion*/
	
	
	//isEmpty del carrito no de books
	@Test
	public void test001() {
		//Given: un carito
		Cart cart;
		//When: crear un carrito nuevo
		cart = new Cart();
		//Then: Assert carrito vacio
		List<Book> books = cart.getBooks(); 
		Assert.assertTrue(books.isEmpty());
	}
	
	@Test
	public void test002() {
		//Given: un carito
		Cart cart = new Cart();
		//When: agrego un libro
		Book book = new Book();
		book.setName("El Cantar de los Nibelungos");
		//Cambiar nombre de addBook por add
		cart.addBook(book);
		//Then: Assert que el libro este
		List<Book> books = cart.getBooks(); 
		Assert.assertTrue(books.size() == 1);
	}
	
	@Test
	public void test003() {
		//Given: un carito
		Cart cart = new Cart();
		//When: agrego mas de un libro
		Book book1 = new Book();
		book1.setName("El Cantar de los Nibelungos");
		cart.addBook(book1);
		Book book2 = new Book();
		book2.setName("Ten Little Niggers");
		cart.addBook(book2);
		//Then: Assert que el libro este
		List<Book> books = cart.getBooks(); 
		Assert.assertTrue(books.size() == 2);
	}
	
	@Test
	public void test004() {
		//Given: un carito
		Cart cart = new Cart();
		//When: agrego varios de un libro
		Book book = new Book();
		book.setName("El Cantar de los Nibelungos");
		book.setQuantity(2);
		//Then: Assert que haya la cantidad correcta de ese libro
		List<Book> books = cart.getBooks();
		//books.forEach(Assert.assertTrue(book.getQuantity() == 2));
	}

}

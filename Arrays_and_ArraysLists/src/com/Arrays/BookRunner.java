package com.Arrays;



public class BookRunner {
	public static void main(String[] args) {
		Book book = new Book(123, "Object Oriented Programming with Java", "Ranga");
		book.addReviews(new Reviews(10, "Great Book", 5));
		book.addReviews(new Reviews(101, "Awesome", 5));
		System.out.println(book);
	}

}

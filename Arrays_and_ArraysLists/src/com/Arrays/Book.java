package com.Arrays;
import java.util.ArrayList;

public class Book {
	private int id;
	private String name;
	private String author;
	private ArrayList<Reviews> rev = new ArrayList<>();

	public Book(int id, String name, String author) {
		this.name = name;
		this.id = id;
		this.author = author;
	}

	public void addReviews(Reviews revs) {
		// TODO Auto-generated method stub
		this.rev.add(revs);
	}

	@Override
	public String toString() {
		return String.format("id = %d name = %s author = %s Reviews = %s", id, name, author, rev);
	}
}

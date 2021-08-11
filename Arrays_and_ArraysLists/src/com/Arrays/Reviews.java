package com.Arrays;

public class Reviews {
	private int id;
	private String description;
	private double rating;

	public Reviews(int id, String description, double rating) {
		super();
		this.id = id;
		this.description = description;
		this.rating = rating;
	}

	@Override
	public String toString() {
		return id + " " + description + " " + rating + " ";
	}

}

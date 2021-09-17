package com.app.core;

import java.text.SimpleDateFormat;
import java.util.Date;
import com.app.core.Category;

/*1. Store book details in a library in hashing based data structure : HashSet
Book details : title(string),category(enum),price(double),publishDate,authorName(string),quantity(int)
Unique ID : book title
Accept at least 5 book details from user & confirm if hash set is working in a correct manner.*/

public class Book {
	private String title;
    private Category category;
	private double price;
	private Date publishDate;
	private String authorName;
	private int quantity;
	public static SimpleDateFormat sdf;
	
	static {
		sdf = new SimpleDateFormat("dd-MM-yyyy");
	}

	public Book(String title, Category category, double price, Date publishDate, String authorName, int quantity) {
		super();
		this.title = title;
		this.category = category;
		this.price = price;
		this.publishDate = publishDate;
		this.authorName = authorName;
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", category=" + category + ", price=" + price + ", publishDate=" + sdf.format(publishDate)
				+ ", authorName=" + authorName + ", quantity=" + quantity + "]";
	}

	@Override
	public int hashCode() {
		return title.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Book) {
			return title.equals(((Book)obj).title);
		}
		return false;
	}
}

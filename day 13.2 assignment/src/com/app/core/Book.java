package com.app.core;

import java.text.SimpleDateFormat;

import java.util.Date;
import com.app.core.Category;

/* 
Book details : title(string),category(enum),price(double),publishDate,authorName(string),quantity(Int)
Unique ID : book title*/
public class Book {
	private String title; //pk
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

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Category getCategory() {
		return category;
	}

	public double getPrice() {
		return price;
	}

	public Date getPublishDate() {
		return publishDate;
	}

	public String getAuthorName() {
		return authorName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public static SimpleDateFormat getSdf() {
		return sdf;
	}
}

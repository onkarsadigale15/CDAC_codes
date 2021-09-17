package com.app.core;

import java.text.SimpleDateFormat;
import java.util.Date;

public class BookStore {


	// title(string),category(enum),price(double),publishDate,authorName(string),quantity(int)
	private String title;
	private BookType catagory;
	private double price;
	private Date pdate;
	private String authorNmae;
	private int quantity;
	public static SimpleDateFormat sdf;
	static {
		sdf=new SimpleDateFormat("dd-MM-yyyy");
	}
	public BookStore(String title, BookType catagory, double price, Date pdate, String authorNmae, int quantity) {
		super();
		this.title = title;
		this.catagory = catagory;
		this.price = price;
		this.pdate = pdate;
		this.authorNmae = authorNmae;
		this.quantity = quantity;
	}
	public double setQuantity(int quantity) {
		return this.quantity = quantity;
	}
	public String getTitle() {
		return title;
	}
	public BookType getCatagory() {
		return catagory;
	}
	public double getPrice() {
		return price;
	}
	public Date getPdate() {
		return pdate;
	}
	public String getAuthorNmae() {
		return authorNmae;
	}
	public int getQuantity() {
		return quantity-1;
	}
	public static SimpleDateFormat getSdf() {
		return sdf;
	}
	@Override
	public String toString() {
		return "BookStore [title=" + title + ", catagory=" + catagory + ", price=" + price + ", pdate=" + pdate
				+ ", authorNmae=" + authorNmae + ", quantity=" + quantity + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BookStore other = (BookStore) obj;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

}

package com.app.core;


//CustomerType : SILVER,GOLD,PLATINUM
public enum Category {
	SILVER,GOLD,PLATINUM;

	@Override
	public String toString() {
	
		return "Category " + name().toLowerCase();
	}
	

}


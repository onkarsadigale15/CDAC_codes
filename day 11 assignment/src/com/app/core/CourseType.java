package com.app.core;

public enum CourseType {
	DBT,REACT,ANGULAR,REST,SPRING,HIBERNATE;
	
	public String toString() {
		return name().toUpperCase();
	}

}

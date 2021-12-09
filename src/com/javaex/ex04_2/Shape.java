package com.javaex.ex04_2;

public abstract class Shape {
	
	private int countSides; // 변의 수
	
	public Shape() {
		
	}
	
	public Shape(int countSides) {
		this.countSides = countSides;
	}

	public int getCountSides() {
		return countSides;
	}

	public void setCountSides(int countSides) {
		this.countSides = countSides;
	}
	
	public abstract double getArea();
	
	public abstract double getPerimeter();
}

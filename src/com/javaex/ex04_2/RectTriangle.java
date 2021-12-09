package com.javaex.ex04_2;

public class RectTriangle extends Shape{

	private int height;
	private int width;
	
	public RectTriangle() {
		
	}
	
	public RectTriangle(int height, int width) {
		this.height = height;
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}
	
	@Override
	public double getArea() {
		return width*height*0.5;
	}
	
	@Override
	public double getPerimeter() {
		return width + height + Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
	}
	
}

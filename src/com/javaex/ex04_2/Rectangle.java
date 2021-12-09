package com.javaex.ex04_2;

public class Rectangle extends Shape implements Resizeable {

	private double width;
	private double height;
	
	public Rectangle() {
		
	}
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	@Override
	public double getArea() {
		return width * height;
	}
	
	@Override
	public double getPerimeter() {
		return 2*(width+height);
	}
	
	@Override
	public void resize(double s) {
		this.width = width * s;
		this.height = height * s;
	}
}

package org.campus02.Flaechenberechnung;

public class Rectangle implements Figure {
	private double length;
	private double width;
	
	
	
	public Rectangle(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return (length*2 + width*2);
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return (length* width);
	}

}

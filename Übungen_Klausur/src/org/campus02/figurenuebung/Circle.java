package org.campus02.figurenuebung;

public class Circle extends Figure {
private double radius;


	public Circle(double radius) {
	super();
	this.radius = radius;
}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 2*radius*Math.PI;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return ((radius*radius)/2)*Math.PI;
	}

}

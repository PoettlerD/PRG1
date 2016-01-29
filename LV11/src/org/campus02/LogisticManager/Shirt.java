package org.campus02.LogisticManager;



public class Shirt implements Moveable {
	private String Brand;
	private int Size;
	private String Color;
	
	
	public Shirt(String brand, int size, String color) {
		super();
		Brand = brand;
		Size = size;
		Color = color;
	}


	@Override
	public void move(String destination) {
		// TODO Auto-generated method stub
		System.out.println(Color+" "+Brand+" Shirt, size "+Size+" moved to "+destination);
	}
}

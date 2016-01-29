package org.campus02.Tiere;

public class Bird extends Animal implements Fly {

	public Bird(String name, String color, int countEyes) {
		super(name, color, countEyes);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("Der Vogel hüpf herum!!");
	}

	@Override
	public void makeNoise() {
		// TODO Auto-generated method stub
		System.out.println("Twitter !!");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
	
		System.out.println("Vogel hebt ab!!");
	}

}

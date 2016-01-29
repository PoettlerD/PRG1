package org.campus02.Tiere;


public class Dog extends Animal implements Fly {

	public Dog(String name, String color, int countEyes) {
		super(name, color, countEyes);
		
		// TODO Auto-generated constructor stub
	}

	@Override
	public void walk() {
		System.out.println("Läuft blöd rum");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void makeNoise() {
		// TODO Auto-generated method stub
		System.out.println("WAU WAU");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("Ein fliegender Hund!!! 11elf");
	}
	
	

}

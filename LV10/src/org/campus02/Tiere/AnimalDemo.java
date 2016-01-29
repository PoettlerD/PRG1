package org.campus02.Tiere;

public class AnimalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal test = new Dog("Hund", "Braun", 2);
			
		test.walk();
		test.makeNoise();
		
		Dog Hund = (Dog) test;
		
		Hund.fly();
		
		
		Bird tweety = new Bird("Tweety", "Blau", 2);
	//	Animal test1   = new Animal("Hund", "Braun", 2);
		tweety.fly();
		
		Fly f = tweety;
		
		f.fly();
		}

	}


package org.campus02.LogisticManager;

import java.util.ArrayList;
import java.util.HashMap;

public class LogisticManagerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LogisticManager manager1 = new LogisticManager(new ArrayList<Moveable>());
	
		Moveable blueGolf = new Car("VW Golf", "blue", 1300);
		Moveable blackAudi = new Car("Audi A8", "black", 2000);
		Moveable redFerrari = new Car("Ferrari 488GTB", "red", 1400);
		Moveable redFiat = new Car("Fiat Panda", "red", 1100);
		
		Moveable greenShirt = new Shirt("Brand1", 6, "green");
		Moveable redShirt = new Shirt("Brand2", 4, "red");
		Moveable yellowShirt = new Shirt("Brand3", 5, "yellow");
		
		
		manager1.addObj(blueGolf);
		manager1.addObj(blackAudi);
		manager1.addObj(redFerrari);
		manager1.addObj(greenShirt);
		manager1.addObj(redShirt);
		manager1.addObj(yellowShirt);
		manager1.addObj(redFiat);
		manager1.moveAll("Graz");
		
		
		blueGolf.move("Wien");
		
		ArrayList<Car> cars = new ArrayList<>();
		cars.add((Car)blueGolf);
		cars.add((Car)blackAudi);
		cars.add((Car)redFerrari);
		cars.add((Car)redFiat);
		//HashMap<String, Integer> test123 = getCarsByColor(cars);
		System.out.println("////////////////!!!!HASHMAP!!!!///////////////////////////");
		System.out.println(getCarsByColor(cars));
		System.out.println("/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\");
	}

	
	public static HashMap<String, Integer> getCarsByColor(ArrayList<Car> cars)
	
	{
		HashMap<String, Integer> carmap = new HashMap<>();
	
		for (Car car : cars) {
			if (!carmap.containsKey(car.getColor()))
					{
				carmap.put(car.getColor(), 1);
					}
			else
			{
				carmap.put(car.getColor(),carmap.get(car.getColor())+1);
			}
		
		}
		
		return carmap;
		
	}

}

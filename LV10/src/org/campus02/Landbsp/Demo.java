package org.campus02.Landbsp;

import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		Bundesland bland1 = new Bundesland(12349123123.12);
		Bundesland bland2 = new Bundesland(42449123123.12);
		Bundesland bland3 = new Bundesland(1234912313.12);
		
		Bundesstaat bstaat1 = new Bundesstaat(new ArrayList<Land>());
		
		bstaat1.addLand(bland1);
		bstaat1.addLand(bland2);
		bstaat1.addLand(bland3);
		
		System.out.println(bstaat1.getBruttoSozialprodukt());
		
		
	}

}

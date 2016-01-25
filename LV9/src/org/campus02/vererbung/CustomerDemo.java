package org.campus02.vererbung;

public class CustomerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Customer Kunde1 = new Customer("David", "Poettler", 24);
		
		
		System.out.println(Kunde1.toString());
		
		
		Customer Kunde2 = new Customer("David123", "Poettler123", 26);
		
		System.out.println(Kunde2.toString());
		
	}

}

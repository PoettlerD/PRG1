package org.campus02.blackjack;

public class DemoBj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Blackjack bj = new Blackjack();
		
		Player p1 = new Player("David", 23);
		Player p2 = new Player("Hans", 33);
		Player p3 = new Player("Michl", 43);

		
		
		
		System.out.println("added "+p1+ "? "+bj.add(p1));
		System.out.println("added "+p2+ "? "+bj.add(p2));
		System.out.println("added "+p3+ "? "+bj.add(p3));
		
		System.out.println("added "+p2+ "? "+bj.add(p2));
		
		bj.addCard(p1, 3);
		bj.addCard(p1, 3);
		
		System.out.println(bj.toString());
	}

}

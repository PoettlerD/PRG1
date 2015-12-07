package org.campus02.VierGewinnt;

public class VierGewinntDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		VierGewinnt Spiel1 = new VierGewinnt(4, 4);
		
		Spiel1.playerA(1, 4);
		System.out.println( Spiel1.winner());
		Spiel1.playerA(1, 3);
		System.out.println( Spiel1.winner());
		Spiel1.playerA(1, 2);
		System.out.println( Spiel1.winner());
		Spiel1.playerA(1, 1);
		System.out.println( Spiel1.winner());

System.out.println("__________________________________________________");
		Spiel1.print();
	
	
	}	

}

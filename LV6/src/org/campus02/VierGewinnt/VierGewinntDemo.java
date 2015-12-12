package org.campus02.VierGewinnt;

public class VierGewinntDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		VierGewinnt Spiel1 = new VierGewinnt(4, 4);
		
		Spiel1.playerA(0, 1);
		System.out.println( Spiel1.winner());
		Spiel1.playerA(1, 1);
		System.out.println( Spiel1.winner());
		Spiel1.playerA(2, 1);
		System.out.println( Spiel1.winner());
		Spiel1.playerA(3, 1);
		System.out.println( Spiel1.winner());
		Spiel1.playerB(1, 2);
		System.out.println( Spiel1.winner());
		Spiel1.playerB(2, 2);
		System.out.println( Spiel1.winner());

System.out.println("__________________________________________________");
		Spiel1.print();
	
	
		
		
		
		
		
		VierGewinnt Spiel2 = new VierGewinnt(5, 5);
		Spiel2.playerAecht(1);
		Spiel2.playerBecht(2);
		Spiel2.playerAecht(1);
		Spiel2.playerBecht(3);
		Spiel2.playerAecht(1);
		Spiel2.playerBecht(1);
		Spiel2.playerAecht(2);
		Spiel2.playerBecht(1);
		Spiel2.playerBecht(1);
		Spiel2.playerAecht(3);
		Spiel2.playerAecht(4);
		System.out.println("__________________________________________________");
		Spiel2.print();
	}	

}

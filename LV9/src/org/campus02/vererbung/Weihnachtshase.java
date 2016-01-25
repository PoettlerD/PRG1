package org.campus02.vererbung;

public class Weihnachtshase extends Hase {

	public Weihnachtshase(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public void geschenke_verteilen()
	{
		System.out.println(Name+" verteilt Geschenke!!!! TOLLLLL");
	}

	@Override
	public void schlafen() {
		// TODO Auto-generated method stub
		System.out.println(Name + "schläft da Weihnachten vorbei ist.");
		
		
	}

	@Override
	public void fressen() {
		// TODO Auto-generated method stub
		System.out.println(Name + " frisst Schnee");
	}

}

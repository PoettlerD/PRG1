package org.campus02.vererbung;

import javax.naming.event.NamespaceChangeListener;

public class Osterhase extends Hase {

	public Osterhase(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}


	public void eier_verstecken()
	{
		System.out.println(Name+" verstecke Eier!!!! NÖÖÖÖÖÖÖ");
	}


	@Override
	public void fressen() {
		// TODO Auto-generated method stub
		System.out.println(Name + " frisst gras!");
	}


	


}

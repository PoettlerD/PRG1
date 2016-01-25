package org.campus02.vererbung;

public class Hase {

	protected String Name;
	
	public void schlafen ()
	{
		System.out.println(Name + " schläft");
	}
	
	public void fressen ()
	{
		System.out.println(Name + " frisst");
	}
	

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public Hase(String name) {
		super();
		Name = name;
	}
	
}

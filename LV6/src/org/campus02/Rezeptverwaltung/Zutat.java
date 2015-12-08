package org.campus02.Rezeptverwaltung;

public class Zutat {
	
	private String Name;
	private int Menge;
	
	public Zutat(String Name, int Menge)
	{
		this.Name = Name;
		this.Menge = Menge;
	}

	
	public String getName()
	{
		return Name;
	}

	public int getMenge()
	{
		return Menge;
	}




}

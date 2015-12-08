package org.campus02.Bestellverwaltung;

public class Bestellzeile {

	
	private String Name;
	private int Menge;
	private int Preis;
	
	public Bestellzeile(String Name, int Menge, int Preis)
	{
		this.Name = Name;
		this.Menge = Menge;
		this.Preis = Preis;
	}

	public String getName()
	{
		return Name;
	}

	public int getMenge()
	{
		return Menge;
		
	}

	public int getPreis()
	{
		return Preis;
	}

	public double getKosten()
	{
		return Menge*Preis;
	}


}

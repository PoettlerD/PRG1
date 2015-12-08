package org.campus02.Bestellverwaltung;

public class Bestellung {

	private String Nummer;
	private Bestellzeile[] Zeilen;
	
	public Bestellung(String Nummer, Bestellzeile[] Zeilen)
	{
		this.Nummer = Nummer;
		this.Zeilen = Zeilen;
	}

	public String getNummer()
	{
		return Nummer;
	}

	
	public Bestellzeile[] getZeilen()
	{
		return Zeilen;
	}


	public void printBestellung()
	{
		System.out.println("Bestellnummer: "+Nummer);
		int i = 0;
		while (i < Zeilen.length)
		{
			System.out.println("Menge: "+Zeilen[i].getMenge());
			System.out.println("Name: "+Zeilen[i].getName());
			System.out.println("Preis: "+Zeilen[i].getPreis());
			System.out.println("Gesamtkosten: "+Zeilen[i].getKosten());
			i++;
		}
	
	
	
	}
	
	public double getKosten()
	{
		double Gesamtkosten = 0;
		for (int i = 0; i < Zeilen.length; i++)
		{
			Gesamtkosten += Zeilen[i].getKosten();	
		}
	return Gesamtkosten;
	
	}
	
	
	
	

}

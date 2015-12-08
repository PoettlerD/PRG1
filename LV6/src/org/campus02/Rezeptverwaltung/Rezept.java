package org.campus02.Rezeptverwaltung;

public class Rezept {

	
	private String Name;
	private byte Personen;
	private Zutat[] Zutaten;
	
	
	public Rezept(String Name, byte Personen, Zutat[] Zutaten)
	{
		this.Name = Name;
		this.Personen = Personen;
		this.Zutaten = Zutaten;
	}
	
	
	public String getName(){
		return Name;
	}

public byte getPersonen()
{
	return Personen;
}

public Zutat[] getZutaten()
{
	return Zutaten;
}

public void printRezept()
{
	System.out.println("Rezeptname: "+Name);
	System.out.println("Anzahl der Personen: "+Personen);
	for (int i =0; i < Zutaten.length; i++ )
	{
		System.out.print(Zutaten[i].getName()+": ");
		System.out.println(Zutaten[i].getMenge());
	}
}

public Rezept umrechnen(int Personen)
{
	 
	byte PersonenNeu = (byte) Personen;
	Zutat[] ZutatenNeu = new Zutat[this.getZutaten().length];
	for (int i=0; i < Zutaten.length; i++)
	{
		
		int MengeAlt= Zutaten[i].getMenge();
		int Menge = (MengeAlt/this.Personen)*Personen;
		ZutatenNeu[i] = new Zutat(Zutaten[i].getName(), Menge);
	}
	return new Rezept(this.getName(), PersonenNeu, ZutatenNeu);
	
}

}

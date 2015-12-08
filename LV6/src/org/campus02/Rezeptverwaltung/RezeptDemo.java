package org.campus02.Rezeptverwaltung;

public class RezeptDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Zutat Mehl = new Zutat("Mehl", 100);
		Zutat Zucker = new Zutat("Zucker", 10);
		Zutat Salz = new Zutat("Salz", 3);
		Zutat[] Zutaten = new Zutat[] {Mehl,Zucker,Salz};
		byte Personen = 2;
		
		Rezept Rezept1 = new Rezept("Kuchen",Personen,Zutaten);
		Rezept1.printRezept();
		Rezept Rezeptneu = Rezept1.umrechnen(4);
		Rezeptneu.printRezept();
		}

}

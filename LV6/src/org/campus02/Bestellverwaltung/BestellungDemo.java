package org.campus02.Bestellverwaltung;

public class BestellungDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Bestellzeile[] Bestellung = new Bestellzeile[] {new Bestellzeile("Schraube", 5000, 1),new Bestellzeile("Schraube", 5000, 1)};
	Bestellzeile[] Bestellung2 = new Bestellzeile[5];
	Bestellung2[1] = new Bestellzeile("Laptop", 1, 1500);
		
		
		//Bestellung Bestellung1 = new Bestellung("1",new Bestellzeile[] {new Bestellzeile("Schraube", 5000, 1),new Bestellzeile("Schraubendreher", 5, 15)});
		
	Bestellung Bestellung1 = new Bestellung("1",Bestellung);
	
		System.out.println("Gesamtkosten für Bestellung "+Bestellung1.getKosten());
		Bestellung1.printBestellung();
		
	}

}

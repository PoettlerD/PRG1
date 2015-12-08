package org.campus02.Bestellverwaltung;

public class BestellungDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Bestellzeile[] Zeile1 = new Bestellzeile[] {new Bestellzeile("Schraube", 5000, 1)};

		
		
		Bestellung Bestellung1 = new Bestellung("1",new Bestellzeile[] {new Bestellzeile("Schraube", 5000, 1),new Bestellzeile("Schraubendreher", 5, 15)});
		
		System.out.println(Bestellung1.getKosten());
		Bestellung1.printBestellung();
		
	}

}

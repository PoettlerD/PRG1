package org.campus02.vererbung;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.Wildcard;

public class HaseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Osterhase oHase = new Osterhase("Osterhase Fritz");
		Weihnachtshase wHase = new Weihnachtshase("Weihnachtshase Karl");
		Hase hase = new Hase("Sepp");
		
		oHase.eier_verstecken();
		wHase.geschenke_verteilen();
		
		oHase.schlafen();
		
		
		
		
		wHase.schlafen();
		wHase.fressen();
		oHase.fressen();
		hase.fressen();
		
		
		
		
	}

}

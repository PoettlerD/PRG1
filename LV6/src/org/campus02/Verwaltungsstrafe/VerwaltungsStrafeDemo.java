package org.campus02.Verwaltungsstrafe;

import com.sun.xml.internal.bind.v2.runtime.reflect.Accessor.GetterSetterReflection;

public class VerwaltungsStrafeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Verwaltungsstrafe Straefling1 = new Verwaltungsstrafe("David", "Poettler", "G302MV");
		Verwaltungsstrafe Straefling2 = new Verwaltungsstrafe("Michl", "Test", "LN379CD");
		
		Straefling1.alkohol(1.9);
		Straefling1.strafe(85);
		Straefling2.sonstiges(687.78);
		System.out.println(Straefling1.getAnzahl());
 		System.out.println(Straefling1.getStrafe());
		System.out.println(Straefling2.getAnzahl());
 		System.out.println(Straefling2.getStrafe());
 		
 	System.out.println(Straefling1.getStrafnummer());
		
		
	}

}

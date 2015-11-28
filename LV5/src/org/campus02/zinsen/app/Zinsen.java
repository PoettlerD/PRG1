package org.campus02.zinsen.app;

import org.campus02.zinsen.biz.CaclulateZinsen;





public class Zinsen {
	


	
	public static void main (String[] args){
		CaclulateZinsen Zinsen = new CaclulateZinsen(2.25);
	System.out.println(Zinsen.Zinsberechnung(15237.123, 365.0, Zinsen.getZinssatz()));
	}
	

}

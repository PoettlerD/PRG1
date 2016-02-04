package org.campus02.pascalschesdreieck;

public class pasdrei {
	public static int function_pascal(int zeile, int spalte) {
		if (spalte==0 || spalte==zeile)
		 return 1;
		return function_pascal(zeile-1,spalte) + function_pascal(zeile-1,spalte-1);
		}

		public static void main(String[] args) {
		for (int zeile=0; zeile<10; zeile++) {
		for (int spalte=0; spalte<=zeile; spalte++) {
		System.out.print(function_pascal(zeile, spalte) + " ");
		}
		System.out.println();
		}
		int wert = function_pascal( 2 , 1);
		System.out.println("----------------------------" );
		System.out.println(String.format("Zahl ist%s",wert));
		}
}

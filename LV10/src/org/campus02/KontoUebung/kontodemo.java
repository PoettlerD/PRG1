package org.campus02.KontoUebung;

import java.util.ArrayList;
import java.util.HashMap;

public class kontodemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Konto test = new Konto("Testmaxi");

test.einzahlen(100.0);
test.einzahlen(271.0);

test.auszahlen(123.12);

System.out.println(test.kontostand);



GiroKonto test1 = new GiroKonto("Testmaxi", 1000);
System.out.println(test1.kontostand);
test1.einzahlen(999.0);
test1.auszahlen(1000.0);
System.out.println(test1.kontostand);
test1.auszahlen(1000.0);
System.out.println(test1.kontostand);


Sparkonto testspar = new Sparkonto("Testsparer");

testspar.einzahlen(100.0);
testspar.auszahlen(99.0);
System.out.println(testspar.kontostand);
testspar.auszahlen(2.0);
System.out.println(testspar.kontostand);


System.out.println("/////////////////");


Jugendkonto jugend1 = new Jugendkonto("Jugendtyp", 50.0, 100.0);
	jugend1.einzahlen(200.0);
jugend1.auszahlen(90.0);


Konto castKonto = (Konto) jugend1;

castKonto.einzahlen(1000.0);
System.out.println("*******");
System.out.println(castKonto.kontostand);
castKonto.auszahlen(999.0);
System.out.println(castKonto.kontostand);
GiroKonto castGiro = (GiroKonto) castKonto;
castGiro.einzahlen(100.0);
System.out.println(castKonto.kontostand);
castGiro.auszahlen(150.0);
System.out.println(castKonto.kontostand);


Konto k1 = new Konto("Matthias");
GiroKonto k2 = new GiroKonto("Matthias", 1000);
Jugendkonto k3 = new Jugendkonto("Matthias", 1000,500);

Konto k4 = new Konto("Max");
GiroKonto k5 = new GiroKonto("Max", 1000);
Jugendkonto k6 = new Jugendkonto("Max", 1000,500);



ArrayList<Konto> Kontoliste = new ArrayList<>();

Kontoliste.add(k1);
Kontoliste.add(k2);
Kontoliste.add(k3);
Kontoliste.add(k4);
Kontoliste.add(k5);
Kontoliste.add(k6);
HashMap<String, Integer> map = new HashMap<>();

for (Konto konto : Kontoliste) {
	if (!map.containsKey(konto.inhaber))
	{
		map.put(konto.inhaber, 1);
	}
	else
	{
		int value = map.get(konto.inhaber);
		map.put(konto.inhaber, value+1);
	}
}

System.out.println(map.toString());

	}
}

package org.campus02.KontoUebung;

public class Sparkonto extends Konto {

	public Sparkonto(String inhaber) {
		super(inhaber);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void auszahlen(double wert) {
		// TODO Auto-generated method stub
		if (kontostand-wert >=0)
		{
			kontostand = kontostand-wert;
		}
	}
	
	

}

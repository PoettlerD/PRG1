package org.campus02.KontoUebung;

public class GiroKonto extends Konto {

	protected double limit;
	
	public GiroKonto(String inhaber, double limit) {
		super(inhaber);
		this.limit = limit;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void auszahlen(double wert) {
		// TODO Auto-generated method stub
		
		if (kontostand - wert >= -limit)
		{
			kontostand = kontostand-wert;
		}
	}

	
	
	
	
}

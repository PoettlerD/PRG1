package org.campus02.KontoUebung;

public class Jugendkonto extends GiroKonto {

	protected double buchungslimit;
	
	public Jugendkonto(String inhaber, double limit, double buchungslimit) {
		super(inhaber, limit);
		this.buchungslimit = buchungslimit;
	}

	@Override
	public void auszahlen(double wert) {
		// TODO Auto-generated method stub
		if ((kontostand - wert >= -limit) && (buchungslimit >= wert))
		{
			kontostand = kontostand-wert;
		}
	}

	
	
	
}

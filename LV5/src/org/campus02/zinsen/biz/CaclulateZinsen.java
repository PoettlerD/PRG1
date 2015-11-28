package org.campus02.zinsen.biz;

public class CaclulateZinsen {

	private double Kapaital;
	private double Tage;
	private double Zinssatz;
	
	public CaclulateZinsen(double Zinssatz)
	{

		this.Zinssatz = Zinssatz;
		
	}
	
	
	public double getKapaital() {
		return Kapaital;
	}


	public void setKapaital(double kapaital) {
		Kapaital = kapaital;
	}


	public double getTage() {
		return Tage;
	}


	public void setTage(double tage) {
		Tage = tage;
	}


	public double getZinssatz() {
		return Zinssatz;
	}


	public CaclulateZinsen(double Kapital,double Tage, double Zinssatz)
	{
		this.Kapaital = Kapital;
		this.Tage = Tage;
		this.Zinssatz = Zinssatz;
		
	}
	
	public double Zinsberechnung (double Kapital, double Laufzeit, double Zinssatz)
	{
		double Zinsen = (Kapital*Laufzeit*Zinssatz)/36000.0;
		
		return Zinsen;
	}
	
	
	
}

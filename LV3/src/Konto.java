
public class Konto {

	private String Inhaber;
	private double Kontostand;
	
	
	public void setInhaber(String Inhaber)
	{
		this.Inhaber = Inhaber;
		this.Kontostand = 0;
	}

	public void aufbauchen (double Betrag)
	{
		this.Kontostand += Betrag;
	}

	public double getKontostand()
	{
	return Kontostand;	
	}
	
	
	public void abbuchen(double Betrag)
	{
		if (this.Kontostand <= Betrag)
		{
			System.out.println("Abbuchung kann nicht ausgeführt werden da der Kontostand zu gering ist!");
		}
		else
		{
			this.Kontostand -= Betrag; 
		}
	}
	
}

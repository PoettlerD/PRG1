package org.campus02.Verwaltungsstrafe;

public class Verwaltungsstrafe {

	
	private String vorname;
	private String nachname;
	private String kennzeichen;
	private static int strafnummer = 0;
	private double strafe;
	private byte Anzahl;
	
	
	public Verwaltungsstrafe(String vorname, String nachname, String kennzeichen)
	{
		this.vorname = vorname;
		this.nachname = nachname;
		this.kennzeichen = kennzeichen;
		Anzahl = 0;
	}

public String getNachname()
{
return nachname;	
}

public String getVorname()
{
	return vorname;
}

public String getKennzeichen()
{
	return kennzeichen;
}

public int getStrafnummer()
{
	return strafnummer;
}

public double getStrafe()
{
	if (Anzahl == 1)
	{
	return strafe*0.7;
	}
	else if (Anzahl == 2)
	{
		return strafe*0.8;
	}
	else if (Anzahl == 3)
	{
		return strafe*0.8;
	}
	else if (Anzahl >= 4)
	{
		return strafe;
	}
	return strafe;
}

public byte getAnzahl()
{
	return Anzahl;
}

public void strafe(int geschwindigkeitsueberschreitung) 
{
	strafnummer++;
	
	if (geschwindigkeitsueberschreitung > 100)
	{
		strafe += 1500.0;
	}
	if (geschwindigkeitsueberschreitung >= 50 && geschwindigkeitsueberschreitung <100)
	{
		strafe += 500.0;
	}
	if (geschwindigkeitsueberschreitung >= 30 && geschwindigkeitsueberschreitung <50)
	{
		strafe += 100.0;
	}
	if (geschwindigkeitsueberschreitung >= 20 && geschwindigkeitsueberschreitung <30)
	{
		strafe += 50.0;
	}
	if (geschwindigkeitsueberschreitung < 20)
	{
		strafe += 30.0; 
	}

	
	Anzahl++;

}



public void verbandspaket() 
{
	strafnummer++;
	strafe += 25.0;
	Anzahl++;
	
}


public void alkohol(double Alkoholspiegel )
{
	strafnummer++;
	byte Anzahl2 = 2;
	Anzahl = (byte) (Anzahl + Anzahl2);
	if (Alkoholspiegel > 3.0)
	{
		strafe += 5000.0;
	}

	if (Alkoholspiegel >=2.0 && Alkoholspiegel < 3.0)
	{
		strafe += 1000.0;
	}
	if (Alkoholspiegel >=1.0 && Alkoholspiegel < 2.0)
	{
		strafe += 400.0;
	}
	if (Alkoholspiegel >=0.5 && Alkoholspiegel < 1.0)
	{
		strafe += 100.0;
	}

}

public void sonstiges(double wert) 
{
	strafnummer++;
	strafe += wert;
	Anzahl++;
}

}

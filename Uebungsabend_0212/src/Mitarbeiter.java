
public class Mitarbeiter {

	
	private String Vorname;
	private String Nachname;
	private int Mitarbeiternummer;
	private double Gehalt;
	private int Alter;
	private static int counter = 1;


public Mitarbeiter(String Vorname, String Nachname, double Gehalt)
{
	counter++;
this.Vorname = Vorname;
this.Nachname = Nachname;
this.Gehalt = Gehalt;
this.Mitarbeiternummer = counter;
}

public String getVorname()
{
return Vorname;	
}

public String getNachname()
{
return Nachname;
}

public int getMitarbeiternummer()
{
	return Mitarbeiternummer;
}

public double getGehalt()
{
	return Gehalt;
}

public int getAlter()
{
	return Alter;
}


public void setNachname(String Nachname)
{
	this.Nachname = Nachname;
}

public void setGehalt (double Gehalt)
{
this.Gehalt = Gehalt;
}


public double monatsAbrechnung()
{
//double restgehalt = (Gehalt*12)*0.8;	
/*double tempgehalt = 0;
double tempgehalt1 = 0;
if (restgehalt > 50_000.0)
{
	tempgehalt =+ (restgehalt-50_000.0)*0.4;
}
else if (restgehalt >=30_000.0 && restgehalt <= 50_000.0)
{
	tempgehalt1 = 50_000.0-restgehalt;
	 restgehalt=(restgehalt-30_000.0);
	 tempgehalt =+ tempgehalt1*0.55;
}
 if (restgehalt >=20_000.0 && restgehalt <= 30_000.0)
{
	 tempgehalt1 = 30_000.0-restgehalt;
	 restgehalt=(restgehalt-20_000.0);
	 tempgehalt =+ tempgehalt1*0.68;
}
 if (restgehalt >=10_000.0 && restgehalt <= 20_000.0)
{
	 tempgehalt1 = 20_000.0-restgehalt;
	 restgehalt=(restgehalt-10_000.0);
	 tempgehalt =+ tempgehalt1*0.88;
}
 if (restgehalt <=10_000.0)
{
	 tempgehalt1 = 10_000.0-restgehalt;
	 tempgehalt =+ tempgehalt1*0.90;
}
*/

double jahresGhalt = Gehalt*12;
jahresGhalt = jahresGhalt*0.8;
double steuer = 0;
if (jahresGhalt > 50_000)
{
	steuer = steuer + (jahresGhalt - 50_000)*0.6;
}
if (jahresGhalt > 30_000)
{
	double betrag = jahresGhalt - 30_000.0;
	if (betrag > 20_000) 
	{
		betrag = 20_000.0;
		steuer = steuer + betrag*0.45;}
}
if (jahresGhalt > 20_000)
{
	double betrag = jahresGhalt - 20_000.0;
	if (betrag > 10_000) 
	{
		betrag = 10_000.0;
		steuer = steuer + betrag*0.32;}
}

if (jahresGhalt > 10_000)
{
	double betrag = jahresGhalt - 10_000.0;
	if (betrag > 10_000) 
	{
		betrag = 10_000.0;
		steuer = steuer + betrag*0.20;}
}


if (jahresGhalt < 10_000)
{
	double betrag = jahresGhalt;

		steuer = steuer + betrag*0.10;}

return (jahresGhalt - steuer)/12.0;
}


public double jahresAbrechnung()
{
return monatsAbrechnung()*12;
}

public double jahresAbrechnung(int Monate)
{
return monatsAbrechnung()*Monate;
}
}



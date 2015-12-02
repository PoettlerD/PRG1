
public class Anlage {

	private String Bezeichnung;
	private double initialWert;
	private int nutzungsdauer;
	private double restWert;
	private int alter;
	
	public Anlage(String Bezeichnung,double initialWert,int nutzungsdauer)
	{
		this.Bezeichnung = Bezeichnung;
		this.initialWert = initialWert;
		this.nutzungsdauer = nutzungsdauer;
		this.restWert = initialWert;
		this.alter = 0;
	}

	public String getBezeichnung()
	{
		return this.Bezeichnung;
	}
	
	public int getAlter() {
		return this.alter;
	}
	
	public double getinitialWert()
	{
		return this.initialWert;
	}

	public int getnutzungsdauer()
	{
		return this.nutzungsdauer;
	}
	
	public double getrestWert()
	{
		return this.restWert;
	}
	
	
	
	public void abschreiben()
	{
		alter++;
		if (alter <= nutzungsdauer)
		{
		restWert = Math.floor(initialWert/nutzungsdauer *(nutzungsdauer - alter));
		}
		
	}
	
	public void simulate(int maxJahre, int minWert)
	{
		/*for (int i = 1;i <= maxJahre;i++)
		{ 
			
			if (restWert > 0 && restWert > minWert)
			{
				
				meine Variante
			}
			else
			{
				break;
			}
		}*/
	int i = 0;
	while(restWert >0 && restWert > minWert && i <= maxJahre){
		System.out.println(getrestWert());
		abschreiben();
		i++;
	}
	
	}
	
	public Anlage renew (int zusatzWert,int zusatzJahre)
	{
		Anlage neueAnlage = new Anlage(Bezeichnung, (getrestWert() + zusatzWert), (getnutzungsdauer())+zusatzJahre);
	return neueAnlage;
	
	}
	
	
	
}

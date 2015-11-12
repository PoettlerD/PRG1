
public class NotenDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println(getNotentext(90));
		System.out.println(getNotentext(78));
		System.out.println(getNotentext(65));
		System.out.println(getNotentext(51));
		System.out.println(getNotentext(49));
		
	}

	
	public static String getNotentext(int Punkte)
	{
		if (Punkte >= 90)
		{
			return "Sehr Gut";
		}
		else if (Punkte >= 78 && Punkte <= 89 )
		{
			return "Gut";
		}
		else if (Punkte >= 65 && Punkte <= 77 )
		{
			return "Befriedigned";
		}
		else if (Punkte >= 51 && Punkte <= 64 )
		{
			return "Genügend";
		}
		else if (Punkte  <= 50 )
		{
			return "Unenügend";
		}
		else
		{
			return "Da passt was ned!!!!!"; 
		}
		}
		
		
	}
	
	


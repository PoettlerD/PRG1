package org.campus02.Gro�buchstaben;

public class Gro�buchstaben {

	private String Eingabe;
	
	public Gro�buchstaben(String Eingabe){
		this.Eingabe = Eingabe;
	}

	
	public String ConvertToUpperCase()
	{
		String Returnstring = Eingabe;
		char Testchar;
		for (int i = 0; i< Eingabe.length();i++)
		{
			Testchar = Returnstring.charAt(i);
			if ( Character.isLowerCase(Testchar))
			{
				if (i >0){
					
				
				if (Returnstring.charAt(i-1) == ' ')
				{
					Returnstring = Returnstring.substring(0,i)+Returnstring.substring(i,i+1).toUpperCase()+Returnstring.substring(i+1);
				System.out.println(Returnstring.substring(0,i-1)+"_____"+Returnstring.substring(i,i+1).toUpperCase()+"________"+Returnstring.substring(i+2));
				}
			}
		}
			
		}
			return Returnstring;
	}
}


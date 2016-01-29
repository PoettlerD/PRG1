package org.campus02.route;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ort graz = new Ort("graz");
		Ort wien = new Ort("wien");
		Ort marburg = new Ort("marburg");
		Ort linz = new Ort("linz");

		
		graz.addNachbar(wien);
		graz.addNachbar(marburg);
		
		wien.addNachbar(linz);
		wien.addNachbar(graz);
		
		marburg.addNachbar(graz);
		linz.addNachbar(wien);
		linz.addNachbar(graz);
		graz.addNachbar(marburg);
		
	//	System.out.println(hasCircle(wien));

		
		System.out.println(contHops(marburg, linz, 0));
		
	}
/*	public static boolean hasCircle (Ort o, Ort start)
	{
		if (o == start)
		{
			return false;
		}

		for (Ort ort : o.getNachbarn()) 
		{
			if (ort == start)
			{
				return true;
			}
			if (hasCircle(ort, start))
			{
				return true;
			}
		
	
		}
		return false;
		
		
		
	}*/
	
	public static boolean hasCircle (Ort o)
	{
		return hasCircle(o,o,o);
	}
	
	public static boolean hasCircle (Ort current, Ort start, Ort last)
	{


		
		for (Ort ort : current.getNachbarn()) 
		{
			System.out.println(ort.getName()+" - "+current.getName());
			
			if (ort == last)
			{
				System.out.println("same ort");
				continue;
			}
			if (ort == start)
			{
				return true;
			}
			if (hasCircle(ort, start,current))
			{
				return true;
			}
		
	
		}
		return false;
		
		
		
	}
	
	
	public static int contHops(Ort start,Ort ziel, int count)
	{
		System.out.println(start.getName());
		if (start == ziel)
		{
			return 0;
		}
	for (Ort nachbar : start.getNachbarn()) {
		
		if (nachbar.equals(ziel))
		{
			return 1;
		}
		else{
			contHops(nachbar, ziel, count++);
		}
	
		
	}
	
	return count;
	
	}
	
	
	
	
}


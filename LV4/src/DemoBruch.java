
public class DemoBruch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Bruch Bruch1 = new Bruch(1,2);
		
		Bruch Bruchmal2 = Bruch1.multiplicate(3, 3);
		Bruch Bruchmal3 = Bruch1.multiplicate(3, 3,5,5);
		
	System.out.println(Bruchmal2.getZaehler() +"/"+Bruchmal2.getNenner());
	System.out.println(Bruchmal3.getZaehler() +"/"+Bruchmal3.getNenner());
	
	System.out.println(Bruchmal3.toDecimal());
	
	
	Bruchmal3.prin();
	
	}

}

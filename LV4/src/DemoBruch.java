
public class DemoBruch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Bruch Bruch1 = new Bruch(1,2);
		Bruch Bruch2 = new Bruch (3,8);
		Bruch Bruch3 = new Bruch(3,4);
		
		
		Bruch Bruchmal2 = Bruch1.multiplicate(Bruch2);
		Bruch Bruchmal3 = Bruch1.multiplicate(Bruch2,Bruch3);
		
	System.out.println(Bruchmal2.getZaehler() +"/"+Bruchmal2.getNenner());
	System.out.println(Bruchmal3.getZaehler() +"/"+Bruchmal3.getNenner());
	
	System.out.println(Bruchmal3.toDecimal());
	
	
	Bruchmal3.prin();
	
	
	Bruch Bruch4 = new Bruch(9,9);
	
	System.out.println("B컴컴M: Anzahl der Instanzen von Bruch:"+Bruch.Counter);
	
	
	Bruch4.prin();
	System.out.println("B컴컴M: Anzahl der Instanzen von Bruch:"+Bruch.Counter);
	
	Bruch Bruch5 = new Bruch(9,9);
	Bruch Bruch6 = new Bruch(9,9);
	Bruch Bruch7 = new Bruch(9,9);
	
	}

}

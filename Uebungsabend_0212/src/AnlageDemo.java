
public class AnlageDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Anlage Anlage1 = new Anlage("zbook", 1000.0, 5);
		
	//	System.out.println(Anlage1.getnutzungsdauer());
		//Anlage1.abschreiben();
		//System.out.println(Anlage1.getrestWert());
		
		Anlage1.simulate(3, 50);
		System.out.println(Anlage1.getrestWert());
		Anlage1.renew(10000, 15);
		
		System.out.println(Anlage1.getrestWert());
		System.out.println(Anlage1.getnutzungsdauer());
		
		Anlage newAnlage = Anlage1.renew(10239, 7);
		System.out.println(newAnlage.getnutzungsdauer());
		newAnlage.simulate(4, 50);
		

		
	}

}

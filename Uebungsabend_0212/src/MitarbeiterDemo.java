
public class MitarbeiterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mitarbeiter m1 = new Mitarbeiter("david", "poettler", 7200);
	
	System.out.println(m1.monatsAbrechnung());
	
	System.out.println(m1.jahresAbrechnung());
	
	System.out.println(m1.jahresAbrechnung(14));
	}

}

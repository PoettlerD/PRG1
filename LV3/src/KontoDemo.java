
public class KontoDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Konto Meins = new Konto("David Pöttler");
		
		Meins.aufbauchen(1_000_000.0);
		Meins.abbuchen(500_000);
		System.out.println("Kontostand ist:"+Meins.getKontostand());
		Meins.abbuchen(250_000);
		System.out.println("Kontostand ist:"+Meins.getKontostand());
		Meins.abbuchen(400_000);
		System.out.println("Kontostand ist:"+Meins.getKontostand());
	}

}

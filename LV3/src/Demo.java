
public class Demo {
	
	public static void main(String[] args)
	{
		int n;
		Car porsche911 = new Car();
		porsche911.Brand = "Porsche";
		porsche911.Colour = "black";
		porsche911.Year = 1979;
		porsche911.SetCurrentGear(7);
		System.out.println("aktueller Gang Porsche: "+porsche911.CurretGear);
		porsche911.NextGear();
		System.out.println("aktueller Gang Porsche: "+porsche911.CurretGear);
		porsche911.accelerate();
		System.out.println("Aktuelle Geschwindigkeit Porsche: "+porsche911.CurrentSpeed);
		porsche911.accelerate();
		System.out.println("Aktuelle Geschwindigkeit Porsche: "+porsche911.CurrentSpeed);
		porsche911.accelerate();
		System.out.println("Aktuelle Geschwindigkeit Porsche: "+porsche911.CurrentSpeed);
		porsche911.accelerate(150);
		System.out.println("Aktuelle Geschwindigkeit Porsche: "+porsche911.CurrentSpeed);
		
		
		
		Car Golf5 = new Car();
		Golf5.Brand = "VW";
		Golf5.Colour = "Blue";
		Golf5.Year = 2004;
		Golf5.NextGear();
		Golf5.SetCurrentGear(2);
		System.out.println("aktueller Gang Gölf: "+Golf5.CurretGear);
	}

}


public class Bruch {

	private int Zaehler;
	private int Nenner;
	public static int Counter;
	
	private static int MaxCounter = 5;
	
	
	
	
	
	 Bruch (int Zaehler, int Nenner)
	{

		if (Counter < MaxCounter)
		{
		Counter++;
		this.Zaehler = Zaehler;
		this.Nenner = Nenner;
		}
		else
			System.out.println("Nix da!!!");
		}

	 public int getNenner()
	 {
	 return this.Nenner;
	 }
	 
	 public int getZaehler()
	 {
		 return this.Zaehler;
	 }

	 
	 public double toDecimal()
	 {
		 
		 return ((1.0 *this.Zaehler)/(1.0 *this.Nenner));
	 }

	 
	 public void prin()
	 {
		 System.out.println(this.Zaehler+"/"+this.Nenner);


		
	 }

	 public Bruch multiplicate(Bruch b1)
	 {
		 int zaehler = this.Zaehler*b1.Zaehler;
		 int nenner = this.Nenner*b1.Nenner;
		 Bruch NewBruch = new Bruch (zaehler,nenner);
		 return NewBruch;
		 
		 
	 }
	 public Bruch multiplicate(Bruch b1, Bruch b2)
	 {
		 int zaehler = this.Zaehler*b1.Zaehler*b2.Zaehler;
		 int nenner = this.Nenner*b1.Nenner*b2.Nenner;
		 
		 Bruch NewBruch = new Bruch (zaehler,nenner);
		 return NewBruch;
		 
		 
	 }


}
	 
	 


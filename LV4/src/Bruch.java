
public class Bruch {

	private int Zaehler;
	private int Nenner;
	
	 Bruch (int Zaehler, int Nenner)
	{
		this.Zaehler = Zaehler;
		this.Nenner = Nenner;
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

	 public Bruch multiplicate(int Zaehler1, int Nenner1)
	 {
		 Bruch NewBruch = new Bruch (this.Zaehler*Zaehler1,this.Nenner*Nenner1);
		 return NewBruch;
		 
		 
	 }
	 public Bruch multiplicate(int Zaehler1, int Nenner1, int Zaehler2, int Nenner2)
	 {
		 Bruch NewBruch = new Bruch (this.Zaehler*Zaehler1*Zaehler2,this.Nenner*Nenner1*Nenner2);
		 return NewBruch;
		 
		 
	 }


}
	 
	 


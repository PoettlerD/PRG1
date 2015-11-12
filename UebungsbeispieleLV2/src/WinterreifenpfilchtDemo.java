
public class WinterreifenpfilchtDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (isWinterreifenPflicht(12,true))
		{
		System.out.println("Bitte Winterreifen verwenden!");
		}
		else
		{
			System.out.println("Winterreichen sind nicht erforderlich");
		}
		
		if (isWinterreifenPflicht(9,true))
		{
		System.out.println("Bitte Winterreifen verwenden!");
		}
		else
		{
			System.out.println("Winterreichen sind nicht erforderlich");
		}
		
		if (isWinterreifenPflicht(3,false))
		{
		System.out.println("Bitte Winterreifen verwenden!");
		}
		else
		{
			System.out.println("Winterreichen sind nicht erforderlich");
		}
	}

	public static boolean isWinterreifenPflicht(int temperatur, boolean rutschigeFahrbahn) {
		if ((temperatur < 10 && rutschigeFahrbahn == true) | temperatur < 4) {
			return true;
		} else {
			return false;
		}
	}
}

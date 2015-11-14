
public class Car {
	
	public int CurretGear;
	public int CurrentSpeed;
	public String Colour;
	public String Brand;
	public int Year;
	
	
	public void NextGear(int CurretGear)
	{
	this.CurretGear = CurretGear++;
	}
	
	public void SetCurrentGear(int newGear)
	{
		CurretGear = newGear;
	}


public void accelerate()
{
CurrentSpeed += 10;	
}

public void accelerate(int CustomSpeed)
{
CurrentSpeed += CustomSpeed;	
}


}


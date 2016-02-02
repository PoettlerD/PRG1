package org.campus02.Landbsp;

import java.util.ArrayList;

public class Bundesstaat extends Land{
private ArrayList<Land> laender;

public Bundesstaat (ArrayList<Land> laender) {
	super();
	this.laender = laender;

}

public void addLand(Land l)
{
	laender.add(l);
}

@Override
public double getBruttoSozialprodukt() {
	// TODO Auto-generated method stub
	double BIP = 0.0;
	
	for (Land land : laender) {
		BIP+=land.getBruttoSozialprodukt();
		
	}
return (BIP);
}


}







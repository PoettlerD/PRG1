package org.campus02.recProdukt;

import java.util.ArrayList;

import javax.print.attribute.standard.PDLOverrideSupported;

public class Product {
public String Name;
public ArrayList<Product> Parts;
public double Price;


public Product(String name, double price) {
	super();
	Name = name;
	Price = price;
	Parts = new ArrayList<Product>();
}


public void addPart (Product p)
{
	Parts.add(p);
}

public double getPrice()
{
	double erg= 0;
	for (Product product : Parts) {
		erg+= product.Price;
	}
	return erg;
}	
	public double getPrice2()
	{
		double erg= Price;
		for (Product product : Parts) {
			erg += product.getPrice();
		}

return erg;
}
}

package org.campus02.recProdukt;

import java.util.ArrayList;

import com.sun.org.apache.regexp.internal.recompile;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product Iphone = new Product("Iphone", 700);
		
		Product Case = new Product("Case",  25);
		
		Product Display = new Product("Display",  50);
		
		Product Akku = new Product("Akku",  30);
		
		Product Lizenzen = new Product("Lizenzen",  100);
		
		Product Glas = new Product("Glas",  13);
		Product Kamera = new Product("Kamera",  50);
		Product Bildsensor = new Product("Bildsensor",  20);
		Product Linse = new Product("Linse", 5);
		
		
		
		Display.addPart(Glas);
		Iphone.addPart(Case);
		Iphone.addPart(Display);
		Iphone.addPart(Akku);
		Iphone.addPart(Lizenzen);
		Iphone.addPart(Kamera);
		Kamera.addPart(Linse);
		Kamera.addPart(Bildsensor);
		Case.addPart(Kamera);
		System.out.println(recPartsprice(Iphone,"/-"));
		
		System.out.println(Kamera.getPrice2());
	}

	
	
	public static String recParts (Product p, String einrueckung)
	{
		String erg = p.Name+"\n";
		if (p.Parts.size() == 0)
		{
			return erg;
		}
	
		for (Product part : p.Parts) {
			
			erg += einrueckung+recParts(part,einrueckung+einrueckung);
		}
	return erg;
	}

	public static String recPartsprice (Product p, String einrueckung)
	{
		String erg = p.Name+" "+p.getPrice2()+"\n";
		if (p.Parts.isEmpty() == true)
		{
			return erg;
		}
	
		for (Product part : p.Parts) {
			
			erg += einrueckung+" "+recPartsprice(part,einrueckung+einrueckung);
		}
	return erg;
	}
	
	public static double getPrice3(Product p)
	{
		double erg= p.Price;
		for (Product product : p.Parts) {
			erg += product.getPrice3();
		}
	retuun erg;	
}

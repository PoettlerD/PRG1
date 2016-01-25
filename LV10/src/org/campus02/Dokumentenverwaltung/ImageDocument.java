package org.campus02.Dokumentenverwaltung;

public class ImageDocument extends Document {

private int sizeX;
 private int sizeY;
 private String color;


 public ImageDocument(String fileName, int sizeX, int sizeY, String color) {
		super(fileName);
		// TODO Auto-generated constructor stub
this.sizeX = sizeX;
this.sizeX = sizeY;
this.color = color;
 
 
 
 }


@Override
public void printDocument() {
	// TODO Auto-generated method stub
	
	System.out.println("Bilddatei: "+sizeX+" "+" "+sizeY+" "+color);
}

 
 
}

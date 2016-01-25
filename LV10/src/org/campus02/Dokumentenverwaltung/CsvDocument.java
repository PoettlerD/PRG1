package org.campus02.Dokumentenverwaltung;

import java.util.ArrayList;

public class CsvDocument extends Document {

	protected ArrayList<String> lines = new ArrayList<>(); 
	
	
	public CsvDocument(String fileName, ArrayList<String> lines) {
		super(fileName);
		this.lines = lines;
		// TODO Auto-generated constructor stub
	}


	
	public void addLine (String line)
	{
		lines.add(line);
	}


	@Override
	public void printDocument() {
		// TODO Auto-generated method stub
		
		System.out.println("CsvDocument "+fileName);
		for (String string : lines) {
			System.out.println(string);
			
		}
	}

	
	



	
	
	
}

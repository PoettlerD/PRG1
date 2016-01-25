package org.campus02.Dokumentenverwaltung;

import java.util.ArrayList;

public class PrintManager {
	private ArrayList<Document>  documentList = new ArrayList<>();

	public PrintManager(ArrayList<Document> documentList) {
		super();
		this.documentList = documentList;
	}
	
	public void addDocument (Document d)
	{
		documentList.add(d);
	}


	public void printAll ()
	{
		for (Document document : documentList) {
		 document.printDocument();
		}
	}
	
	public Document findDocument (String fileName)
	{
		Document error = new Document("ERROR");
		for (Document document : documentList) {
			if (document.fileName.equals(fileName))
			{
				return document;
			}
		
	
		}
		return error;
	}

}

package org.campus02.Dokumentenverwaltung;

import java.util.ArrayList;

public class docdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Document document = new Document("test.doc");
		ArrayList<String> testlist = new ArrayList<>();
		testlist.add("Das");
		testlist.add("ist");
		testlist.add("eine Array List");
		CsvDocument csvdocument = new CsvDocument("test.csv", testlist);
		ImageDocument imgdoc = new ImageDocument("test.jpg", 100, 200, "blue");
		 csvdocument.addLine("asdajndk");
		
		document.printDocument();
		csvdocument.printDocument();
		imgdoc.printDocument();
		
		
		Document csv2 = new CsvDocument("demo2", new ArrayList<String>());
		
		csv2.printDocument();
		
		System.out.println("////////////////////////////////");
		System.out.println("////////////////////////////////");
		PrintManager pMgr = new PrintManager(new ArrayList<Document>());
		
			pMgr.addDocument(csvdocument);
			pMgr.addDocument(document);
			pMgr.addDocument(imgdoc);
			
			
			pMgr.printAll();
		
			
			pMgr.findDocument("test.jpg").printDocument();
	}

}

package org.campus02.Dokumentenverwaltung;

public class TextDocument extends Document {


protected String content;

public TextDocument(String fileName, String content) {
	super(fileName);
	// TODO Auto-generated constructor stub
this.content  = content;


}







@Override
public void printDocument() {
	// TODO Auto-generated method stub
	
	System.out.println("Textdokument:" +fileName+ content);
}





}

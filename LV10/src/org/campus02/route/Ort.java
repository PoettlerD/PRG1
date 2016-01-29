package org.campus02.route;

import java.util.ArrayList;

public class Ort {
private String name;
private ArrayList<Ort> verbundeneOrte;

public Ort(String name) {
	super();
	this.name = name;
	this.verbundeneOrte = new ArrayList<Ort>();
	
}

public ArrayList<Ort> getNachbarn(){
	return this.verbundeneOrte;
}

public void addNachbar (Ort e){
	verbundeneOrte.add(e);
}


public String getName ()
{
	return this.name;
}
}

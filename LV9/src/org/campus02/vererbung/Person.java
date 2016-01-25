package org.campus02.vererbung;

public class Person {
	
	protected String vorName;
	protected String nachName;
	protected int alter;
	public String getVorName() {
		return vorName;
	}
	public void setVorName(String vorName) {
		this.vorName = vorName;
	}
	public String getNachName() {
		return nachName;
	}
	public void setNachName(String nachName) {
		this.nachName = nachName;
	}
	public int getAlter() {
		return alter;
	}
	public void setAlter(int alter) {
		this.alter = alter;
	}
	public Person(String vorName, String nachName, int alter) {
		super();
		this.vorName = vorName;
		this.nachName = nachName;
		this.alter = alter;
	}
	@Override
	public String toString() {
		return "Person [vorName=" + vorName + ", nachName=" + nachName + ", alter=" + alter + "]";
	}

	
	
	



	
	
	

}

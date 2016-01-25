package org.campus02.vererbung;

public class Customer extends Person {
	
	private static int Counter = 0;
	private int id;
	public Customer(String vorName, String nachName, int alter) {
		super(vorName, nachName, alter);
		this.id = Counter++;
		this.vorName = vorName;
		this.alter = alter;
		this.nachName = nachName;
		// TODO Auto-generated constructor stub
	}
	public static int getCounter() {
		return Counter;
	}
	public static void setCounter(int counter) {
		Counter = counter;
	}
	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", vorName=" + vorName + ", nachName=" + nachName + ", alter=" + alter + "]";
	}



	
	

}

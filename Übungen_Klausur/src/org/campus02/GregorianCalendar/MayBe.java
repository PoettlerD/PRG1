package org.campus02.GregorianCalendar;

public class MayBe<T> {
public T data;
public int Status;
public MayBe(T data, int Status) {
	super();
	this.data = data;
	this.Status = Status;
}
public static final int ZugriffErlaub = 1;
public static final int ZugriffVerweigert = 2;
public static final int NichtVorhanden = 3;

public String toString() {
	String retrunstring = null;
	switch (Status) {
	case ZugriffErlaub:
		return  "ZugriffErlaub"+" "+data;
	
	case ZugriffVerweigert:
		return "ZugriffVerweigert";
		
	case NichtVorhanden:
		return "NichtVorhanden";
		
	default:
		break;
	}
	
	return "MayBe [data=" + data + ", Status=" + retrunstring + "]";
}
public void setStatus(int status) {
	Status = status;
}



}

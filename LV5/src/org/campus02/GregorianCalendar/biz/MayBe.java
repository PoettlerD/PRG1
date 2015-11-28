package org.campus02.GregorianCalendar.biz;
import java.util.GregorianCalendar;
public class MayBe<T> {
	
	private T data;
	private int status;
	
	public MayBe (T Data,int Status)
	{
		this.data = Data;
		this.status = Status;
	}
	
	public void setData(T data) {
		this.data = data;
	}
	
	
	public static final int ZugriffErlaub = 1;
	public static final int ZugriffVerweigert = 2;
	public static final int NichtVorhanden = 3;

	
	public void Print ()
	{
		switch (this.status)
		{
		case ZugriffErlaub:
		System.out.println("Zugriff erlaut: "+this.data);
		break;
	case ZugriffVerweigert:
	System.out.println("Zugriff verboten! ");
	break;
	}
	
	
	
	
	
	

	}
}

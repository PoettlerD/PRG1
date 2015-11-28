package org.campus02.GregorianCalendar.app;

import java.util.GregorianCalendar;

import org.campus02.GregorianCalendar.biz.MayBe;

public class MayBeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//GregorianCalendar Calendar = new GregorianCalendar();

	MayBe<String> TestString = new MayBe<String>("HALLO", MayBe.ZugriffErlaub);
	TestString.Print();
	
	
	MayBe<Double> Doublevalue = new MayBe<Double>(145374.0, MayBe.ZugriffVerweigert);
	
	Doublevalue.Print();
	}

}

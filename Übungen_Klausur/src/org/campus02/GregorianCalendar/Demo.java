package org.campus02.GregorianCalendar;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MayBe<String> Stringtest = new MayBe<String>("HALLO",MayBe.ZugriffVerweigert);
		System.out.println(Stringtest.toString());
		
		Stringtest.setStatus(MayBe.NichtVorhanden);
		System.out.println(Stringtest.toString());
	}

}

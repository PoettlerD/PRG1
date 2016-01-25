package org.campus02.palindrom;

public class Palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String test = "Re  nT2n//(E§$%r";
		boolean abc = check(test);
		
		System.out.println(abc);
	}

	public static boolean check (String palindromstring)
	{
		System.out.println(palindromstring);
		if (palindromstring.length() <= 1)
		{
			return true;
			
		}
		
		char first = palindromstring.charAt(0);
		char last = palindromstring.charAt(palindromstring.length()-1);
		first = Character.toLowerCase(first);
		last = Character.toLowerCase(last);
		if ((Character.isLetter(first) != true) && (palindromstring.length() > 1))
		{
			return check(palindromstring.substring(1));
		}
		if ((Character.isLetter(last) != true) && (palindromstring.length() > 1))
		{
			return check(palindromstring.substring(0,palindromstring.length()-1));
		}
		
		if ((palindromstring.length() > 1)&&(first == last))
			
		{
		
				return check(palindromstring.substring(1,palindromstring.length()-1));
			
		}
		

		return false;
	}
	



}

package org.campus02.rec;

public class fibonacci {
	
	public static long fibonacci (long n)
	{
		if (n <= 2)
		{
			return 1;
		}
	
		return fibonacci(n-1)+fibonacci(n-2);
	
	}

}

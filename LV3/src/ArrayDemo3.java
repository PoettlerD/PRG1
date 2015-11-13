import java.util.Random;

public class ArrayDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] number = {1,3,5,7,11,2,5,8,9,1};
		int summe = 0;
		for (int i = 0; i < number.length; i++)
		{
			summe += number[i];
		}
	System.out.println(summe);
	
	System.out.println(containsNumber(number,10));
	System.out.println(containsNumber(number,11));
	System.out.println(containsNumber(number,213));
	System.out.println(containsNumber(number,1));
	
	}
public static boolean containsNumber (int[] numbers, int n)
{
	for (int i=0;i < numbers.length;i++)
	{
		if (numbers[i] == n)
		{
			return true;
		}
		}
	return false;	
}

}


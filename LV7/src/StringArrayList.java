import java.util.ArrayList;

public class StringArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<String> myStringList = new ArrayList<String>();
		myStringList.add("Frog");
		myStringList.add("Snake");
		myStringList.add("Tiger");
		myStringList.add("Cat");
		System.out.println(myStringList.size());
		
		for (String string : myStringList) {
			System.out.println(string);
			
		}
	
		
		
		System.out.println("Contains Cow? "+myStringList.contains("Cow"));
		System.out.println("Contains Snake? "+myStringList.contains("Snake"));
		
		
		myStringList.remove("Cat");
		System.out.println("Contains Cat? "+myStringList.contains("Cat"));
		System.out.println(myStringList.size());
		

	}
	
	

}

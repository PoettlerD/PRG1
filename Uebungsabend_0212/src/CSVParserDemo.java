
public class CSVParserDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		CSVParser csv1 = new CSVParser("abc,123,xyz");
	String[] test = csv1.parse();
		
		for (int i = 0; i<= csv1.countComma(); i++)
	 {
		 System.out.println(test[i]);
	 }
		
		
	}

}

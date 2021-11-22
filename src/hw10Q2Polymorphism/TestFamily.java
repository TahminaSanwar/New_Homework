package hw10Q2Polymorphism;

public class TestFamily {
	
	public static void main(String[] args) {
		
		System.out.println("\n**********Sister Class********");

	Sister sister = new Sister();
	sister.sister();  // Void type method initialized
	sister.sister01(20, 16, 35, "28", 35, 44);  //Void type parameterized method initialized
	Sister.sister02(21, 13, 39, "26", 39, 42);  //Static type method initialized
	sister.sister03(25, 19, 35, "29", 31, 49);  //Return type parameterized method initialized
	sister.sister04(20, 19, 35, "29", 31, 49);  //Final type method initialized
	
	
	System.out.println("\n*******Niece Class**********");
	
	Niece niece=new Niece();
	niece.sister();  // Void type method initialized
	niece.sister01(20, 16, 35, "28", 35, 44);  //Void type parameterized method initialized
	niece.sister03(25, 19, 35, "29", 31, 49);  //Return type parameterized method initialized
	
	
	
	
	
	
	

	}
}


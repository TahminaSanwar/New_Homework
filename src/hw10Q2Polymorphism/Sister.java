package hw10Q2Polymorphism;

public class Sister {
	// Void type method
	public void sister() {
		System.out.println("This void type method is from is from Sister Class");
	}

	// Void type parameterized method
	public void sister01(int age1, int age2, int age3, String age4, int age5, int age6) {
		int ageA = age1 + age2 + age3 + Integer.parseInt(age4)+age5+age6;
		System.out.println("Age is from Sister:" + ageA);
	}

	// Static type method
	public static int sister02(int age1, int age2, int age3, String age4, int age5, int age6) {
		int ageB = age1 + age2 + age3 + Integer.parseInt(age4)+age5+age6;
		System.out.println("Age is from Sister:" + ageB);
		return ageB;
	}

	// Return type parameterized method
	public int sister03(int age1, int age2, int age3, String age4, int age5, int age6) {
		int ageC = age1 + age2 + age3 + Integer.parseInt(age4)+age5+age6;
		System.out.println("Age is from Sister:" + ageC);
		return ageC;
	}

	// Final type method
	public final int sister04(int age1, int age2, int age3, String age4, int age5, int age6) {
		int ageD = age1 + age2 + age3 + Integer.parseInt(age4)+age5+age6;
		System.out.println("Age is from Sister:" + ageD);
		return ageD;

	}

}
/*
 * Method overloading is also knows as early binding or Static binding. When
 * different methods are exits with the same method name but with the different
 * parameter or signature is called Method Overloading. It occurs during compile
 * time.Overloaded methods are bonded using static binding.
 */

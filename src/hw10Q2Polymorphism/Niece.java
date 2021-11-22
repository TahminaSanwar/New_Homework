package hw10Q2Polymorphism;

public class Niece extends Sister {

	@Override

	public void sister() {
		System.out.println("This void type method is from is from Sister Class");
	}

	@Override
	public void sister01(int age1, int age2, int age3, String age4, int age5, int age6) {
		int ageA = age1 + age2 + age3 + Integer.parseInt(age4)+age5+age6;
		System.out.println("Age is from Sister:" + ageA);
	}
	
	/*
	 * We can nor override Static Method because overriding is based on dynamic binding at run time but static methods are bonded using static binding during compile time.
	 */
	/*
	  @Override 
	  public static int sister02(int age1, int age2, int age3, String age4, int age5, int age6) { 
	  int ageB = age1 + age2 + age3 +Integer.parseInt(age4)+age5+age6; 
	  System.out.println("Age is from Sister:" + ageB);
	  return ageB; 
	  }
	 */

	@Override
	public int sister03(int age1, int age2, int age3, String age4, int age5, int age6) {
		int ageC = age1 + age2 + age3 + Integer.parseInt(age4)+age5+age6;
		System.out.println("Age is from Sister:" + ageC);
		return ageC;
	}

	/*
	 * Final method can not be overridden. Because the purpose of the final keyword
	 * is to prevent overriding or something that can not be changed
	 */
	/*
	public final int sister04(int age1, int age2, int age3, String age4, int age5, int age6) {
		int ageD = age1 + age2 + age3 + Integer.parseInt(age4);
		System.out.println("Age is from Sister:" + ageD);
		return ageD;
		}
		*/
}

/*
 * When different methods are exits with the same method name and with the same parameter or signature but with different logic is called dynamic polymorphism or late binding or method overriding. It occurs during run time. Overriding methods are bonded with dynamic binding.
 */


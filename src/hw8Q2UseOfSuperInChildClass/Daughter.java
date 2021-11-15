package hw8Q2UseOfSuperInChildClass;

public class Daughter extends Father{
	public String birthMonth;
	public int age;


public Daughter() {
	super("Abdur", 67, 'M', false);//Super method can call either default or parameterized constructor from a parent class
	super.father();//Super keyword can call the default method from the parent class.
	super.fatherInfo("Razzaque",66,'M',false);//Super keyword can call the parameterized method from the parent class
	super.familyName = "Molla";//super keyword can initialize variable from parent class
	System.out.println("This is a default constructor");
	
	
}


public Daughter(String birthMonth, int age) {
	
	this.birthMonth = birthMonth;
	this.age = age;
	System.out.println("Birth Month: "+birthMonth+"\nAge:"+age);
}

public void daughter() {
}	

public void daughterInfo(String birthMonth, int age) {

	this.birthMonth = birthMonth;
	this.age = age;
	System.out.println("Birth Month: "+birthMonth+"\nAge:"+age);
}
}	
}
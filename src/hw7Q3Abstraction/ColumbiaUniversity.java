package hw7Q3Abstraction;

public class ColumbiaUniversity {//needs to be an abstract class to create an abstract method
	
	public ColumbiaUniversity() {//Default Constructor can be created inside a regular class
	
	public abstract void chemistry();//The abstract method chemistry in type ColumbiaUniversity can only be defined by an abstract class
	
}
	
	public void biology() {
		System.out.println("Biology is an interesting subject");
}
}	

//extends keyword is used for the inheritance in Java for a regular Class
//yes a regular Class inherit other Abstract Class or a regular class or interface
//Single Inheritance, Multi-Level Inheritance, Hierarchical Inheritance, Multiple Inheritance
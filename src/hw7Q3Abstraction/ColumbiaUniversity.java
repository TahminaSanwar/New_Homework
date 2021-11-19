package hw7Q3Abstraction;

public abstract class ColumbiaUniversity extends MedicalSchool{//Inheritance
	
	public ColumbiaUniversity() {//Default Constructor can be created inside a regular class
	
	//public abstract void chemistry();//The abstract method chemistry in type ColumbiaUniversity can only be defined by an abstract class
	
}
	
	public void biology() {
		System.out.println("Biology is an interesting subject");
}
}	

/*3-2) iii)
 * 1 keyword is used for the inheritance in Java for Abstract Class
 * regular Class inherit other Abstract Class or a regular class but not an interface by extends keyword
 * Regular class can inherit 1 regular or 1 abstract class 
 */
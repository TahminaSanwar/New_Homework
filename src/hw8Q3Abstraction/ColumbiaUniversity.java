package hw8Q3Abstraction;

public class ColumbiaUniversity extends MedicalSchool implements University, VocationalSchool{//Inheritance
	
	public ColumbiaUniversity() {//Default Constructor can be created inside a regular class
	
	//public abstract void chemistry();The abstract method chemistry in type ColumbiaUniversity can only be defined by an abstract class
	
}
	
	public void biology() {
		System.out.println("Biology is an interesting subject");
}

	@Override
	public void biochemistryLab() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void caring() {
		// TODO Auto-generated method stub
		
	}
}	

/*3-2) iii)
 * 1 keyword is used for the inheritance in Java for Abstract Class
 * regular Class inherit other Abstract Class or a regular class but not an interface by extends keyword
 * Regular class can inherit 1 regular or 1 abstract class 
 */
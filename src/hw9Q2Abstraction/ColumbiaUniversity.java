package hw9Q2Abstraction;

import hw8Q3Abstraction.MedicalSchool;
import hw8Q3Abstraction.University;
import hw8Q3Abstraction.VocationalSchool;

public class ColumbiaUniversity extends MedicalSchool implements University, VocationalSchool{//Inheritance
	
	public ColumbiaUniversity() {//Default Constructor can be created inside a regular class
	
	//public abstract void chemistry();The abstract method chemistry in type ColumbiaUniversity can only be defined by an abstract class
	
}
	
	public static void biology() {
		System.out.println("Biology is an interesting subject");
	}
	
		

	@Override
	public void biochemistryLab() {
		System.out.println("This method is from MedicalSchool Abstract Class");
		
	}

	@Override
	public void caring() {
		System.out.println("This method is from NursingSchool Abstract Class");
		
	}

	public void communityCollege() {
		
		
	}
}	

/*3-2) iii)
 * 1 keyword is used for the inheritance in Java for Abstract Class
 * regular Class inherit other Abstract Class or a regular class but not an interface by extends keyword
 * Regular class can inherit 1 regular or 1 abstract class 
 */
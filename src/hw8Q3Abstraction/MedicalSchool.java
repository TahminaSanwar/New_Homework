package hw8Q3Abstraction;

public abstract class MedicalSchool extends NursingSchool implements LawSchool {//Inheritance
	
	public void anatomyLab() {
		System.out.println("I wish I could be a medical school student");
		
		
	}
	public abstract void biochemistryLab();

}


/*3-2) ii)
 * extends keyword is used for the inheritance in Java for Abstract Class
 * Abstract class can inherit either regular or abstract class
 * Either 1 regular or 1 abstract class
 */
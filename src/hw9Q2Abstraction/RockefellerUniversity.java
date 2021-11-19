 package hw9Q2Abstraction;

public class RockefellerUniversity extends EngineeringSchool implements AeronauticalSchool {
	
	public RockefellerUniversity() {
		// Default Constructor is created inside regular class
	}

	public void maths() {
	}
	

	public void statistics() {
		System.out.println("All the statistics in the world can't measure the warmth of a smile");

	}

	@Override
	public void computerLab() {
		System.out.println("This method is from EngineeringSchool Abstract Class");
		
	}
}

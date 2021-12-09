package java_oop_allTogether;

public interface Phone extends Pager, Wakitaki {
	public abstract void interfaceInfo();

	public abstract void call();

	public abstract void message();

	public abstract void camera();

	public default void battery() {
		System.out.println("This is a default method which is implemented.");
	}

	public static void wireless() {
		System.out.println("This is a static method which is implemented");

		// An abstract method (as asked on the HW to implement  interFaceInfo method) can not be implemented within an interface.

	}

	public static void main(String[] args) {
		System.out.println("What is interface?: Interface is the \"BluePrint\" of class. Method can only be declared here. Interface can not be instantiated. It contains default and Static methods which are non abstract method. Interface contains only abstract method.\nConstractor can not be created inside it. We can not write variables inside it.");
		
		// More than 1 interface can be inherited by an interface only with extends keyword.

		
	}

}

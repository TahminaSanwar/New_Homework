package java_oop_allTogether;

public abstract class AppleWatch extends AppleWatchSeries5 implements Watch, DigitalWatch {
	void abstractClassInfo() {
		System.out.println("Abstract class can have abstract and non abstract both method where a class can have only non abstract method ans inteface can have only abstract method. Abstract and an Interface class can not be instanciated, where a class can be instanciated. In Abstract class abstract method is declared and non abstract method is implemented, where in interface class abstract method is only implemented and in regular class metho can only be implemented.");

	}

	abstract void appleWatchInfo();// Abstract method

}

//Answer to the question: Yes we can create a constructor inside abstract class.


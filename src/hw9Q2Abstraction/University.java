package hw9Q2Abstraction;

public  interface University extends College, Hospital {

	default void gymnasium() {
	}

	public static void library() {
	}

}
//Here is the answer of the question.


/*
* 3-2) i) extends keyword is used for the inheritance in Interface
* an Interface cannot inherit a regular class or abstract class. But it can inherit more than one interface
* can inherit more than one interface
*/
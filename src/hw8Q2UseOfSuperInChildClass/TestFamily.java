package hw8Q2UseOfSuperInChildClass;

public class TestFamily {
	public static void main(String[] args) {
		System.out.println("****Default constructor initialized for Daughter Class****");

		Daughter daughter01 = new Daughter();

		System.out.println("****parameterized constructor initialized for Daughter Class****");

		Daughter daughter02 = new Daughter("October", 36);

		System.out.println("****void type method initialized for Daughter Class****");

		daughter01.daughter();

		System.out.println("****Parameterized method initialized for Daughter Class****");

		daughter01.daughterInfo("October", 36);

		System.out.println("****Default constructor initialized for Father Class****");

		Father father01 = new Father();

		System.out.println("****parameterized constructor initialized for Father Class****");

		Father father02 = new Father("Abdur", 67, 'M', false);

		System.out.println("****void type method initialized for Father Class****");
		father01.father();

		System.out.println("****Parameterized method initialized for Father Class****");
		father01.fatherInfo("Abdur", 67, 'M', false);

	}

}

package hw8Q2UseOfSuperInChildClass;

public class Daughter extends Father {
	public String birthMonth;
	public int age;

	public Daughter() {
		super("Abdur", 67, 'M', false);// Super method can call either default or parameterized constructor from a
										// parent class
		super.father();
		super.fatherInfo("Razzaque", 66, 'M', false);// Super keyword can call the parameterized method from the parent
														// class
		super.familyName = "Molla";// super keyword can initialize variable from parent class
        super.name = "Abdur";
        super.age = 66;
        super.sex = 'M';
        super.usCitizen = false;
		System.out.println("Family name is:" + familyName);
		System.out.println("This is a default constructor from Daughter class");

	}

	public Daughter(String birthMonth, int age) {
		super("Tahmina", 36, 'F', false);// Super method can call either default or parameterized constructor from a
											// parent class
		super.fatherInfo("Lima", 44, 'F', false);// Super keyword can call the parameterized method from the parent
													// class
		super.familyName = "Molla";// super keyword can initialize variable from parent class
		super.name = "Abdur";
        super.age = 66;
        super.sex = 'M';
        super.usCitizen = false;
        System.out.println("Family name is:" + familyName);

		this.birthMonth = birthMonth;
		this.age = age;

		System.out.println("Birth Month: " + birthMonth + "\nAge:" + age);
	}

	public void daughter() {
		super.father();
		super.fatherInfo("Lima", 44, 'F', false);
		super.familyName = "Molla";// super keyword can initialize variable from parent class
		super.name = "Abdur";
        super.age = 66;
        super.sex = 'M';
        super.usCitizen = false;
        System.out.println("Family name is:" + familyName);
		System.out.println("This is a void method from Daughter class");
	}

	public void daughterInfo(String birthMonth, int age) {
		super.father();
		super.fatherInfo("Lima", 44, 'F', false);
		super.familyName = "Molla";// super keyword can initialize variable from parent class
		super.name = "Abdur";
        super.age = 66;
        super.sex = 'M';
        super.usCitizen = false;
        System.out.println("Family name is:" + familyName);

		this.birthMonth = birthMonth;
		this.age = age;
		System.out.println("Birth Month: " + birthMonth + "\nAge:" + age);
	}
}

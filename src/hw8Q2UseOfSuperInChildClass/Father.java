package hw8Q2UseOfSuperInChildClass;

public class Father {
	public String name;
	public int age;
	public char sex;
	public boolean usCitizen;
	public String familyName;
	
	public Father() {
		System.out.println("This is a default constructor from Father class");
	}
	
	public Father(String name, int age, char sex, boolean uscitizen) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.usCitizen = uscitizen;
		
		System.out.println("Name: "+name+"\nAge:"+age+"\nSex:"+sex+"\nUSCitizen:"+usCitizen);
	}
public void father() {
	System.out.println("void type method is implemented");
	
}
public void fatherInfo(String name, int age, char sex, boolean uscitizen) {
	this.name = name;
	this.age = age;
	this.sex = sex;
	this.usCitizen = uscitizen;
	
	System.out.println("Name: "+name+"\nAge:"+age+"\nSex:"+sex+"\nUSCitizen:"+usCitizen);
}






	}



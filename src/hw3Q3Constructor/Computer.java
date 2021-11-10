package hw3Q3Constructor;

public class Computer {
	public String Brand;
	public String Model;
	public String OperatingSystem;
	public int price;
	public char grade;
	public boolean madeInUSA;
	
	public Computer() { // Default Constructor
		System.out.println("This is from default Constructor of Computer class");
	}
	
	//parameterized constructor 01 declared
	
	
	public Computer(String Brand, String Model, String OperatingSystem, int price, char grade, boolean madeInUSA ) {
	this.Brand = Brand;
	this.Model = Model;
	this.OperatingSystem = OperatingSystem;
	this.price = price;
	this.grade = grade;
	this.madeInUSA = madeInUSA;
	System.out.println("My Brand:"+ Brand + "\nModel:"+ Model + "\nOperating System:"+OperatingSystem
			+ "\nPrice:" + price + "\nGrade:" + grade + " \nMade in USA? Ans:" + madeInUSA);
}
	//parameterized constructor 02 declared
	public Computer(String Brand,int price,char grade) {
		this.Brand=Brand;
		this.price=price;
		this.grade=grade;
		System.out.println("My Brand:"+Brand+" Price:"+price+" Grade"+grade);
	}
	//parameterized constructor 03 declared
	public Computer(String Brand,String Model,int price,char grade,boolean madeInUSA) {
		this.Brand=Brand;
		this.Model=Model;
		this.price=price;
		this.grade=grade;
		this.madeInUSA=madeInUSA;
		
		System.out.println("My brand:"+Brand+" Model:"+Model+" Price:"+price+" Grade:"+grade+" Made in USA? Ans:"+madeInUSA);
	}
  
   }

 


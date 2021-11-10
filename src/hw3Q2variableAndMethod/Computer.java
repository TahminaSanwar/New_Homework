package hw3Q2variableAndMethod;

public class Computer {

	public String Brand;
	public String Model;
	public String OperatingSystem;
	public int price;
	public char grade;
	public boolean madeInUSA;


	public Computer() {
		System.out.println();

	}

	public void configuration() {
		System.out.println("My Brand:"+ Brand + "\nModel:"+ Model + "\nOperating System:"+OperatingSystem
				+ "\nPrice:" + price + "\nGrade:" + grade + " \nMade in USA? Ans:" + madeInUSA);
		
	}
}

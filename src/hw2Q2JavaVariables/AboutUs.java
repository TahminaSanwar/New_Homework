package hw2Q2JavaVariables;

public class AboutUs {
	// String and variables are declared here
	
	public String MyName;
	public byte myAge;
	public short myHouseRent;
	public int mySalary;
	public long myBankBalance;
	public char mySex;
	public float myHeight;
	public double myGrade;
	public boolean usCitizen;
	

	//The constructor is declared 
	
	public AboutUs() {
		System.out.println("This is all about me:");
		
	}
	// The method is implemented here
	
	public void aboutUs() {
		System.out.println("My name is: "+MyName+"\nMy Age: " +myAge+ "\nMy house rent: "+myHouseRent+"\nMy salary: "+mySalary+"\nMy bank balance: "+myBankBalance+"\nMy sex: "+mySex+"\nMy height: "+myHeight+"\nMy grade: "+myGrade+"\nUS Citizen: "+usCitizen);
	}
}
	
	


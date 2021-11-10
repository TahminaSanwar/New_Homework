package hw3Q4Constructor;

public class Student {
	public String StName;
	public int stID;
	public char sex;
	public float grade;
	public boolean programmer;
	
	public Student() { //default constructor declared
		System.out.println("This is from default Constructor of Student class");
	}
	//Parameterized constructor
	
	public Student(String StName, int stID, char sex, float grade, boolean programmer ) {
	this.StName=StName;
	this.stID=stID;
	this.sex=sex;
	this.grade=grade;
	this.programmer=programmer;
	System.out.println("Student Name: "+StName+" \n"+stID+" \nSex: "+sex+" \nGrade:"+grade+" \nJava Programmer? Ans: "+programmer); 
	}
	//Parameterized method
	public void student(String StName, int stID, char sex, float grade, boolean programmer) {
		this.StName=StName;
		this.stID=stID;
		this.sex=sex;
		this.grade=grade;
		this.programmer=programmer;
		System.out.println("Student Name: "+StName+" \nID: "+stID+" \nSex: "+sex+" \nGrade:"+grade+" \nJava Programmer? Ans: "+programmer); 
		}
		
		
	}

	
	



package hw2Q2JavaVariables;

public class TestAboutUS {
	
	public static void main(String[] args) {
		
		AboutUs aboutUs1 = new AboutUs(); //Constructor initialized
		//Here variable is initialized
		aboutUs1.MyName = "Tahmina Sanwar";
		aboutUs1.myAge = 36;
		aboutUs1.myHouseRent = 2000;
		aboutUs1.mySalary = 200000;
		aboutUs1.myBankBalance = 2000000;
		aboutUs1.mySex = 'F';
		aboutUs1.myHeight = 150f;
		aboutUs1.myGrade = 3.1415927410 ;
		aboutUs1.usCitizen = true;
		aboutUs1.aboutUs(); //Method initialized or declr
		
		System.out.println("\n**********************************************");
		
		
		AboutUs aboutUs2= new AboutUs(); //Constructor initialized
		aboutUs2.MyName = "Alex";
		aboutUs2.myAge = 40;
		aboutUs2.myHouseRent = 2200;
	    aboutUs2.mySalary = 150000;
		aboutUs2.myBankBalance = 2500000;
		aboutUs2.mySex = 'M';
		aboutUs2.myHeight = 160f;
		aboutUs2.myGrade = 3.1415927410;
		aboutUs2.usCitizen = false;
		aboutUs2.aboutUs(); //Method initialized
		
		
		 
		 
		
	
				
		
		
				
		
		}

}

//Test


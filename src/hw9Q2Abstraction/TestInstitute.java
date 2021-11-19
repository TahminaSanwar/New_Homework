package hw9Q2Abstraction;

public class TestInstitute {

	public static void main(String[] args) {

		ColumbiaUniversity columbiaUniversity = new ColumbiaUniversity();
		columbiaUniversity.biochemistryLab();
		columbiaUniversity.caring();
		columbiaUniversity.gymnasium();
		columbiaUniversity.communityCollege();//default method from ColumbiaUniversity Class
		// University university = new University();//Interface can not be instantiated
		ColumbiaUniversity.biology();
		University.library();// Interface can directly call a static method
		
		
		// MedicalSchool medicalSchool = new MedicalSchool();//Abstract class can not be instantiated
		
		columbiaUniversity.anatomyLab();// columbiaUniversity extended MedicalSchool and anatomyLab is a void or non Abstract method from MedicalSchool Abstract class

	}

}

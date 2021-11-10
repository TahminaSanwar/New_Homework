package hw7Q2Encapsulation;

public class Employee {
	
		private String name;
		private int age;
		private char sex;
		private boolean usCitizen;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public char getSex() {
			return sex;
		}
		public void setSex(char sex) {
			this.sex = sex;
		}
		public boolean isUsCitizen() {
			return usCitizen;
		}
		public void setUsCitizen(boolean usCitizen) {
			this.usCitizen = usCitizen;
		}
		
		public static void main(String[]args ) {
			Employee employee= new Employee();
			employee.setName("Tahmina");
			employee.setAge(36);
			employee.setSex('F');
			employee.setUsCitizen(true);
			System.out.println("Employee Info:\n"+employee.getName()+"\n"+employee.getAge()+"\n"+employee.getSex()+"\n"+employee.isUsCitizen());
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			
		
		

	

	}




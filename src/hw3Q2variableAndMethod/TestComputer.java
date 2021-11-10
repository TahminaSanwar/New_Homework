package hw3Q2variableAndMethod;

public class TestComputer {

	public static void main(String[] args) {
		Computer computer1 = new Computer();
		computer1.Brand = "Apple";
		computer1.Model = "MacBook Air";
		computer1.OperatingSystem = "MacOS Mojave";
		computer1.price = 800;
		computer1.grade = 'C';
		computer1.madeInUSA = false;
		computer1.configuration();
		

		System.out.println("\n***********************************");

		Computer computer2 = new Computer();
		computer2.Brand = "HP Laptop";
		computer2.Model = "HP";
		computer2.OperatingSystem = "Windows 11";
		computer2.price = 699;
		computer2.grade = 'C';
		computer2.madeInUSA = false;
		computer2.configuration();

	}

}

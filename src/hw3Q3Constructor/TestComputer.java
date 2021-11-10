package hw3Q3Constructor;

public class TestComputer {

	public static void main(String[] args) {
		Computer computer = new Computer();
		Computer computer1 = new Computer("Apple","MacBook Air","MacOS Mojave",800,'C',false);
		System.out.println("\n**************************************");
		Computer computer2 = new Computer("Apple",800, 'C' );
		System.out.println("\n**************************************");
		Computer computer3 = new Computer("Apple","MacBook Air",800,'C',false);
		
		//hw3Q2variableAndMethod.Computer computerFromAnothePlanet = new hw3Q2variableAndMethod.Computer();
		//computerFromAnothePlanet.Brand = "HP Laptop";
		//computerFromAnothePlanet.Model = "HP";
		//computerFromAnothePlanet.OperatingSystem = "Windows 11";
		//computerFromAnothePlanet.price = 699;
		//computerFromAnothePlanet.grade = 'C';
		//computerFromAnothePlanet.madeInUSA = false;
		//computerFromAnothePlanet.configuration();
//Experiment
	}

}

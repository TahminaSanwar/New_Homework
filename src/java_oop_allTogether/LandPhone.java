package java_oop_allTogether;

public class LandPhone implements Phone, Pager, Wakitaki  {

	@Override
	public void interfaceInfo() {
		System.out.println("This method is from phone interface");

	}

	@Override
	public void call() {
		System.out.println("This method is from phone interface");

	}

	@Override
	public void message() {
		System.out.println("This method is from phone interface");

	}

	@Override
	public void camera() {
		System.out.println("This method is from phone interface");

	}

}

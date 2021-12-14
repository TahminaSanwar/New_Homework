package java_oop_allTogether;

public class Iphone1 extends AppleWatch implements Phone {
	private int price;
	private String info;
	private char user;
	private boolean madeInUsa;
	
	

	public int getPrice() {
		return price;
	}



	public void setPrice(int price) {
		this.price = price;
	}



	public String getInfo() {
		return info;
	}



	public void setInfo(String info) {
		this.info = info;
	}



	public char getUser() {
		return user;
	}



	public void setUser(char user) {
		this.user = user;
	}



	public boolean isMadeInUsa() {
		return madeInUsa;
	}



	public void setMadeInUsa(boolean madeInUsa) {
		this.madeInUsa = madeInUsa;
	}



	public void regularClassInfo() {
		System.out.println("A class contain only non abstract method. Abstract classcontain abstract and non abstract method both. In Class method is only implemented. In abstract class method is only defined (non abstract method is implemented) and in interface method is only declared. A Class can be instansiated. But an abstract class and interface can not be instansiated");

	}
	
	

	@Override
	public void interfaceInfo() {
		

	}

	@Override
	public void call() {
		

	}

	@Override
	public void message() {
		

	}

	@Override
	public void camera() {
		
	}

	@Override
	void appleWatchInfo() {
		

	}

}


package java_oop_allTogether;

public class TestPhone {

	public static void main(String[] args) {
		Iphone1 ip = new Iphone1();
		ip.interfaceInfo();
		ip.call();
		ip.message();
		ip.camera();
		ip.appleWatchInfo();
		ip.regularClassInfo();

		// Abstract class can not be instantiated. Need a help of concrete class to do)
		// it)
		AppleWatch ap = new Iphone1();
		ap.appleWatchInfo();
		ap.abstractClassInfo();

		// (Interface can not be instantiated. Need a help of concrete class to do)
		Phone ph = new Iphone1();
		Phone.wireless();
		ph.interfaceInfo();
		ph.call();
		ph.message();
		ph.camera();
		ph.battery();
		
		System.out.println("**********************************************");

		Iphone1 iphone1 = new Iphone1();
		iphone1.setPrice(750);
		iphone1.setInfo("I bought this phone in 2000");
		iphone1.setUser('F');
		iphone1.setMadeInUsa(false);
		
		System.out.println("Info:"+iphone1.getInfo()+",\nThe price was:"+iphone1.getPrice()+",\nUser Sex:"+iphone1.getUser()+",\nMade in USA:"+iphone1.isMadeInUsa());

	}

}

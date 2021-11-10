package hw6Q3Abstraction;

public interface College {
	
	public College() {//interface can not have constructor. 
		              //Interface cannot be instantiated cannot create object
	}
	public void commonRoom();
	public void laboratory();
	public void languageClub();

}

package hw6Q2Inheritance;

public class TestAnimal {

	public static void main(String[] args) {
		Animal animal= new Animal();
		animal.animalInfo();
		
		Birds birds = new Birds();
		birds.birdsInfo();
		birds.animalInfo();//Single Inheritance
		
		
		BullDog bullDog = new BullDog();
		bullDog.bullDogInfo();
		bullDog.dogInfo();
		bullDog.animalInfo();
		
		
		
		Cobra cobra = new Cobra();
		cobra.cobraInfo();
		cobra.snakeInfo();
		cobra.animalInfo();
		
		Dog dog = new Dog();
		dog.dogInfo();
		dog.mammalInfo();
		dog.animalInfo();
		
		Mammal mammal = new Mammal();
		mammal.mammalInfo();
		mammal.animalInfo();
		
		Reptile reptile = new Reptile();
		reptile.reptileInfo();
		reptile.animalInfo();
		
		Robin robin = new Robin();
		robin.robinInfo();
		robin.birdsInfo();//Hierarchical inheritance
		robin.animalInfo();//Hierarchical inheritance
		
		Snake snake = new Snake();
		snake.snakeInfo();
		snake.reptileInfo();
		snake.animalInfo();
		
			
		
		
		
		
		
		
		

	}

}

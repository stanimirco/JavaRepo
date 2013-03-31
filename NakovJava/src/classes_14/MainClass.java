package classes_14;

public class MainClass {

	private MainClass(){}
	
	public static void main(String[] args) {

		final Dog myDog = new Dog("Sharo");
		myDog.bark();
		
		myDog.setDogName("Balkan");
		myDog.bark();
		
		final Point firtsPoint = new Point();
		firtsPoint.showPoint();
	}

}

package classes_14;

public class Dog {

	private static int countInstanses = 0;
	private String name;
	
	public static int getNumberOfInstanses(){
		return Dog.countInstanses;
	}
	
	public Dog(){
		this("Benji");
	}
	
	public Dog( String name ){
		this.name = name;
		Dog.countInstanses++;
	}
	
	public String getDogName(){
		return this.name;
	}
	
	public void setDogName( String name ){
		this.name = name;
	}
	
	public void bark(){
		final int UPPER_LIMIT = 5;
		
		for (int i = 0; i < UPPER_LIMIT; i++){
		System.out.println("The dog " + this.name + " is currently barking.");
		}
	}
}

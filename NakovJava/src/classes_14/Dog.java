package classes_14;

public class Dog {

	private String name;
	
	public Dog(){
		this.name = "Benji";
	}
	
	public Dog( String name ){
		this.name = name;
	}
	
	public String getDogName(){
		return this.name;
	}
	
	public void setDogName( String name ){
		this.name = name;
	}
	
	public void bark(){
		System.out.println("The dog " + this.name + " is currently barking.");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog myDog = new Dog("Lassi");
		myDog.bark();
		myDog.setDogName("Stupid");
		myDog.bark();
		
	}

}

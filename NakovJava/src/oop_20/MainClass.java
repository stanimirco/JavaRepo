package oop_20;

public class MainClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lion myLion = new Lion();
		
		System.out.print("My lion is ");
		if (myLion.isMale()){
			System.out.println("male.");
		} else {
			System.out.println("female.");
		}
		
		System.out.println("And is " + myLion.getWeight() + "kg weight.");
		
		System.out.println(myLion);
		
		myLion.feedTheLion();
	}

}

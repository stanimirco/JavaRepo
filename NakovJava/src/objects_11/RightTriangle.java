package objects_11;
import java.util.Scanner;

public class RightTriangle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the value of the firts cathet: ");
		int a = input.nextInt();
		System.out.print("Enter the value of the second cathet: ");
		int b = input.nextInt();
		input.close();
		
		System.out.println("The value of the hypotenuse is: " + calcHypotenuse(a, b));
	}
	
	private static double calcHypotenuse(double a, double b){
		//c^2 = a^2 + b^2
		return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
	}

}

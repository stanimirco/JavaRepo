package methods_09;
import java.util.Scanner;

public class Number_09 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("Type the number of your choise.");
		System.out.println("1. Reverse digits in a numner.");
		System.out.println("2. Calculate middle arithmetic value of a number sequence.");
		System.out.println("3. Calculate linear equation of type Ax + B = 0.");
		System.out.print("Please make your choise:");
		
		Scanner input = new Scanner(System.in);
		int choise = input.nextInt();
		
		if ( (choise < 1) || (choise > 3) ){
			System.out.print("Invalid choise!");
		}else{
			switch (choise) {
			case 1:
				System.out.print("Enter your number:");
				System.out.println(reverseDigits(input.nextInt()));
				break;
			case 2:
				
				break;
			case 3:
				
				break;

			default:
				break;
			}
		}
		
		
//		System.out.println(sredno(1,2,3,4));
//		System.out.println(calcLinearEq(3.7f, 12));
	}

	private static float calcLinearEq(float a, float b){
		return -( b / a);
	}
	
	private static float sredno(int... numbers){
		float result;
		int sum = 0;
		
		for (int num:numbers ){
			sum += num;
		}
		
		result = sum / numbers.length;
		
		return result;
	}
	
	private static int reverseDigits(int number){
		int reversed = 0;
		int temp = number;
		
		while (number > 0){
			temp %= 10;
			number /= 10;
			reversed *= 10;
			reversed += temp;
			temp = number;
		}
		
		return reversed;
	}
}

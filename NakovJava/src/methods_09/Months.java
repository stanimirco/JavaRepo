package methods_09;
import java.util.Scanner;

public class Months {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first month number: ");
		int x = input.nextInt();
		//System.out.println();
		
		System.out.print("Enter second month number: ");
		int y = input.nextInt();
		System.out.println();
		
		input.close();
		
		if (CheckMonthValidity(x, y)){
			int diff;
			
			if (x<y){
				diff = y-x;
			}else{
				diff = x-y;
			}
			
			System.out.print("There are " + diff + " months period from ");
			PrintMonth(x);
			System.out.print("to ");
			PrintMonth(y);
		}
	}
	
	public static void PrintMonth(int month){
		switch (month) {
		case 1:
			System.out.print("January ");
			break;
		case 2:
			System.out.print("February ");
			break;
		case 3:
			System.out.print("March ");
			break;
		case 4:
			System.out.print("April ");
			break;
		case 5:
			System.out.print("May ");
			break;
		case 6:
			System.out.print("June ");
			break;
		case 7:
			System.out.print("July ");
			break;
		case 8:
			System.out.print("August ");
			break;
		case 9:
			System.out.print("September ");
			break;
		case 10:
			System.out.print("October ");
			break;
		case 11:
			System.out.print("November ");
			break;
		case 12:
			System.out.print("Desember ");
			break;

		default:
			System.out.println();
			System.out.println(" Not Valid Month!!! ");
			break;
		}
	}

	private static boolean CheckMonthValidity( int x, int y ){
		boolean isMonthValid = true;
		
		if ( (x < 1) || (x > 12) ){
			System.out.println("Not valid month number: first month.");
			isMonthValid = false;
		}
		
		if ( (y < 1) || (y > 12) ){
			System.out.println("Not valid month number: second month.");
			isMonthValid = false;
		}
		
		return isMonthValid;
	}
}

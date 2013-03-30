package methods_09;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Triangle {

	public Triangle() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.print("n = ");

		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		System.out.println();
		
		DrawIncrease(n);
		DrawDecrease(n);
		
		input.close();
	}
	
	private static void DrawIncrease(int n){
		for (int line = 1; line <= n; line++){
			DrawLine(line);
		}
	}

	private static void DrawDecrease(int n){
		for (int line = n-1; line >= 1; line--){
			DrawLine(line);
		}
	}
	
	private static void DrawLine(int line){
		for (int pos = 1; pos <= line; pos++){
			System.out.print(pos + " ");
		}
		System.out.println();
	}
}

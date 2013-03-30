package methods_09;
import java.util.Scanner;

public class TemperatureConverter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter body temperature in Fahrenheit: ");
		float CelciusTemp = ConvertFahrenheitToCelcius(input.nextFloat());
		input.close();
		
		System.out.println("Your body temperature is " + CelciusTemp + ".");
		if ( CelciusTemp > 37.0f ){
			System.out.println("You are ill!");
		}
	}
	
	private static float ConvertFahrenheitToCelcius( float FahrenheitTemp ){
		return (float)((FahrenheitTemp - 32) * 5 / 9);
	}

}

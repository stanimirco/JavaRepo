package recusion_10;

public class Factoriel {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fact(5));
		methods_09.Months month = new methods_09.Months();
		month.PrintMonth(3);
		
	}

	//n! = n(n-1)!
	private static long fact(int n){
		if ( n < 2 ){
			return 1;
		}else{
			return n*fact(n-1);
		}
	}
}

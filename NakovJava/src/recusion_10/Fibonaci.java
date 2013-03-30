package recusion_10;

public class Fibonaci {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fib(4));
	}

	private static long fib(int n){
		if (n <= 2){
			return 1;
		}else{
			return fib(n-1) + fib(n-2);
		}
	}
}

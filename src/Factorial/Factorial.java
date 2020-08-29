package Factorial;

public class Factorial {

	public static void main (String [] args) {
		int num = 6;
		int resultado = factorial(num);
		System.out.println(resultado);
		
		
	}
	public static int factorial(int num) {
		
		int result;
		
		if (num == 1) {
			return 1;
		}
		else {
			result = num * factorial(num -1);
			
		}
		return result;
	}
}

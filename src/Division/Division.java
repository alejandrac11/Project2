package Division;

public class Division {

	public static void main (String[]args) {
		int a=100;
		int b=5;
		int resultado = div( a, b);
		System.out.println(resultado);
	}
	
	public static int div(int a, int b) {
		 if(a<b) {
			 return 0;
		 }
		 else {
			 return 1 + div(a-b, b);
		 }
	}
}

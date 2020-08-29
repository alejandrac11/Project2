package Potencia;

public class Potencia {

	public static void main (String[]args) {
		int a= 4;
		int b=6;
		int resultado = potencia(a, b);
		System.out.println("La potencia es:" + resultado);
	}
	
	public static int potencia (int a, int b) {
		if (b==1) {
			return a;
		}
		return a * potencia(a, b-1);
	}
}

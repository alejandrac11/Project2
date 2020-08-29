package SumaNum;

public class SumaNumeros {

	public static void main (String[]args) {
		
		int array[]= {1,2,3,4};
		
		System.out.println("La suma de los valores del arreglo, es: " + sumaNumeros(array,0));
			}
	public static int sumaNumeros (int array[], int elem) {
		if(elem<array.length) {
			return array[elem]+sumaNumeros(array,elem+1);
		}
		return 0;
	}
}

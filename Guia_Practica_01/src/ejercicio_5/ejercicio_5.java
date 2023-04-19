package ejercicio_5;
import java.util.Scanner;

public class ejercicio_5 {

	public static void main(String[] args) {
		Scanner scannerInt = new Scanner(System.in);
		System.out.println("Ingrese numero entero: ");
		int nroInt = scannerInt.nextInt();
		System.out.println("El doble de " + nroInt + " es " +  (nroInt * 2));
		System.out.println("El triple de " + nroInt + " es " + (nroInt * 3));
		System.out.println("La raiz cuadrada de " + nroInt + " es " + Math.sqrt(nroInt));
	}

}

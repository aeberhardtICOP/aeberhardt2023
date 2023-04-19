package ejercicio_1;
import java.util.Scanner;
public class ejercicio_1 {

	public static void main(String[] args) {
		System.out.println("Ingrese primer numero:");
		Scanner scanner = new Scanner(System.in);
		int nro1 = scanner.nextInt();
		System.out.println("Ingrese segundo numero: ");
		int nro2 = scanner.nextInt();
		System.out.println("La suma de los numeros ingresados es " + (nro1 + nro2));

	}

}
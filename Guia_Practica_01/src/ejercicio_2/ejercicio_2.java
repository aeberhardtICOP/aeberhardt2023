package ejercicio_2;
import java.util.Scanner;

public class ejercicio_2 {

	public static void main(String[] args) {
		Scanner scannerNombre = new Scanner(System.in);
		System.out.println("Ingrese su nombre");
		String nombre = scannerNombre.nextLine();
		System.out.println("Su nombre es "+ nombre);
	}

}

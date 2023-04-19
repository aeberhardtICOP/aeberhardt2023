package ejercicio_4;
import java.util.Scanner;
public class ejercicio_4 {

	public static void main(String[] args) {
		Scanner scannerGrados = new Scanner(System.in);
		System.out.println("Ingrese ºC");
		int gradosC = scannerGrados.nextInt();
		int gradosF = 32 + (9*gradosC/5);
		System.out.println("Equivalen a " + gradosF +" grados Farenheit");
		
		

	}

}

package progII_guia03_EberhardtA;
import java.util.Scanner;
public class Ejercicio_01 {
	public void Ejercicio_01() {
		System.out.println("Se genero una instancia de Ejercicio_01");
	}
	public void holaUsuario(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese nombre");
		String nombre = scanner.nextLine();
		System.out.println("Hola " + nombre + "!!!");
		
	}

}

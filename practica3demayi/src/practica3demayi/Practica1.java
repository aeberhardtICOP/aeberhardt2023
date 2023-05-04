package practica3demayi;
import java.util.Scanner;

public class Practica1 {
	public static void validar(String ident) {
		char primeraLetra=ident.charAt(0);
		System.out.println((primeraLetra=='_'||primeraLetra=='$'||(int)primeraLetra>=97 && (int)primeraLetra<=122)? "Es valido":"No es valido");
		
		
	}

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Ingrese palabra");
		String identificador=scanner.nextLine();
		/*if (Character.toString(identificador.charAt(0)).matches("[a-z]") || Character.toString(identificador.charAt(0)).matches("$") || Character.toString(identificador.charAt(0)).matches("_") ) {
			System.out.println("Es valido");
		}else {
			System.out.println("No es valido");
		
		}*/
	/*System.out.println((identificador.charAt(0)=='_' || identificador.charAt(0)=='$' || (int)identificador.charAt(0)>=97 && (int)identificador.charAt(0)<=122) ? "Es valido" : "No es valido");*/
		validar(identificador);
	}

}

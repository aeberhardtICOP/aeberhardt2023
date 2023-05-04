package practica3demayi;
import java.util.Scanner;

public class practica2 {
	public static void validar(String ident) {
			char primeraLetra=ident.charAt(0);
			System.out.println((primeraLetra=='_'||primeraLetra=='$'||(int)primeraLetra>=97 && (int)primeraLetra<=122)? "Es valido":"No es valido");
		}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Ingrese palabra:");
		String identificador=scanner.nextLine();
		switch(identificador.charAt(0)) {
		case '_':
			System.out.println("Es valido");
			break;
		case'$':
			System.out.println("Es valido");
			break;
		default:
			if(identificador.charAt(0)>=97 && identificador.charAt(0)<=122) {
				System.out.println("Es valido");
			}else {
				System.out.println("No es valido");
			}
		
		}
	}

}


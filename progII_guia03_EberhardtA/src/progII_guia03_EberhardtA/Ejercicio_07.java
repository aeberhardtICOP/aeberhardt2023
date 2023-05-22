package progII_guia03_EberhardtA;
import java.util.Scanner;
public class Ejercicio_07 {
	public int cuentaPalabras(String cadena) {
		int cantidad=0;
		for(int i=0; i<cadena.length();i++) {
			//identificar espacios
			if ((int)cadena.charAt(i)==32){
				cantidad++;
			}
			//si no esta en el final de la cadena
			if(i!=(cadena.length()-1)){
				//identificar comas y puntos, pero que no tengan espacios al final
				if((int)cadena.charAt(i)==44 && (int)cadena.charAt(i+1)!=32||(int)cadena.charAt(i)==46 && (int)cadena.charAt(i+1)!=32) {
					cantidad++;
				}
				//identificar punto o coma al final de la cadena
				}else if((int)cadena.charAt(i)==44||(int)cadena.charAt(i)==46) {
					cantidad++;
			}
			
		}
		//identificar palabra final, en el caso de que no haya punto final.
		if((int)cadena.charAt((cadena.length())-1)!=46) {
			//System.out.println("char en la posicion " +(cadena.length()-1) +" es " + cadena.charAt((cadena.length()-1)));
			cantidad++;
		}
		return cantidad;	
	}
	public void ingresarPalabra() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingrese texto: ");
		String texto=scanner.nextLine();
		System.out.println("La cantidad de palabras que tiene la cadena es: " + cuentaPalabras(texto));
		

	}
}

package progII_guia03_EberhardtA;
import java.lang.reflect.Array;
import java.util.Scanner;
public class Ejercicio_15 {
	public void mostrarArreglo(char[]arreglo) {
		for(int i=0; i<arreglo.length;i++) {
			if(arreglo[i]!='\0') {
				System.out.print("["+arreglo[i]+"], ");
			}
		}
		System.out.println();
	}
	public void agregar () {
		Scanner scanner = new Scanner(System.in);
		char[] vocales= {'A','E','I','O','U'};
		char[]array=new char[10];
		int i=0;
		int num=0;
		do {
			System.out.println("Ingrese numero: ");
			num=scanner.nextInt();
			if(num>=0 && num<vocales.length) {
				array[i]=vocales[num];
				i++;
			}else if(num==-1) {
				
			}else {
				System.out.println("Error. Ingrese otro numero.");
			}
				
			
		}while (num!=-1 && i<array.length);
		mostrarArreglo(array);
		
		
	}
}

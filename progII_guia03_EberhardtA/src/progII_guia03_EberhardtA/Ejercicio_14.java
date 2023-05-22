package progII_guia03_EberhardtA;
import java.util.Scanner;
public class Ejercicio_14 {
	public int[] generarArreglo() {
		Scanner scanner = new Scanner(System.in);
		int[]arreglo=new int[10];
		System.out.println("A continuacion, ingrese los 10 valores");
		for (int i=0;i<arreglo.length;i++) {
			System.out.print(i+1+")");
			arreglo[i]=scanner.nextInt();
		}
		return arreglo;
	}
	public void mostrarArreglo(int[]arreglo) {
		System.out.println("Los valores del arreglo son los siguientes:");
		for(int i=0;i<arreglo.length;i++) {
			System.out.println((i+1)+")"+arreglo[i]);
		}
	}
	public void arreglo(){
		mostrarArreglo(generarArreglo());
	}
}

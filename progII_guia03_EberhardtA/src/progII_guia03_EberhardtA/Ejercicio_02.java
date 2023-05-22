package progII_guia03_EberhardtA;
import java.util.Random;
import java.util.Scanner;
public class Ejercicio_02 {
	public int[] generarArreglo(int n) {
		Random random = new Random();
		int[] arreglo=new int[n];
		for(int i=0;i<n;i++) {
			arreglo[i]=random.nextInt(100);
		}
		return arreglo;
	}
	public void mostrarArreglo(int[]arreglo) {
		for(int i=0; i<arreglo.length;i++) {
			System.out.print("["+arreglo[i]+"], ");
		}
		System.out.println();
	}
	public int[] mayorQuePromedio (int[]arreglo, int longitud, double promedio) {
		//System.out.println(longitud);
		int[] mayorQPromedio = new int[longitud];
		int j=0;
		for(int i=0;i<arreglo.length;i++) {
			//System.out.println(arreglo[i]);
			if(arreglo[i]>=promedio) {
				//System.out.println("J: " +j);
				//System.out.println(arreglo[i]);
				mayorQPromedio[j]=arreglo[i];
				j++;
			}
		}
		return mayorQPromedio;
	}
	public int sacarLongitud(int[]arreglo, double promedio) {
		int longitud=0;
		for(int i=0;i<arreglo.length;i++) {
			if (arreglo[i]>=promedio) {
				longitud++;
			}
		}
		return longitud;
	}
	public void promedioArreglo() {
		Scanner scanner=new Scanner(System.in);
		int sumatoria=0;
		double promedio=0.0;
		System.out.println("Ingrese cantidad de valores que debe tener el arreglo: ");
		int n=scanner.nextInt();
		int[] arreglo=new int[n];
		arreglo=generarArreglo(n);
		for(int i=0;i<arreglo.length;i++) {
			sumatoria=sumatoria+arreglo[i];
		}
		promedio=sumatoria/arreglo.length;
		System.out.println("El arreglo es: ");
		mostrarArreglo(arreglo);
		System.out.println("Su promedio es: "+promedio);
		int[]arreglo2=new int[sacarLongitud(arreglo, promedio)];
		arreglo2=mayorQuePromedio(arreglo,sacarLongitud(arreglo,promedio),promedio);
		System.out.println("Los numeros mayores a el promedio ("+promedio+") son: ");
		mostrarArreglo(arreglo2);
		
		
	}
}

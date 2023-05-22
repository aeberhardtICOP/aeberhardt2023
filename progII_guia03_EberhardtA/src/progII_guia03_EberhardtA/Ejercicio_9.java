package progII_guia03_EberhardtA;
import java.util.Random;
import java.util.Scanner;
public class Ejercicio_9 {
	public int[] ordenarVector(int[]vector){
		for (int i=0;i<vector.length;i++) {
			for(int j=0;j<(vector.length-1)-i;j++) {
				if(vector[j]>vector[j+1]) {
					int temp=vector[j];
					vector[j]=vector[j+1];
					vector[j+1]=temp;
				}
			}	
			
		}
		return vector;
	}
	public void mostrarArreglo(int[]arreglo) {
		for(int i=0; i<arreglo.length;i++) {
			System.out.print("["+arreglo[i]+"], ");
		}
		System.out.println();
	}
	public int[] generarArreglo(int n) {
		Random random = new Random();
		int[] arreglo=new int[n];
		for(int i=0;i<n;i++) {
			arreglo[i]=random.nextInt(100);
		}
		return arreglo;
	}
	public void ordenar() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("ingrese tamaño del vector: ");
		int n=scanner.nextInt();
		int[] vector=new int[n];
		vector=generarArreglo(n);
		System.out.println("El vector es:");
		mostrarArreglo(vector);
		System.out.println("Y ordenado queda:");
		vector=ordenarVector(vector);
		mostrarArreglo(vector);
		
		
		
		
	}
	
}

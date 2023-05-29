package arrays;
import java.util.Scanner;
import java.util.Random;
public class Ejercicio_02 {
	public void ejercicio_02() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingrese longitud del vector:");
		int longitud = scanner.nextInt();
		System.out.println("Generando vector..");
		int[]vector=generarVector(longitud);
		mostrarVector(vector);
		System.out.print("Ingrese numero que desea buscar: ");
		int num=scanner.nextInt();
		System.out.println("Buscando el numero..");
		buscarEnVector(num, vector);
	}
	public int[] generarVector (int num) {
		Random random = new Random();
		int[] vector=new int[num];
		for(int i=0;i<vector.length;i++) {
			vector[i]=random.nextInt(100);
		}
		return vector;
	}
	public void mostrarVector(int[]vector) {
		for(int i=0;i<vector.length;i++) {
			System.out.print("["+vector[i]+"]");
		}
		System.out.println();
	}
	public void buscarEnVector(int num, int[]vector) {
		boolean estaEnVector=false;
		int repeticiones=0;
		for(int i = 0;i<vector.length;i++) {
			if (vector[i]==num) {
				estaEnVector=true;
				repeticiones++;
			}
		}
		int[] posiciones=new int[repeticiones];
		int j=0;
		for(int i=0;i<vector.length;i++) {
			if (vector[i]==num) {
				posiciones[j]=i;
				j++;
			}
		}
		if (estaEnVector==true) {
			System.out.println("El numero " +num+" Se encuentra en el vector, en la posicion " + posiciones[0]);
			if(repeticiones>1) {
				System.out.print("Se repite en las posiciones: " );
				for (int i=1;i<posiciones.length;i++) {
					System.out.print(posiciones[i]+" ");
				}
				System.out.println();
			}
		}else {
			System.out.println(num+" no se encuentra en el vector :(");
		}
	}
}

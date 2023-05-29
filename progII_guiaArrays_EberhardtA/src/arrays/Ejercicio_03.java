package arrays;
import java.util.Random;
import java.util.Scanner;
public class Ejercicio_03 {
	public void ejercicio_03() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingrese tamaño del vector: ");
		int tamaño=scanner.nextInt();
		System.out.println("Generando vector..");
		int[]vector=generarVector(tamaño);
		System.out.println("Vector generado!Mostrando..");
		mostrarVector(vector);
		contadorDeDigitos(vector);
	}
	public int[] generarVector (int num) {
		Random random = new Random();
		int[] vector=new int[num];
		for(int i=0;i<vector.length;i++) {
			vector[i]=random.nextInt(99999);
		}
		return vector;
	}
	public void mostrarVector(int[]vector) {
		for(int i=0;i<vector.length;i++) {
			System.out.print("["+vector[i]+"]");
		}
		System.out.println();
	}
	public void contadorDeDigitos(int[]vector) {
		int cont1d=0;
		int cont2d=0;
		int cont3d=0;
		int cont4d=0;
		int cont5d=0;
		for (int i=0;i<vector.length;i++) {
			if (vector[i]<10) {
				cont1d++;
			}else if(vector[i]>=10 && vector[i]<99) {
				cont2d++;
			}else if(vector[i]>=100 && vector[i]<999) {
				cont3d++;
			}else if(vector[i]>=1000 && vector[i]<9999) {
				cont4d++;
			}else if(vector[i]>=10000 && vector[i]<99999) {
				cont5d++;
			}
		}
		System.out.println("Numeros de 1 digito: "+cont1d+"\nNumeros de 2 digitos: "+cont2d+"\nNumeros de 3 digitos: "+cont3d+"\nNumeros de 4 digitos: "+cont4d+"\nNumeros de 5 digitos: "+cont5d);
	}
}

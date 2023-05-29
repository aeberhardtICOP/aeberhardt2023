package arrays;
import java.util.Scanner;
public class Ejercicio_05 {
	public void ejercicio_5() {
		System.out.println("Ingrese valores:  ");
		int[][] matriz = generarMatriz();
		mostrarMatriz(matriz);
		System.out.println("matriz traspuesta: ");
		mostrarMatriz(matrizTraspuesta(matriz));
		System.out.println(esAntisimetrica(matriz, matrizTraspuesta(matriz)) ? "Es Anti Simetrica":"No es Anti Simetrica");
	}
	public int[][] generarMatriz(){
		Scanner scanner = new Scanner(System.in);
		int[][] matriz = new int[3][3];
		for (int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.println("Posicion: "+i+", "+j);
				matriz[i][j]=scanner.nextInt();
			}
		}
		return matriz;
	}
	public void mostrarMatriz(int[][]matriz) {
		for (int i=0;i<matriz.length;i++) {
			for(int j=0;j<matriz.length;j++) {
				System.out.print("["+matriz[i][j]+"]");
			}
			System.out.println();
		}
	}
	public int[][] matrizTraspuesta(int[][]matriz){
		int[][]matrizTraspuesta= new int[3][3];
		for (int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				matrizTraspuesta[i][j]=matriz[j][i];
			}
		}
		return matrizTraspuesta;
	}
	public boolean esAntisimetrica(int[][]matriz, int[][]matrizTraspuesta) {
		boolean antiSimetrica=true;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(matriz[i][j]!=-matrizTraspuesta[i][j]) {
					//System.out.println("Matriz="+matriz[i][j]+",Traspuesta "+matrizTraspuesta[i][j]);
					antiSimetrica=false;
				}
			}
		}
		return antiSimetrica;
	}
}
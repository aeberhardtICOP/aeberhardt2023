package arrays;
import java.util.Random;
public class Ejercicio_04 {
	public void ejercicio_4() {
		System.out.println("matriz generada: ");
		int[][] matriz = generarMatriz();
		mostrarMatriz(matriz);
		System.out.println("matriz traspuesta: ");
		mostrarMatriz(matrizTraspuesta(matriz));
	}
	public int[][] generarMatriz(){
		Random random = new Random();
		int[][] matriz = new int[4][4];
		for (int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				matriz[i][j]=random.nextInt(10);
			}
		}
		return matriz;
	}
	public void mostrarMatriz(int[][]matriz) {
		for (int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				System.out.print("["+matriz[i][j]+"]");
			}
			System.out.println();
		}
	}
	public int[][] matrizTraspuesta(int[][]matriz){
		int[][]matrizTraspuesta= new int[4][4];
		for (int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				matrizTraspuesta[i][j]=matriz[j][i];
			}
		}
		return matrizTraspuesta;
	}
}

package arrays;
import java.util.Scanner;

public class Ejercicio_06 {
	public void ejercicio_6() {
		System.out.println("Ingrese valores:  ");
		int[][] matriz = generarMatriz();
		mostrarMatriz(matriz);
		esCuadradoMagico(matriz);
		System.out.println(esCuadradoMagico(matriz)? "Es cuadrado magico":"No es cuadrado magico");
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
	public boolean esCuadradoMagico (int[][]matriz) {
		boolean esCuadradoMagico=false;
		int[]sumaFilas = new int[3];
		int[]sumaColumnas = new int[3];
		int sumaDiagonal=0;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				sumaFilas[i]+=matriz[i][j];
			}
		}
		for(int j=0;j<3;j++) {
			for(int i=0;i<3;i++) {
				sumaColumnas[j]+=matriz[i][j];
			}
		}
		for (int i=0;i<3;i++) {
			sumaDiagonal+=matriz[i][i];
		}
		/*for(int i=0;i<3;i++) {
			System.out.println("Columna "+(i+1)+":"+sumaColumnas[i]+"\nFila "+(i+1)+":"+sumaFilas[i]);
		}*/
		System.out.println("Suma diagonal: "+sumaDiagonal);
		if(sumaFilas[0]==sumaFilas[1]&&sumaFilas[1]==sumaFilas[2]) {
			if(sumaFilas[2]==sumaColumnas[0]&&sumaColumnas[0]==sumaColumnas[1]&&sumaColumnas[1]==sumaColumnas[2]) {
				if(sumaColumnas[2]==sumaDiagonal) {
					esCuadradoMagico=true;
				}
			}
		}
		return esCuadradoMagico;
	}
}

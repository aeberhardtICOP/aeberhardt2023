package arrays;
public class Ejercicio_01 {
	public void ejercicio_01(){
		System.out.println("Generando vector con los 100 primeros numeros enteros...");
		int[] vector=llenarVector();
		System.out.println("Vector generado! mostrando vector..");
		mostrarVector(vector);
		System.out.println("Ordenando vector de manera descendiente..");
		vector=ordenarVectorDesc(vector);
		System.out.println("Vector ordenado! mostrando..");
		mostrarVector(vector);
	}
	public int[] llenarVector() {
		int[] vector= new int[100];
		for (int i=0;i<vector.length;i++) {
			vector[i]=i+1;
		}
		return vector;
	}
	public void mostrarVector(int[]vector) {
		for(int i=0;i<vector.length;i++) {
			System.out.print("["+vector[i]+"]");
		}
		System.out.println();
	}
	public int[] ordenarVectorDesc(int[]vector) {
		for (int i=0;i<vector.length;i++) {
			for(int j=0;j<(vector.length-1)-i;j++) {
				if(vector[j]<vector[j+1]) {
					int temp=vector[j];
					vector[j]=vector[j+1];
					vector[j+1]=temp;
				}
			}	

		}
		return vector;
	}
}

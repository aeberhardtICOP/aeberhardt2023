package progII_guia03_EberhardtA;
import java.util.Scanner;
public class Ejercicio_10 {
	public int[] ISBN (int[]vector) {
		int[]ISBN=new int[10];
		int sumatoria=0;
		for(int i=0;i<vector.length;i++) {
			sumatoria+=(vector[i]*(i+1));
			//System.out.println("sum"+i+"="+vector[i]+"*"+(i+1)+"="+vector[i]*(i+1));
			//System.out.println("Sumatoria"+i+"="+sumatoria);
		}
		//System.out.println("Sumatoria total= "+sumatoria);
		int caracterX=sumatoria%11;
		//System.out.println("cx= "+caracterX);
		System.arraycopy(vector, 0, ISBN, 0, vector.length);
		ISBN[9]=caracterX;
		return ISBN;
	}
	public int[] numeroAVector(int num) {
		int[] vector=new int[9];
		int resto=0;
		int i=8;
		
		do {
			resto=num%10;
			vector[i]=resto;
			num=(int)Math.floor(num/10);
			i--;
			
		}while (num!=0&&i>=0);
		return vector;
	}
	public void mostrarISBN(int[] vector) {
		for(int i=0; i<vector.length;i++) {
			if(i==1 || i==4 || i==9) {
				System.out.print("-");
			}
			System.out.print(vector[i]);
		}
		System.out.println();
	}
	public void ejercicio_10(){
		Scanner scanner=new Scanner(System.in);
		System.out.println("Ingrese codigo (sin guiones):");
		int num=(int)scanner.nextInt();
		int[]vector=numeroAVector(num);
		System.out.println("ISBN ingresado: ");
		mostrarISBN(vector);
		System.out.println("ISBN con digito verificador de control: ");
		mostrarISBN(ISBN(vector));
		
	}
}

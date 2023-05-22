package progII_guia03_EberhardtA;
import java.util.Scanner;
public class Ejercicio_06 {
	public boolean esDivisible(int nro) {
		boolean divisible=false;
		int i=1;
		do {
			if (i!=nro && i!=1) {
				if(nro%i==0) {
					divisible=true;
					//System.out.println("i="+i+"Divisible="+divisible);
				}
			}
			i++;
		}while(i<=10);
		return divisible;
	}
	public void esPrimo() {
		Scanner scanner = new Scanner(System.in);
		int nro=0;
		do {
			System.out.println("Ingrese numero: (o -1 para dejar de ingresar)");
			nro=scanner.nextInt();
			if (esDivisible(nro)==true) {
				System.out.println(nro+" no es primo!");
			}else {
				System.out.println(nro+ " es primo!");
			}
			}while(nro!=-1);
	}
}

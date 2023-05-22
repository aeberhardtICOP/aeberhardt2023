package progII_guia03_EberhardtA;
import java.util.Scanner;
public class Ejercicio_05 {
	public void fibonacci() {
		Scanner scanner = new Scanner(System.in);
		int nro1=0;
		int nro2=1;
		System.out.println("Elemento de la serie fib n°: ");
		int n=scanner.nextInt();
		int contador = 0;
		//n+1 por que empieza de la posicion 0
		while ((n+1)>contador) {
			nro1=nro1+nro2;
			nro2=nro1-nro2;
			contador++;
			//System.out.println("nro1= "+nro1+" nro2= "+nro2);
		}
		System.out.println("El elemento fibonacci n°" +n+ " es " + nro2);
	}
}

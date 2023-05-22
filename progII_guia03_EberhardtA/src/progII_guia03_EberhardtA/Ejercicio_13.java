package progII_guia03_EberhardtA;
import java.util.Scanner;
public class Ejercicio_13 {
	public int sumaRecursiva(int num) {
		if (num==1) {
			return 1;
		}else {
			return num+sumaRecursiva(num-1);
		}
	}
	public int sumaIterativa(int num) {
		int numReturn=0;
		for(int i=1;i<=num;i++) {
			numReturn+=i;
			
		}
		return numReturn;
	}
	public void suma() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese numero:");
		int numero=scanner.nextInt();
		System.out.println("Ingrese de que forma desea hacer la suma: \n1)recursiva\n2)iterativa");
		int opcion=scanner.nextInt();
		switch(opcion) {
		case 1:
			System.out.println(sumaRecursiva(numero));
			break;
		case 2:
			System.out.println(sumaIterativa(numero));
			break;
		default:
			System.out.println("Ingrese opcion 1 o 2 :$");
		}
	}
}

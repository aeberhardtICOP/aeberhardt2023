package progII_guia03_EberhardtA;
import java.util.Random;
import java.util.Scanner;
public class Ejercicio_11 {
	public void a_mostrarVariables(int n, double a, char c) {
		System.out.println("Variable N: "+n+"\nVariable A: "+a+"\nVariable C: "+c);
	}
	public float b_suma(int n, double a) {
		float suma=n+(float)a;
		return suma;
	}
	public float c_diferencia(double a, int n) {
		float diferencia=(float)a-n;
		return diferencia;
	}
	public int d_valorNumerico(char c) {
		int valor=(int)c;
		return valor;
	}
	public float e_sumaVariables(int n, double a, int valorc) {
		float suma= n+(float)a+valorc;
		return suma;
	}
	public void operando() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Ingrese el valor de las siguientes variables:");
		System.out.print("Variable N de tipo int: ");
		int n=scanner.nextInt();
		System.out.print("\nVariable A de tipo double: ");
		double a=scanner.nextDouble();
		System.out.print("\nVariable C de tipo char: ");
		char c=scanner.next().charAt(0);
		char opcion;
		do {
			System.out.println("Ingrese una de las siguientes opciones: \nA)Valor de cada variable: \nB)Suma de N+A\nC)Diferencia de A-N: \nD)Valor numerico de C: \nE)Suma de N+A+C: \nF)Salir ");
			opcion=Character.toUpperCase(scanner.next().charAt(0));
		
			switch(opcion) {
			case 'A':
				a_mostrarVariables(n, a, c);
				break;
			case 'B':
				System.out.println(n+"+"+a+"="+b_suma(n, a));
				break;
			case 'C':
				System.out.println(a+"-"+n+"="+c_diferencia(a, n));
				break;
			case 'D':
				System.out.println("valor numerico del caracter "+c+": "+d_valorNumerico(c));
				break;
			case 'E':
				System.out.println("Suma= "+e_sumaVariables(n, a, d_valorNumerico(c)));
				break;
			case 'F':
				System.out.println("Chau!");
			default:
				System.out.println("Ingrese una de las opciones.");
			}
		}while(opcion!='F');
		
		
	
	}
}

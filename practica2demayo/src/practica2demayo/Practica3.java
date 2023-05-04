package practica2demayo;
import java.util.Random;
import java.util.Scanner;

public class Practica3 {
	//variables orden: los puse en atributos para que puedan ser modificados por las funciones//
	private static int orden1;
	private static int orden2;
	private static int orden3;
	private static int orden4;
	
	//funciones//
	public static void ordenarAsc(int n1, int n2, int n3, int n4){
		if(n1<n2) {
			orden1=n1;
			orden2=n2;
		}else {
			orden1=n2;
			orden2=n1;
		}
		if(n3<orden1 ) {
			orden3=orden2;
			orden2=orden1;
			orden1=n3;
		}
		else if(n3<orden2) {
			orden3=orden2;
			orden2=n3;
		}else {
			orden3=n3;
		}
		if (n4<orden1){
			orden4=orden3;
			orden3=orden2;
			orden2=orden1;
			orden1=n4;
		}
		else if(n4<orden2){
			orden4=orden3;
			orden3=orden2;
			orden2=n4;
		}else if (n4<orden3) {
			orden4=orden3;
			orden3=n4;
		}else {
			orden4=n4;
		}

		System.out.println(orden1);
		System.out.println(orden2);
		System.out.println(orden3);
		System.out.println(orden4);
	}
	public static void ordenarDesc(int n1, int n2, int n3, int n4) {
		if(n1>n2) {
			orden1=n1;
			orden2=n2;
		}else {
			orden1=n2;
			orden2=n1;
		}
		if(n3>orden1 ) {
			orden3=orden2;
			orden2=orden1;
			orden1=n3;
		}
		else if(n3>orden2) {
			orden3=orden2;
			orden2=n3;
		}else {
			orden3=n3;
		}
		if (n4>orden1){
			orden4=orden3;
			orden3=orden2;
			orden2=orden1;
			orden1=n4;
		}
		else if(n4>orden2){
			orden4=orden3;
			orden3=orden2;
			orden2=n4;
		}else if (n4>orden3) {
			orden4=orden3;
			orden3=n4;
		}else {
			orden4=n4;
		}

		System.out.println(orden1);
		System.out.println(orden2);
		System.out.println(orden3);
		System.out.println(orden4);
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Random random = new Random();
		int num1= random.nextInt(1000);
		int num2= random.nextInt(1000);
		int num3= random.nextInt(1000);
		int num4= random.nextInt(1000);
		System.out.println("Numeros aleatorios: " + num1 +" "+num2+" "+num3+" "+num4);
		System.out.println("-----------------------------------------------------");
		System.out.println("¿De que forma desea ordenar los numeros? \n1-Adcendente\n2-Descendente");
		int opcion=scn.nextInt();
		switch(opcion) {
		case 1:
			ordenarAsc(num1,num2,num3,num4);
			break;
		case 2:
			ordenarDesc(num1,num2,num3,num4);
			
		}
	}

}

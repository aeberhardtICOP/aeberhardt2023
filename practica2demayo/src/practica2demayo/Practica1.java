package practica2demayo;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;


public class Practica1 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Random random = new Random();
		System.out.println("ingrese nombre");
		String nombre = scn.nextLine();
		System.out.println("Ingrese edad:");
		int edad = scn.nextInt();
		int num1= random.nextInt(1000);
		int num2= random.nextInt(1000);
		int num3= random.nextInt(1000);
		int num4= random.nextInt(1000);
		System.out.println("Nombre: " + nombre + " Edad: " + edad);
		System.out.println("Numeros aleatorios: " + num1 +" "+num2+" "+num3+" "+num4);
		int orden1;
		int orden2;
		int orden3;
		int orden4;
		if(num1<num2) {
			orden1=num1;
			orden2=num2;
		}else {
			orden1=num2;
			orden2=num1;
		}
		if(num3<orden1 ) {
			orden3=orden2;
			orden2=orden1;
			orden1=num3;
		}
		else if(num3<orden2) {
			orden3=orden2;
			orden2=num3;
		}else {
			orden3=num3;
		}
		if (num4<orden1){
			orden4=orden3;
			orden3=orden2;
			orden2=orden1;
			orden1=num4;
		}
		else if(num4<orden2){
			orden4=orden3;
			orden3=orden2;
			orden2=num4;
		}else if (num4<orden3) {
			orden4=orden3;
			orden3=num4;
		}else {
			orden4=num4;
		}

		System.out.println(orden1);
		System.out.println(orden2);
		System.out.println(orden3);
		System.out.println(orden4);
	}
}




//int [] numeros = {num1, num2, num3, num4};
//Arrays.sort(numeros);
//for (int n : numeros)
//System.out.println(n);


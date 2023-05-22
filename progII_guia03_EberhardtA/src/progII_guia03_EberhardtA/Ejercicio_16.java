package progII_guia03_EberhardtA;
import java.util.Scanner;
public class Ejercicio_16 {
	public void mostrar_notas(double[]notas, String[]notasEnString) {
		for(int i=0;i<notas.length;i++) {
			System.out.println("Alumno n°"+(i+1)+"|Nota="+notas[i]+"|"+notasEnString[i]);
		}
		
	}
	public void cargar_notas() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese cantidad de alumnos: ");
		int cantAlumnos=scanner.nextInt();
		double[] notas=new double[cantAlumnos];
		for (int i=0;i<notas.length;i++) {
			System.out.println("Ingrese notas:");
			System.out.print("Alumno "+(i+1)+":");
				notas[i]=scanner.nextDouble();
		}
		mostrar_notas(notas, notas_a_string(notas));
	}
	public String[] notas_a_string(double[]notas) {
		String[]notasEnPalabras=new String[notas.length];
		for (int i=0;i<notasEnPalabras.length;i++) {
			if(notas[i]>=0 && notas[i]<=4.99) {
				notasEnPalabras[i]="Suspenso :(";
			}else if(notas[i]>=5 && notas[i]<=6.99){
				notasEnPalabras[i]="Bien :|";
			}else if(notas[i]>=7 && notas[i]<=8.99) {
				notasEnPalabras[i]="Notable :)";
			}else if(notas[i]>=9 && notas[i]<=10) {
				notasEnPalabras[i]="Sobresaliente :D";
			}else {
				notasEnPalabras[i]="nota no valida :/";
			}
		}
		return notasEnPalabras;
	}
}

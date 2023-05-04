package practica2demayo;
import java.util.Scanner;
import java.util.Random;

public class Practica2 {

	/*public static void apuestas(int op, int saldo,int apuesta, int pozo) {
		if (op>0 && op<3) {
			if (op==1) {
				saldo=saldo-apuesta;
				pozo=pozo+apuesta;
			}else if (op==2) {
				apuesta=apuesta*2;
				saldo=saldo-apuesta;
				pozo=pozo+apuesta;
				}
			}else {
				System.out.println("Ingrese numero 1 o 2");
			}
	} */
	/*public static boolean comparadorNum(int num, int numR, boolean encontrado) {

		return  encontrado;
	}*/
	public static void menu(int jug, int apu, int poz, int chanc, int sald) {
		System.out.println("----JUGADOR:" + jug+ "----");
		System.out.println("CHANCES RESTANTES: " + chanc);
		System.out.println("POZO ACUMULADO:" + poz);
		System.out.println("SALDO RESTANTE: "+ sald);
		System.out.println("-----------------");
		System.out.println("La apuesta anterior es de: " +apu);
		System.out.println();
		System.out.println("JUGADOR "+jug+" Ingrese una de las siguientes opciones: \n1)Apostar "+ apu);
		System.out.println("2)Duplicar apuesta");
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int numeroRandom = random.nextInt(100);
		int saldoJ1 = 1000;
		int apuestaJ1 = 50;
		int saldoJ2 = 1000;
		int apuestaJ2= 50;
		int pozo=0;
		int chancesJ1 = 10;
		int chancesJ2 = 10;
		boolean encontrado = false;
		int opcion = 0;
		int jugador = 1;

		//repetitiva
		while(encontrado == false && saldoJ1>apuestaJ1 && saldoJ2>apuestaJ2 && chancesJ1>0 && chancesJ2>=1) {
			//-JUGADOR 1-//
			System.out.println();
			menu(jugador, apuestaJ1, pozo, chancesJ1, saldoJ1);
			opcion = scanner.nextInt();
			//apuestas(opcion, saldoJ1, apuestaJ1, pozo);
			if (opcion>0 && opcion<3) {
				if (opcion==1) {
					saldoJ1=saldoJ1-apuestaJ1;
					pozo=pozo+apuestaJ1;
					jugador=2;
				}else if (opcion==2) {
					apuestaJ1=apuestaJ1*2;
					apuestaJ2=apuestaJ2*2;
					saldoJ1=saldoJ1-apuestaJ1;
					pozo=pozo+apuestaJ1;
					jugador=2;
				}
			}else {
				System.out.println("SISTEMA:Ingrese numero 1 o 2. \nEl juego ha acabado");
				break;
			}
			System.out.println();
			System.out.println("JUGADOR 1:Ingrese numero:");
			int num=scanner.nextInt();
			if (num>numeroRandom) {
				System.out.println("SISTEMA:El numero es menor!");
				chancesJ1=chancesJ1-1;
			}
			else if (num<numeroRandom) {
				System.out.println("SISTEMA:El numero es mayor!");
				chancesJ1=chancesJ1-1;
			}
			else {
				System.out.println("SISTEMA:Acertaste!! el numero es " + numeroRandom +"\n GANADOR JUGADOR 1");
				encontrado=true;
				jugador=1;
			}
			System.out.println();

			//-JUGADOR 2-//

			menu(jugador, apuestaJ2, pozo, chancesJ2, saldoJ2);
			opcion=scanner.nextInt();
			if (opcion>0 && opcion<3) {
				if (opcion==1) {
					saldoJ2=saldoJ2-apuestaJ2;
					pozo=pozo+apuestaJ2;
					jugador=1;
				}else if (opcion==2) {
					apuestaJ2=apuestaJ2*2;
					apuestaJ1=apuestaJ1*2;
					saldoJ2=saldoJ2-apuestaJ2;
					pozo=pozo+apuestaJ2;
					jugador=1;
				}
			}else {
				System.out.println("SISTEMA:Ingrese numero 1 o 2.\n El juego ha acabado");
				break;
			}
			System.out.println();
			System.out.println("JUGADOR 2 Ingrese numero:");
			num=scanner.nextInt();
			if (num>numeroRandom) {
				System.out.println("SISTEMA:El numero es menor!");
				chancesJ2=chancesJ2-1;
			}
			else if (num<numeroRandom) {
				System.out.println("SISTEMA:El numero es mayor!");
				chancesJ2=chancesJ2-1;
			}
			else {
				System.out.println("SISTEMA:Acertaste!! el numero es " + numeroRandom +"\n GANADOR JUGADOR 2");
				encontrado=true;
				jugador=2;
			}
		}
		System.out.println("----FIN DEL JUEGO----\nPOZO RECAUDADO: " + pozo+"\nCHANCES JUGADOR 1: "+chancesJ1+"\nCHANCES JUGADOR 2: "+ chancesJ2 + "\nSALDO JUGADOR 1:" + saldoJ1 +"\nSALDO JUGADOR 2: " + saldoJ2 +"\nULTIMA APUESTA: " +apuestaJ2);
		if (chancesJ1==0 || chancesJ2==0) {
			System.out.println("NO HAY UN GANADOR!");
		}
	}
}







package progII_guia03_EberhardtA;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int opcion;
		do {
			System.out.println("Ingrese opcion: \n"
					+"1)Ejericio 1:\n"
					+"2)Ejercicio 2:\n"
					+"3)Ejercicio 3:\n"
					+"4)Ejercicio 4:\n"
					+"5)Ejercicio 5:\n"
					+"6)Ejercicio 6:\n"
					+"7)Ejercicio 7:\n"
					+"8)Ejercicio 8:\n"
					+"9)Ejercicio 9:\n"
					+"10)Ejercicio 10:\n"
					+"11)Ejercicio 11:\n"
					+"12)Ejercicio 12:\n"
					+"13)Ejercicio 13:\n"
					+"14)Ejercicio 14:\n"
					+"15)Ejercicio 15:\n"
					+"16)Ejercicio 16:\n"
					+"0)Salir");
			opcion = scanner.nextInt();
			switch(opcion) {
			case 1:
				System.out.println("Ingreso la opcion 1");
				Ejercicio_01 ejercicio01 = new Ejercicio_01();
				ejercicio01.holaUsuario();
				break;
			case 2:
				System.out.println("Ingreso la opcion 2");
				Ejercicio_02 ejercicio02 = new Ejercicio_02();
				ejercicio02.promedioArreglo();
				break;
			case 3:
				System.out.println("Ingreso la opcion 3");
				Ejercicio_03 ejercicio03 =new Ejercicio_03();
				ejercicio03.capicua();
				break;
			case 4:
				System.out.println("Ingreso la opcion 4");
				Ejercicio_04 ejercicio04 = new Ejercicio_04();
				ejercicio04.ingresarContraseña();
				break;
			case 5:
				System.out.println("Ingreso la opcion 5");
				Ejercicio_05 ejercicio05 =new Ejercicio_05();
				ejercicio05.fibonacci();
				break;
			case 6:
				System.out.println("Ingreso la opcion 6");
				Ejercicio_06 ejercicio06 = new Ejercicio_06();
				ejercicio06.esPrimo();
				break;
			case 7:
				System.out.println("Ingreso la opcion 7");
				Ejercicio_07 ejercicio07 = new Ejercicio_07();
				ejercicio07.ingresarPalabra();
				break;
			case 8:
				System.out.println("Ingreso la opcion 8");
				Ejercicio_08 ejercicio08 = new Ejercicio_08();
				ejercicio08.insertarNumero();
				break;
			case 9:
				System.out.println("Ingreso la opcion 9");
				Ejercicio_9 ejercicio09 = new Ejercicio_9();
				ejercicio09.ordenar();
				break;
			case 10:
				System.out.println("Ingreso la opcion 10");
				Ejercicio_10 ejercicio10 = new Ejercicio_10();
				ejercicio10.ejercicio_10();
				break;
			case 11:
				System.out.println("Ingreso la opcion 11");
				Ejercicio_11 ejercicio11 = new Ejercicio_11();
				ejercicio11.operando();
				break;
			case 12:
				System.out.println("Ingreso la opcion 12");
				Ejercicio_12 ejercicio12 = new Ejercicio_12();
				ejercicio12.opTernario();
				break;
			case 13:
				System.out.println("Ingreso la opcion 13");
				Ejercicio_13 ejercicio13 = new Ejercicio_13();
				ejercicio13.suma();
				break;
			case 14:
				System.out.println("Ingreso la opcion 14");
				Ejercicio_14 ejercicio14 = new Ejercicio_14();
				ejercicio14.arreglo();
				break;
			case 15:
				System.out.println("Ingreso la opcion 15");
				Ejercicio_15 ejercicio15 = new Ejercicio_15();
				ejercicio15.agregar();
				break;
			case 16:
				System.out.println("Ingreso la opcion 16");
				Ejercicio_16 ejercicio16 = new Ejercicio_16();
				ejercicio16.cargar_notas();
				break;
			case 0:
				System.out.println("Chau!");
				break;
			default:
				System.out.println("Ingrese opcion correcta");
			}
		}while(opcion!=0);

	}

}

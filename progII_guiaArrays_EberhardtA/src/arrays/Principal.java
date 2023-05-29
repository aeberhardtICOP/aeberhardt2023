package arrays;
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
					+"0)Salir");
			opcion = scanner.nextInt();
			switch(opcion) {
			case 1:
				System.out.println("Ingreso la opcion 1");
				Ejercicio_01 ejercicio1 = new Ejercicio_01();
				ejercicio1.ejercicio_01();
				break;
			case 2:
				System.out.println("Ingreso la opcion 2");
				Ejercicio_02 ejercicio2 = new Ejercicio_02();
				ejercicio2.ejercicio_02();
				break;
			case 3:
				System.out.println("Ingreso la opcion 3");
				Ejercicio_03 ejercicio3 = new Ejercicio_03();
				ejercicio3.ejercicio_03();
				break;
			case 4:
				System.out.println("Ingreso la opcion 4");
				Ejercicio_04 ejercicio4= new Ejercicio_04();
				ejercicio4.ejercicio_4();
				break;
			case 5:
				System.out.println("Ingreso la opcion 5");
				Ejercicio_05 ejercicio5 = new Ejercicio_05();
				ejercicio5.ejercicio_5();
				break;
			case 6:
				System.out.println("Ingreso la opcion 6");
				Ejercicio_06 ejercicio6 = new Ejercicio_06();
				ejercicio6.ejercicio_6();
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

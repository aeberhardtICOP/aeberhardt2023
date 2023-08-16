package principal;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
import clases.*;
public class Principal {
	public static void menu(){
		System.out.println("Ingrese Ejercicio: (del 1 al 6) ");
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int o = 0;
		do {
			menu();
			o=scanner.nextInt();
			switch(o) {
			case 1:
				System.out.println("----------------");
				System.out.println("Ejercicio 1:");
				Persona persona = null;
				try {
					persona.mostrar();
				}catch(NullPointerException e) {
					System.out.println(e.getCause()+" "+e.getStackTrace()+" "+e.getMessage());
				}
			case 2:
				System.out.println("----------------");
				System.out.println("Ejercicio 2:");
				Gobierno gob2023 = new Gobierno("milei");
				System.out.println("Agregando ministerio de salud..");
				gob2023.agregarMinisterio("Salud", 8);
				break;
			case 3:
				scanner.nextLine();
				System.out.println("----------------");
				System.out.println("Ejercicio 3:");
				DivisionNumero dv = new DivisionNumero();
				System.out.println("Ingrese numero 1:");
				String nro1String=scanner.nextLine();
				System.out.println("Ingrese numero 2: ");
				String nro2String=scanner.nextLine();
				try {
					int nro1Int=Integer.parseInt(nro1String);
					int nro2Int=Integer.parseInt(nro2String);
					dv.setNro1(nro1Int);
					dv.setNro2(nro2Int);
					System.out.println("la division de "+nro1Int+" y "+ nro2Int +" es: "+dv.division());
				}catch(NumberFormatException e) {
					System.out.println(e.getCause()+" "+e.getMessage());
					break;
				}
				break;
			case 4:
				DivisionNumero div = new DivisionNumero();
				System.out.println("----------------");
				System.out.println("Ejercicio 4:");
				System.out.println("Ingrese nro1: ");
				int nro1;
				try {
				nro1=scanner.nextInt();
				}catch(InputMismatchException e) {
					System.out.println("No ingreso un numero!!, por defecto 1");
					nro1=1;
				}
				System.out.println("Ingrese numero 2: ");
				String nro2 = scanner.nextLine();
				int nro2Integer;
				try {
					nro2Integer=Integer.parseInt(nro2);
				}catch(NumberFormatException e) {
					System.out.println("No ingreso un numero, por defecto 1");
					nro2Integer=1;
				}
				div.setNro1(nro1);
				div.setNro2(nro2Integer);
				System.out.println("la division de "+nro1+" y "+ nro2Integer +" es: "+div.division());
				//la excepcion aritmetica se maneja desde la clase DivisionNumero
				
			case 5:
				System.out.println("----------------");
				System.out.println("Ejercicio 5:");
				Random random = new Random();
				int nroRandom = random.nextInt(500);
				int nro=0;
				int intentos=5;
				do{
					System.out.println("INTENTOS RESTANTES: "+intentos);
					System.out.println("Ingrese numero:");
					try {
						nro=0;
						nro=scanner.nextInt();
						intentos--;
						if(nro>nroRandom) {
							System.out.println("El numero random es menor!");
						}else if (nro<nroRandom){
							System.out.println("El numero random es mayor!");
						}else {
							System.out.println("ENCONTRADO!!!!!");
						}
					} catch (InputMismatchException e) {
						System.out.println("no ingreso un numero");
						intentos--;
						scanner.nextLine();
						
					}
					
				}while (nro!=nroRandom && intentos>0);
				break;
			case 6:
				System.out.println("----------------");
				System.out.println("Ejercicio 6:");
				//A) en orden: a1-a2-a3-a4-a5
				//B) en orden: a1-a2-a3-a4-a6-a5
				break;
			case -1:
				System.out.println("----------------");
				System.out.println("Saliendo..");
				break;
			default:
				System.out.println("----------------");
				System.out.println("Ingrese opcion valida.");
			}
			
			
			
		}while(o!=-1);

	}

}

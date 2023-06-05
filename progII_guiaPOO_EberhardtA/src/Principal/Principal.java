package Principal;
import java.util.Scanner;
import Entidades.*;
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
						+"0)Salir");
				opcion = scanner.nextInt();
				switch(opcion) {
				case 1:
					scanner.nextLine();
					System.out.println("Ingreso la opcion 1");
					System.out.println("---------------------\nCarga de un nuevo libro:");
					System.out.println("Codigo ISBN:");
					int ISBN=Integer.parseInt(scanner.nextLine());
					System.out.println("Titulo:");
					String titulo=scanner.nextLine();
					System.out.println("Nro de paginas:");
					int nroPaginas=Integer.parseInt(scanner.nextLine());
					System.out.println("Autor:");
					String autor=scanner.nextLine();
					System.out.println("----------------------");
					Libro nuevoLibro = new Libro(ISBN,titulo,autor,nroPaginas);
					System.out.print("\nNuevo libro creado con exito!\nCodigo ISBN="+nuevoLibro.getIsbn()+"\nTitulo="+nuevoLibro.getTitulo()+"\nAutor="+nuevoLibro.getAutor()+"\nNro de paginas="+nuevoLibro.getNroPaginas());
					break;
				case 2:
					System.out.println("Ingreso la opcion 2");
					Circunferencia circunferencia = new Circunferencia();
					System.out.print("Ingrese el radio=");
					int radio=scanner.nextInt();
					System.out.println();
					circunferencia.crearCircunferencia(radio);
					System.out.println("Circunferencia creada!"
							+ "\nEl area de la circunferencia es="+circunferencia.area()+
							"\nEl perimetro es="+circunferencia.perimetro());
					
					System.out.println();
					break;
				case 3:
					System.out.println("Ingreso la opcion 3");
					System.out.println("------------------");
					System.out.println("Operaciones: Creando objeto");
					Operacion operacion = new Operacion();
					System.out.print("Ingrese numero 1 =");
					operacion.setNumero1(scanner.nextInt());
					System.out.println();
					System.out.print("Ingrese numero 1 =");
					operacion.setNumero2(scanner.nextInt());
					System.out.println("------------------");
					System.out.println("Ingrese opcion:\n1)Sumar "+operacion.getNumero1()+"+"+operacion.getNumero2()
					+"\n2)Restar "+operacion.getNumero1()+"-"+operacion.getNumero2()
					+"\n3)Multiplicar "+operacion.getNumero1()+"x"+operacion.getNumero2()
					+"\n4)Dividir "+operacion.getNumero1()+"/"+operacion.getNumero2());
					int op = scanner.nextInt();
					switch(op) {
					case 1:
						System.out.println(operacion.sumar());
						break;
					case 2:
						System.out.println(operacion.restar());
						break;
					case 3:
						System.out.println(operacion.multiplicar());
						break;
					case 4:
						System.out.println(operacion.dividir());
						break;
					default:
						System.out.println("No ingreso opcion valida");	
					}
					
					
					break;
				case 4:
					System.out.println("Ingreso la opcion 4");
					System.out.println("---------------------------");
					System.out.print("Ingrese la base del rectangulo: ");
					int base=scanner.nextInt();
					System.out.println();
					System.out.print("Ingrese altura del rectangulo: ");
					int altura=scanner.nextInt();
					System.out.println();
					System.out.println("---------------------------");
					Rectangulo rectangulo = new Rectangulo(base, altura);
					System.out.println("Rectangulo generado");
					System.out.println("Superficie: "+rectangulo.superficie()
					+"\nPerimetro: "+rectangulo.perimetro()
					+"\n ");
					rectangulo.dibujarRectangulo();
				case 0:
					System.out.println("Chau!");
					break;
				default:
					System.out.println("Ingrese opcion correcta");
				}
			}while(opcion!=0);

		}

	}

	

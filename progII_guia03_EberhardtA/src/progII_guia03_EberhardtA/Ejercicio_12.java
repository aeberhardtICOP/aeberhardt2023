package progII_guia03_EberhardtA;
import java.util.Random;
public class Ejercicio_12 {
	public void a_operador_ternario(){
	Random random = new Random();
	int a=(int)random.nextInt(100);	
	String respuesta=(a%2==0)?a+" es par " : a+" es impar";
	System.out.println(respuesta);
	}
	public void b_operador_ternario() {
	Random random = new Random();
	int n=(int)random.nextInt(150);
	System.out.println((n<0)?n+" es negativo": n+" es positivo");
	System.out.println((n%2==0)?n+" es par " : n+" es impar");
	System.out.println((n%5==0)?n+" es multiplo de 5 " : n+" no es multiplo de 5");
	System.out.println((n%10==0)?n+" es multiplo de 10 " : n+" no es multiplo de 10");
	System.out.println((n<100)?n+" es menor que 100 " : n+" es mayor que 100");
	}
	public void opTernario() {
		a_operador_ternario();
		b_operador_ternario();
		
	}

}

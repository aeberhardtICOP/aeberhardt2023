package progII_guia03_EberhardtA;
import java.util.Scanner;
public class Ejercicio_04 {
	public void contraseñaSegura(String contra){
		int nums=0;
		int minus=0;
		int mayus=0;
		boolean guion=false;
		boolean caracterNoPermitido=false;
		for(int i=0;i<contra.length();i++) {
			//System.out.println(contra.charAt(i));
			if ((int)contra.charAt(i)>=48 && (int)contra.charAt(i)<=57) {
				nums++;
			}else if((int)contra.charAt(i)>=65 && (int)contra.charAt(i)<=90) {
				mayus++;
			}else if((int)contra.charAt(i)>=97 && (int)contra.charAt(i)<=122) {
				minus++;
			}else if((int)contra.charAt(i)==95) {
				guion=true;
			}else {
				caracterNoPermitido=true;
			}
		}
		//System.out.println("nums="+nums+"\nminus="+minus+"\nmayus="+mayus+"\nguion="+guion+"\ncnoperm="+caracterNoPermitido);
		if(caracterNoPermitido==false) {
			if(contra.length()>=8 && mayus>=2 && minus>=3 && nums>=2 && guion==true) {
				System.out.println("La contraseña es segura!!");
			}else {
				System.out.println("La contraseña no es segura :(");
			}
		}else {
			System.out.println("La contraseña tiene uno o mas caracteres no validos :$");
		}
	}
	public void ingresarContraseña() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese contraseña: ");
		String contra=scanner.nextLine();
		contraseñaSegura(contra);
	}

}

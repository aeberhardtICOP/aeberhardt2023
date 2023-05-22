package progII_guia03_EberhardtA;
import java.util.Scanner;
public class Ejercicio_08 {
	
	public void cantidadDeBilletes(int num) {
		int posicion=1;
		int resto=0;
		int aux=0;
		int c100=0;
		int c50=0;
		int c20=0;
		int c10=0;
		int c5=0;
		int c2=0;
		int c1=0;
		
		while(num>0) {
			if (num>=100) {
				c100=(int)Math.floor(num/100);
				num%=100;
				System.out.println("num= "+num+"c= "+c100);
			}else if(num>=50) {
				c50=(int)Math.floor(num/50);
				num%=50;
				System.out.println("num= "+num+"c= "+c50);
			}else if(num>=20) {
				c20=(int)Math.floor(num/20);
				num%=20;
				System.out.println("num= "+num+"c= "+c20);
			}else if(num>=10) {
				c10=(int)Math.floor(num/10);
				num%=10;
				System.out.println("num= "+num+"c= "+c10);
			}else if(num>=5) {
				c5=(int)Math.floor(num/5);
				num%=5;
				System.out.println("num= "+num+"c= "+c5);
			}else if(num>=2) {
				c2=(int)Math.floor(num/2);
				num%=2;
				System.out.println("num= "+num+"c= "+c2);
			}else if(num>=1) {
				c1=(int)Math.floor(num/1);
				num%=1;
				System.out.println("num= "+num+"c= "+c1);
			}
		}
		System.out.println("Los cantidad de billetes usados son: "+ "\nBilletes de $100: "+c100+"\nBilletes de $50: "+c50+"\nBilletes de $20: "+c20+"\nBilletes de $10: "+c10+"\nBilletes de $5: "+c5+"\nBilletes de $2: "+c2+"\nBilletes de $1: "+c1);	
		
			
		}
	
	public void insertarNumero() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese numero:");
		int num=scanner.nextInt();
		cantidadDeBilletes(num);
		
	}
}

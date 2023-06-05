package Entidades;

public class Operacion {
	private int numero1;
	private int numero2;
	
	//constructores
	public Operacion() {
	}

	public Operacion(int numero1, int numero2) {
		super();
		this.numero1 = numero1;
		this.numero2 = numero2;
	}
	//getters & setters
	public int getNumero1() {
		return numero1;
	}

	public void setNumero1(int numero1) {
		this.numero1 = numero1;
	}

	public int getNumero2() {
		return numero2;
	}

	public void setNumero2(int numero2) {
		this.numero2 = numero2;
	}
	//metodos extras
	public int sumar() {
		int suma=numero1+numero2;
		return suma;
	}
	public int restar() {
		int resta = numero1-numero2;
		return resta;
	}
	public int multiplicar() {
		if(numero1!=0 && numero2!=0) {
			int multiplicacion=numero1*numero2;
			return multiplicacion;
		}else {
			System.out.println("Error, uno de los numeros es 0");
			return 0;
		}
	}
		public double dividir() {
			if(numero1!=0 && numero2!=0) {
				double division=numero1/numero2;
				return division;
			}else {
				System.out.println("Error, uno de los numeros es 0");
				return 0;
			}
	}
	
	
	
	
	
}

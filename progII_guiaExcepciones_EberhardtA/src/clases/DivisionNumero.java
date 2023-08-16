package clases;

public class DivisionNumero {
	private int nro1;
	private int nro2;
	
	public DivisionNumero(int nro1, int nro2) {
		super();
		this.nro1 = nro1;
		this.nro2 = nro2;
	}

	public DivisionNumero() {
	}

	public int getNro1() {
		return nro1;
	}

	public void setNro1(int nro1) {
		this.nro1 = nro1;
	}

	public int getNro2() {
		return nro2;
	}

	public void setNro2(int nro2) {
		this.nro2 = nro2;
	}
	
	public int division() {
		try{
			return nro1/nro2;
		}catch(ArithmeticException e) {
			System.out.println("no se puede dividir por 0, seteando el resutado a 0");
			return 0;
		}
	}
	
	
}

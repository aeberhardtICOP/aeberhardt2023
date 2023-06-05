package Entidades;

public class Rectangulo {
	private int base;
	private int altura;
	
	//constructor
	public Rectangulo(int base, int altura) {
		this.base = base;
		this.altura = altura;
	}

	//getters & setters
	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	//metodos extras
	public int superficie() {
		int superficie=base*altura;
		return superficie;
	}
	public int perimetro() {
		int perimetro=(base+altura)*2;
		return perimetro;
	}
	public void dibujarRectangulo() {
		/*for(int i=0;i<base;i++) {
			System.out.print("*");
		}*/
		System.out.println();
		for(int i=0;i<altura;i++) {
			for(int j=0;j<base;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	
	
	
}

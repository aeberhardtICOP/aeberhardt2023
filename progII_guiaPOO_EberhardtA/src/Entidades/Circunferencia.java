package Entidades;

public class Circunferencia {
	private static double pi=3.14;
	private int radioReal;

	public Circunferencia() {
		
	}

	public int getRadioReal() {
		return radioReal;
	}

	public void setRadioReal(int radioReal) {
		this.radioReal = radioReal;
	}
	public void crearCircunferencia (int radio) {
		setRadioReal(radio);
	}
	public double area() {
		//double pi=3.14;
		double area = pi*Math.pow(Double.valueOf(getRadioReal()),2);
		return area;
	}
	public double perimetro() {
		double perimetro=2*pi*getRadioReal();
		return perimetro;
	}
	
	
}

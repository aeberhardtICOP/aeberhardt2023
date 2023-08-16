package clases;

public class Gobierno {
	private String presidente;
	private String[] ministerios;
	public Gobierno(String presidente) {
		super();
		this.presidente = presidente;
		this.ministerios = new String[8];
	}
	public Gobierno() {
		super();
	}
	public String getPresidente() {
		return presidente;
	}
	public void setPresidente(String presidente) {
		this.presidente = presidente;
	}
	public String[] getMinisterios() {
		return ministerios;
	}
	public void setMinisterios(String[] ministerios) {
		this.ministerios = ministerios;
	}
	public void agregarMinisterio(String ministerio, int posicion) {
		try {
		this.ministerios[posicion]=ministerio;
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getCause()+" "+e.getMessage());
		}
	}
	
}

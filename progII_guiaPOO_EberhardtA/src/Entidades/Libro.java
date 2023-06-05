package Entidades;

import java.util.Scanner;

public class Libro {
	private int isbn;
	private String titulo;
	private String autor;
	private int nroPaginas;
	
	public Libro() {
		
	}
	public Libro(int isbn, String titulo, String autor, int nroPaginas) {
		super();
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
		this.nroPaginas = nroPaginas;
	
	
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getNroPaginas() {
		return nroPaginas;
	}

	public void setNroPaginas(int nroPaginas) {
		this.nroPaginas = nroPaginas;
	}
	public void mostrarLibro() {
		System.out.println("---------------------\nCarga de un nuevo libro:");
		System.out.println("Codigo ISBN:");
		System.out.println(this.getIsbn());
		System.out.println("Titulo:");
		System.out.println(this.getTitulo());
		System.out.println("Nro de paginas:");
		System.out.println(this.getNroPaginas());
		System.out.println("Autor:");
		System.out.println(this.getAutor());
		System.out.println("----------------------");
	}
	
	
}

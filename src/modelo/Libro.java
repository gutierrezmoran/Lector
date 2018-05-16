package modelo;

import java.io.File;

public class Libro implements Legible {

	private String lectura;
	private File libro;
	private int paginaActual;
	private int marca;
	private Lector lector;

	public Libro() {
		super();
		this.paginaActual = 1;
		this.marca = 0;
		this.lectura = "JuegoTronos.txt";
		this.libro = new File(this.lectura);
		this.lector = new Lector();
	}

	@Override
	public void avanzarPagina() {
		this.paginaActual++;
	}

	private boolean comprobarPrimeraPagina() {
		return this.paginaActual == 1;
	}
	
	@Override
	public void retrocederPagina() {
		if(!comprobarPrimeraPagina()) {
			this.paginaActual--;
		}
	}

	@Override
	public void marcarPagina() {
		this.marca = this.paginaActual;
	}

	@Override
	public void irAMarca() {
		if(this.marca != 0) {
			this.paginaActual = this.marca;
		}
	}
	
	public boolean isPaginaMarcada() {
		return this.marca == this.paginaActual;
	}

	public String getLectura() {
		return lectura;
	}

	public File getLibro() {
		return libro;
	}

	public int getPaginaActual() {
		return paginaActual;
	}

	public int getMarca() {
		return marca;
	}

	public Lector getLector() {
		return lector;
	}

	public void leer(File file, int pagina) {
		lector.leer(file, pagina);
	}

	public boolean comprobarPaginasIguales() {
		return lector.comprobarPaginasIguales();
	}

}

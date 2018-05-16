package control;

import java.io.File;
import control.accion.AccionesLibro;
import control.eventos.ActionAvanzar;
import control.eventos.ActionIrMarca;
import control.eventos.ActionMarcar;
import control.eventos.ActionRetroceder;
import modelo.Libro;
import vista.UI;

public class Bridge extends UI {

	private Libro libro;
	private AccionesLibro accionesLibro;
	
	public Bridge() {
		this.accionesLibro = new AccionesLibro(this);
		this.libro = new Libro();
		this.accionesLibro.actualizarPagina();
		asignarListeners();
	}
	
	public void asignarListeners() {
		btnAlante.addMouseListener(new ActionAvanzar(this));
		btnAtras.addMouseListener(new ActionRetroceder(this));
		btnMarcar.addMouseListener(new ActionMarcar(this));
		btnIrAMarca.addMouseListener(new ActionIrMarca(this));
	}

	public Libro getLibro() {
		return libro;
	}

	public AccionesLibro getAccionesLibro() {
		return accionesLibro;
	}

	public void leer(File file, int pagina) {
		libro.leer(file, pagina);
	}

	public void marcarPagina() {
		libro.marcarPagina();
	}

	public void irAMarca() {
		libro.irAMarca();
	}

	public boolean isPaginaMarcada() {
		return libro.isPaginaMarcada();
	}

	public boolean comprobarPaginasIguales() {
		return libro.comprobarPaginasIguales();
	}

}

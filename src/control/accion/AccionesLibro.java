package control.accion;

import control.Bridge;

public class AccionesLibro {

	private Bridge bridge;
	
	public AccionesLibro(Bridge bridge) {
		this.bridge = bridge;
	}
	
	private void actualizarNumeroPagina(int numero) {
		this.bridge.getLblNumeroPagina().setText("Página actual " + String.valueOf(numero));
	}
	
	private void actualizarPagina(String texto) {
		this.bridge.getLectura().setText(texto);
	}
	
	public void actualizarPagina() {
		int pagina = this.bridge.getLibro().getPaginaActual();
		
		this.bridge.leer(this.bridge.getLibro().getLibro(), pagina);
		//if(this.bridge.comprobarPaginasIguales()) {
			actualizarPagina(this.bridge.getLibro().getLector().obtenerLectura());
			actualizarNumeroPagina(pagina);
			actualizarMarca();
		//}
	}
	
	public void actualizarMarca() {
		if(this.bridge.isPaginaMarcada()) {
			this.bridge.marcar();
		} else {
			this.bridge.desmarcar();
		}
	}
	
}

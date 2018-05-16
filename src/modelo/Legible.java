package modelo;

public interface Legible {
	
	/**
	 * Aumenta el valor que representa la pagina visualizada actualmente
	 */
	public void avanzarPagina();
	
	/**
	 * Disminuye el valor que representa la pagina visualizada actualmente
	 */
	public void retrocederPagina();
	
	/**
	 * Iguala el valor de la pagina marcada con la pagina actual
	 */
	public void marcarPagina();
	
	/**
	 * Iguala la pagina actual con la pagina marcada
	 */
	public void irAMarca();

}

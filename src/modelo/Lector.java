package modelo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class Lector {

	private FileInputStream flujoR;
	private byte[] array;
	private byte[] arrayAnterior;
	
	public Lector() {
		this.flujoR = null;
		this.arrayAnterior = null;
	}

	public void leer(File file, int pagina) {
		try {
			this.flujoR = new FileInputStream(file);
			this.array = new byte[Constantes.CARACTERES_PAGINA];

			for (int i = 0; i < pagina; i++) {
				this.flujoR.read(this.array);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			this.flujoR.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public String obtenerLectura() {
		try {
			return new String(this.array, "utf8");
		} catch (UnsupportedEncodingException e) {
			return "Imposible leer la página";
		}
	}
	
	public boolean comprobarPaginasIguales() {
		for (int i = 0; i < Constantes.CARACTERES_PAGINA; i++) {
			if(this.array[i] != this.arrayAnterior[i]) {
				return false;
			}
		}
		
		return true;
	}
	
}

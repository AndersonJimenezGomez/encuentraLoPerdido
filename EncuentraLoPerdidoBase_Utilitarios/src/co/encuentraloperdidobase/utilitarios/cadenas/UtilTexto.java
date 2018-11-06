package co.encuentraloperdidobase.utilitarios.cadenas;

import static co.encuentraloperdidobase.utilitarios.objeto.UtilObjeto.obtenerUtilObjeto;


public final class UtilTexto {

	private static final UtilTexto INSTANCIA = new UtilTexto();

	private UtilTexto() {
		super();
	}

	public static final UtilTexto obtenerUtilTexto() {
		return INSTANCIA;
	}
	
	public final String aplicarTrim(final String cadena) {
		return obtenerUtilObjeto().obtenerValorDefecto(cadena, "").trim();
	}
	
	public final boolean cadenaEsVaciaONula(final String cadena) {
		return aplicarTrim(cadena).intern() == "" ;
	}

}

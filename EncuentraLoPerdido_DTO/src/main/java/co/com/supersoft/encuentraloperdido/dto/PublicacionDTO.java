package co.com.supersoft.encuentraloperdido.dto;
import static co.encuentraloperdidobase.utilitarios.cadenas.UtilTexto.obtenerUtilTexto;
import static co.encuentraloperdidobase.utilitarios.objeto.UtilObjeto.obtenerUtilObjeto;

import co.encuentraloperdido.dominio.ObjetoDominio;

public final class PublicacionDTO {
	private int idPublicacion;
	private ObjetoDominio objeto;
	private String tipoPublicacion;
	
	public PublicacionDTO(int idPublicacion, ObjetoDominio objeto, String tipoPublicacion) {
		super();
		this.idPublicacion = idPublicacion;
		this.objeto = objeto;
		this.tipoPublicacion = tipoPublicacion;
	}

	public final int getIdPublicacion() {
		return idPublicacion;
	}

	public final void setIdPublicacion(int idPublicacion) {
		this.idPublicacion = idPublicacion;
	}

	public final ObjetoDominio getObjeto() {
		return objeto;
	}

	public final void setObjeto(ObjetoDominio objeto) {
		this.objeto = objeto;
	}

	public final String getTipoPublicacion() {
		return tipoPublicacion;
	}

	public final void setTipoPublicacion(String tipoPublicacion) {
		this.tipoPublicacion = obtenerUtilTexto().aplicarTrim(tipoPublicacion);
	}
	
	
	

}

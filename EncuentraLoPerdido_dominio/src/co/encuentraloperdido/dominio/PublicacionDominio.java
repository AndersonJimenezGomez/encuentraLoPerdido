package co.encuentraloperdido.dominio;

import co.encuentraloperdidobase.utilitarios.cadenas.enumeracion.ExpresionRegularEnum;

public final class PublicacionDominio {
	private int idPublicacion;
	private ObjetoDominio objeto;
	private String tipoPublicacion;
	
	public PublicacionDominio() {
		super();
		
	}
	
	public PublicacionDominio(int idPublicacion, ObjetoDominio objeto, String tipoPublicacion) {
		super();
		setIdPublicacion(idPublicacion);
		setObjeto(objeto);
		setTipoPublicacion(tipoPublicacion);
	}
	

	public PublicacionDominio crear (PublicacionDominio publicacion) {
		publicacion.asegurarIntegridadTipoPublicacion();
		return publicacion;
	}

	public final void setIdPublicacion(final int idPublicacion) {
		this.idPublicacion = idPublicacion;
	}

	public final void setObjeto(final ObjetoDominio objeto) {
		this.objeto = objeto;
	}

	public final void setTipoPublicacion(final String tipoPublicacion) {
		this.tipoPublicacion = tipoPublicacion;
	}

	public final int getIdPublicacion() {
		return idPublicacion;
	}

	public final ObjetoDominio getObjeto() {
		return objeto;
	}

	public final String getTipoPublicacion() {
		return tipoPublicacion;
	}
	
	
	private void asegurarIntegridadTipoPublicacion() {
		if (getTipoPublicacion() == null) {
			throw new RuntimeException("EL tipo de publiacion no puede ser nula");
		} else if (getTipoPublicacion().trim().intern() == "") {
			throw new RuntimeException("EL tipo de publicacion  no puede ser vacia");
		} else if (getTipoPublicacion().trim().length() > 300) {
		
			throw new RuntimeException("EL tipo de publicacion  no puede tener mas de 300 caracteres");
		} else if (!ExpresionRegularEnum.SOLO_TEXTO.cumplePatron(getTipoPublicacion())) {
			
			throw new RuntimeException("EL tipo de publicacion contiene caracteres extraños");
		}
	}
	
	
	
	
	
}

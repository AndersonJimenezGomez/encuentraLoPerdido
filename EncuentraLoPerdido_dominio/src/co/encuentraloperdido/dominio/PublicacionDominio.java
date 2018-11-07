package co.encuentraloperdido.dominio;

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
//	
//	private void asegurarIntegridadObjeto() {
//		if (getObjeto() == null) {
//			throw new RuntimeException("EL objeto no puede ser nulo");
//		} else if (getDescripcion().trim().intern() == "") {
//			throw new RuntimeException("La descripcion no puede ser vacia");
//		} else if (getDescripcion().trim().length() > 300) {
//		
//			throw new RuntimeException("La descripcion del objeto no puede tener mas de 300 caracteres");
//		} else if (!ExpresionRegularEnum.SOLO_TEXTO.cumplePatron(getDescripcion())) {
//			String mensaje = "El nombre del cliente solo puede contener letras y espacios";
//			throw new RuntimeException("La descripcion del objeto no puede tener mas de 300 caracteres");
//		}
//	}
	
	
	
	
}

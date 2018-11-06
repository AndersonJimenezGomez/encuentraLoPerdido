package src.co.encuentraloperdido.dominio;

public final class PublicacionDominio {
	private int idPublicacion;
	private ObjetoDominio objeto;
	private String tipoPublicacion;
	
	public PublicacionDominio(int idPublicacion, ObjetoDominio objeto, String tipoPublicacion) {
		super();
		setIdPublicacion(idPublicacion);
		setObjeto(objeto);
		setTipoPublicacion(tipoPublicacion);
	}

	private final void setIdPublicacion(final int idPublicacion) {
		this.idPublicacion = idPublicacion;
	}

	private final void setObjeto(final ObjetoDominio objeto) {
		this.objeto = objeto;
	}

	private final void setTipoPublicacion(final String tipoPublicacion) {
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
	
	
	
	
}

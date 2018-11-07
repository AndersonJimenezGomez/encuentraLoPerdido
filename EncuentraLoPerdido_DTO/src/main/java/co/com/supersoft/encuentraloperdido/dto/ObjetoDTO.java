package co.com.supersoft.encuentraloperdido.dto;

import java.awt.Image;
import java.util.Date;
import static co.encuentraloperdidobase.utilitarios.cadenas.UtilTexto.obtenerUtilTexto;
import static co.encuentraloperdidobase.utilitarios.objeto.UtilObjeto.obtenerUtilObjeto;

public final class ObjetoDTO {
	private int idObjeto;
	private String lugar;
	private String descripcion;
	private Date fecha;
	private Image foto;
	
	
	
	public ObjetoDTO(int idObjeto, String lugar, String descripcion, Date fecha, Image foto) {
		super();
		this.idObjeto = idObjeto;
		lugar = lugar;
		this.descripcion = descripcion;
		this.fecha = fecha;
		this.foto = foto;
	}
	public final int getIdObjeto() {
		return idObjeto;
	}
	public final void setIdObjeto(int idObjeto) {
		this.idObjeto = idObjeto;
	}
	public final String getLugar() {
		return lugar;
	}
	public final void setLugar(String lugar) {
		this.lugar = obtenerUtilTexto().aplicarTrim(lugar);
	
	}
	public final String getDescripcion() {
		return descripcion;
	}
	public final void setDescripcion(String descripcion) {
		this.descripcion = obtenerUtilTexto().aplicarTrim(descripcion);
		
	}
	public final Date getFecha() {
		return fecha;
	}
	public final void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public final Image getFoto() {
		return foto;
	}
	public final void setFoto(Image foto) {
		this.foto = foto;
	}
	
	

}

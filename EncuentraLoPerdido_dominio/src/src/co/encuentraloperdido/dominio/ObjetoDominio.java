package src.co.encuentraloperdido.dominio;

import java.awt.Image;
import java.sql.Date;

public final class ObjetoDominio {
	private int idObjeto;
	private int idLugar;
	private String descripcion;
	private Date fecha;
	private Image foto;
	
	public ObjetoDominio(final int idObjeto,final int idLugar,final  String descripcion,final  Date fecha,final  Image foto) {
		super();
		setIdObjeto(idObjeto);
		setIdLugar(idLugar);
		setDescripcion(descripcion);
		setFecha(fecha);
		setFoto(foto);
		setFoto(foto);
	}

	public int getIdObjeto() {
		return idObjeto;
	}

	public int getIdLugar() {
		return idLugar;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public Date getFecha() {
		return fecha;
	}

	public Image getFoto() {
		return foto;
	}

	private void setIdObjeto(int idObjeto) {
		this.idObjeto = idObjeto;
	}

	private void setIdLugar(int idLugar) {
		this.idLugar = idLugar;
	}

	private void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	private void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	private void setFoto(Image foto) {
		this.foto = foto;
	}
	
	private void asegurarIntegridadDescripcion() {
		
	}
	
	
	
	
	
	
	
	

}

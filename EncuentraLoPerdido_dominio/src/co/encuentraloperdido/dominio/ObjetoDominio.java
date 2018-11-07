package co.encuentraloperdido.dominio;

import java.awt.Image;
import java.util.Calendar;
import java.util.Date;
import co.encuentraloperdidobase.utilitarios.cadenas.enumeracion.ExpresionRegularEnum;
import static co.encuentraloperdidobase.utilitarios.objeto.UtilObjeto.obtenerUtilObjeto;


public final class ObjetoDominio {


	private int idObjeto;
	private String lugar;
	private String descripcion;
	private Date fecha;
	private Image foto;
	
	public ObjetoDominio() {
		super();
	}
	
	public ObjetoDominio(final int idObjeto,final String Lugar,final  String descripcion,final  Date fecha,final  Image foto) {
		super();
		setIdObjeto(idObjeto);
		setLugar(Lugar);
		setDescripcion(descripcion);
		setFecha(fecha);
		setFoto(foto);
		setFoto(foto);
	}
	
	public void crear() {
		this.validar();
	}

	public int getIdObjeto() {
		return idObjeto;
	}

	public String getLugar() {
		return lugar;
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

	public void setIdObjeto(int idObjeto) {
		this.idObjeto = idObjeto;
	}

	public void setLugar(String Lugar) {
		this.lugar = Lugar;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public void setFoto(Image foto) {
		this.foto = foto;
	}
	
	private void validar() {
		this.asegurarIntegridadDescripcion();
		this.asegurarIntegridadFecha();
		this.asegurarIntegridadLugar();
	}
	
	
	private void asegurarIntegridadDescripcion() {
		if (getDescripcion() == null) {
			throw new RuntimeException("La descripcion no puede ser nula");
		} else if (getDescripcion().trim().intern() == "") {
			throw new RuntimeException("La descripcion no puede ser vacia");
		} else if (getDescripcion().trim().length() > 300) {
		
			throw new RuntimeException("La descripcion del objeto no puede tener mas de 300 caracteres");
		} else if (!ExpresionRegularEnum.SOLO_TEXTO.cumplePatron(getDescripcion())) {
			String mensaje = "El nombre del cliente solo puede contener letras y espacios";
			throw new RuntimeException("La descripcion del objeto no puede tener mas de 300 caracteres");
		}
	}
	
	private void asegurarIntegridadLugar() {
		if (getLugar() == null) {
			throw new RuntimeException("El lugar no puede ser nula");
		} else if (getLugar().trim().intern() == "") {
			throw new RuntimeException("Ellugar no puede ser vacia");
		} else if (getDescripcion().trim().length() > 300) {
		
			throw new RuntimeException("El lugar no puede tener mas de 300 caracteres");
		} else if (!ExpresionRegularEnum.SOLO_TEXTO.cumplePatron(getLugar())) {
			throw new RuntimeException("La descripcion del objeto no puede tener mas de 300 caracteres");
		}
	}
	
	private void asegurarIntegridadFecha() {
		if (!Calendar.getInstance().before(getFecha())) {
			throw new RuntimeException("La fecha de creacion de la cuenta debe ser antes a la fecha actual.");
		}else if(!ExpresionRegularEnum.SOLO_FECHA.cumplePatron(getFecha().toString()));
	}
	
	
	
	
	
	
	
	
	

}

package co.com.supersoft.encuentraloperdido.datos.interfaces;

import java.util.List;

import co.encuentraloperdido.dominio.PublicacionDominio;


public interface IPublicacionDAO {
	void crear(PublicacionDominio publicacion);



	List<PublicacionDominio> consultar();

}

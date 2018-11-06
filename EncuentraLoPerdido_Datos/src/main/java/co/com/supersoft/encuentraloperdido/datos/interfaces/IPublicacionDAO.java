package co.com.supersoft.encuentraloperdido.datos.interfaces;

import java.util.List;

import co.encuentraloperdido.dominio.PublicacionDominio;


public interface IPublicacionDAO {
	void crear(PublicacionDominio publicacionDominio);

	void actualizar(PublicacionDominio publicacionDominio);

	void eliminar(PublicacionDominio publicacionDominio);

	List<PublicacionDominio> consultar(PublicacionDominio publicacionDominio);

}

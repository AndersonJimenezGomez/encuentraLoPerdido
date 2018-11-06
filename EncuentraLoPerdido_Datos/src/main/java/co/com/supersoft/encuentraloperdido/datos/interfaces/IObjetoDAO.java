package co.com.supersoft.encuentraloperdido.datos.interfaces;

import java.util.List;

import co.encuentraloperdido.dominio.ObjetoDominio;

public interface IObjetoDAO {
	
	void crear(ObjetoDominio objetoDominio);

	void actualizar(ObjetoDominio objetoDominio);

	void eliminar(ObjetoDominio objetoDominio);

	List<ObjetoDominio> consultar(ObjetoDominio objetoDominio);
}

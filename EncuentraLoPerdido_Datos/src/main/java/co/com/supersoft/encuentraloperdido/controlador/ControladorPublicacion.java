package co.com.supersoft.encuentraloperdido.controlador;

import java.util.List;

import co.com.supersoft.encuentraloperdido.DAO.ObjetoDAO;
import co.com.supersoft.encuentraloperdido.DAO.PubliacionDAO;
import co.com.supersoft.encuentraloperdido.datos.interfaces.IObjetoDAO;
import co.com.supersoft.encuentraloperdido.datos.interfaces.IPublicacionDAO;
import co.encuentraloperdido.dominio.PublicacionDominio;

public class ControladorPublicacion {
	   public void crear(PublicacionDominio publicacion ) {
	        IPublicacionDAO dao=  new PubliacionDAO();
	        dao.crear(publicacion);
	    }



	  
	    public void consultar(){
	        
	        IPublicacionDAO dao=  new PubliacionDAO();
	        List<PublicacionDominio> publicacioness=dao.consultar();
	    }


}

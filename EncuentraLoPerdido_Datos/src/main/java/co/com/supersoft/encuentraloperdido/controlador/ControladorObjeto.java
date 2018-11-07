package co.com.supersoft.encuentraloperdido.controlador;

import co.encuentraloperdido.dominio.ObjetoDominio;


import java.util.List;

import co.com.supersoft.encuentraloperdido.DAO.ObjetoDAO;
import co.com.supersoft.encuentraloperdido.datos.interfaces.IObjetoDAO;

public class ControladorObjeto {
    public void crear(ObjetoDominio objeto ) {
        IObjetoDAO dao=  new ObjetoDAO();
        dao.crear(objeto);
    }


    public void actualizar(ObjetoDominio objeto) {
    	IObjetoDAO dao=  new ObjetoDAO();
        dao.actualizar(objeto);
    }


    public void eliminar(ObjetoDominio objeto) {
    	IObjetoDAO dao=  new ObjetoDAO();
        dao.eliminar(objeto);
    }

  
    public void consultar(){
        
        IObjetoDAO dao=  new ObjetoDAO();
        List<ObjetoDominio> objetos=dao.consultar();
    }


}

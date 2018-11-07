package co.com.supersoft.encuentraloperdido.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import co.com.supersoft.encuentraloperdido.conexion.Conexion;
import co.com.supersoft.encuentraloperdido.datos.interfaces.IPublicacionDAO;
import co.encuentraloperdido.dominio.PublicacionDominio;

public class PubliacionDAO implements IPublicacionDAO {

	public void crear(PublicacionDominio publicacion) {

		Statement stm = null;
		Connection con = null;

		String sql = "INSERT INTO objeto values (NULL,'" + "','" + publicacion.getTipoPublicacion() + "','"
				+ publicacion.getObjeto().getIdObjeto() + "')";

		try {
			con = Conexion.conectar();
			stm = (Statement) con.createStatement();
			stm.execute(sql);
			stm.close();
			con.close();
		} catch (SQLException e) {
			throw new RuntimeException("Error: Clase PublicacionDAO, metodo crear " + sql);

		}

	}


	public List<PublicacionDominio> consultar() {
		Connection co = null;
		Statement stm = null;
		ResultSet rs = null;

		String sql = "SELECT * FROM objeto ORDER BY idobjeto";

		List<PublicacionDominio> publicaciones = new ArrayList<PublicacionDominio>();

		try {
			co = Conexion.conectar();
			stm = (Statement) co.createStatement();
			rs = ((java.sql.Statement) stm).executeQuery(sql);
			while (rs.next()) {
				PublicacionDominio c = new PublicacionDominio();
				c.setIdPublicacion(rs.getInt(1));
				c.setTipoPublicacion(rs.getString(2));
				//c.setObjeto(rs.getObject(3));
				publicaciones.add(c);
			}
			stm.close();
			rs.close();
			co.close();
		} catch (SQLException e) {
			throw new RuntimeException("Error: Clase PublicacionDAO, metodo obtener");

		}

		return publicaciones;

	}


}

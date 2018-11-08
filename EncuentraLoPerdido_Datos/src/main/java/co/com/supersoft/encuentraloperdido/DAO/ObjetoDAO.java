package co.com.supersoft.encuentraloperdido.DAO;

import java.awt.Image;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import co.com.supersoft.encuentraloperdido.conexion.Conexion;
import co.com.supersoft.encuentraloperdido.datos.interfaces.IObjetoDAO;
import co.encuentraloperdido.dominio.ObjetoDominio;

public class ObjetoDAO implements IObjetoDAO {


	public void crear(ObjetoDominio objetoDominio) {

		Statement stm = null;
		Connection con = null;

		String sql = "INSERT INTO objeto values (null," + ",'" + objetoDominio.getDescripcion() + "',"
				+ null + ",'2018-10-12','" + objetoDominio.getFecha() + "')";

		try {
			con = Conexion.conectar();
			stm = (Statement) con.createStatement();
			stm.execute(sql);
			stm.close();
			con.close();
		} catch (SQLException e) {
			throw new RuntimeException("Error: Clase ObjetoDAO, metodo crear " + sql);

		}

	}

	public void actualizar(ObjetoDominio objetoDominio) {
		Connection connect = null;
		Statement stm = null;

		boolean actualizar = false;

		String sql = "UPDATE objeto descripcion='" + objetoDominio.getDescripcion() + "', foto='"
				+ objetoDominio.getFoto() + "', foto='" + objetoDominio.getFoto()+ "', fecha'"+objetoDominio.getFecha()+ "', lugar='"+ objetoDominio.getLugar()+ "'" + " WHERE ID=" + objetoDominio.getIdObjeto();
		try {
			connect = Conexion.conectar();
			stm = connect.createStatement();
			stm.execute(sql);
			actualizar = true;
		} catch (SQLException e) {
			throw new RuntimeException("Error: Clase ObjetoDao, metodo actualizar");
			
		}
	

	}

	public void eliminar(ObjetoDominio objetoDominio) {
		Connection connect = null;
		Statement stm = null;

		boolean eliminar = false;

		String sql = "DELETE FROM objeto WHERE ID=" + objetoDominio.getIdObjeto();
		try {
			connect = Conexion.conectar();
			stm = connect.createStatement();
			stm.execute(sql);
			eliminar = true;
		} catch (SQLException e) {
			throw new RuntimeException("Error: Clase ClienteDaoImple, metodo eliminar");

		}

	}

	public List<ObjetoDominio> consultar() {
		Connection co = null;
		Statement stm = null;
		ResultSet rs = null;

		String sql = "SELECT * FROM objeto ORDER BY idobjeto";

		List<ObjetoDominio> listaObjetos = new ArrayList<ObjetoDominio>();

		try {
			co = Conexion.conectar();
			stm = (Statement) co.createStatement();
			rs = ((java.sql.Statement) stm).executeQuery(sql);
			while (rs.next()) {
				ObjetoDominio c = new ObjetoDominio();
				c.setIdObjeto(rs.getInt(1));
				c.setDescripcion(rs.getString(2));
				c.setFoto((Image) rs.getBlob(3));

				c.setFecha(rs.getDate(4));
				c.setLugar(rs.getString(5));
				listaObjetos.add(c);
			}
			stm.close();
			rs.close();
			co.close();
		} catch (SQLException e) {
			throw new RuntimeException("Error: Clase ObjetoDAO, metodo obtener");

		}

		return listaObjetos;

	}

}

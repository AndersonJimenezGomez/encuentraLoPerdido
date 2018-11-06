package co.com.supersoft.encuentraloperdido.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class Conexion {
    public static Connection conectar() {
        Connection conexion = null;

        String password = "1234";
        String user = "root";
        try {

            String url = "jdbc:mysql://localhost/mydb?useUnicode=true"
                    +"&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false"
                    +"&serverTimezone=UTC&useSSL=false";

            conexion = DriverManager.getConnection(url,user,password);
            if (conexion != null) {
                System.out.println("Conexión satisfactoria");
            }

        } catch (SQLException e) {
            System.out.println(
                    "Error en la conexión");
            e.printStackTrace();
        }

        return conexion;
    }
      


}

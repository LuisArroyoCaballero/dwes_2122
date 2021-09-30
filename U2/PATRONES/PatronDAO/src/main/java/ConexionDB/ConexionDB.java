package ConexionDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionDB {
	public static Connection con = null;
	private static final String conUrl = "jdbc:mariadb://localhost:3336/classicmodels?user=root&password=root"
			+ "&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	
	public static Connection getConnection() {
		try {

			if (con == null) {
				con = DriverManager.getConnection(ConexionDB.conUrl);
				System.out.println("Conexi�n realizada correctamente");
			}

		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		
		return con;
	}
	
	public static void close() {
		if (con!=null) {
			try {
				con.close();
			} catch (SQLException e) {

				e.printStackTrace();
			}
		}
	}
}

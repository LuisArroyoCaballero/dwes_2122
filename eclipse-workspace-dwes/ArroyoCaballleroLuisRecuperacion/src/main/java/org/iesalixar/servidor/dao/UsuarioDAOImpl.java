package org.iesalixar.servidor.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.iesalixar.servidor.bd.PoolDB;
import org.iesalixar.servidor.models.Usuario;

public class UsuarioDAOImpl implements UsuarioDAO {

	@Override
	public boolean registerUsuario(Usuario usuario) {

		int resultado = 0;
		PoolDB pool = new PoolDB();
		Connection con = pool.getConnection();

		try {
			String sql = "insert into usuarios values(?,?,?,?,?,?)";
			PreparedStatement statement = con.prepareStatement(sql);
			statement.setString(1, usuario.getUsuario());
			statement.setString(2, usuario.getEmail());
			statement.setString(3, usuario.getPassword());
			statement.setString(4, usuario.getFirstName());
			statement.setString(5, usuario.getLastName());
			statement.setString(6, usuario.getRole());

			resultado = statement.executeUpdate();

			con.close();

		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}

		return (resultado == 0 ? false : true);
	}

	@Override
	public Usuario getUsuario(String email) {
		
		Usuario usuario = null;
		PoolDB pool = new PoolDB();
		Connection con = pool.getConnection();
		
		try {
			
			String sql = "select * from usuarios where email=?";
			PreparedStatement statement = con.prepareStatement(sql);
			statement.setString(1, email);
			
			ResultSet rs = statement.executeQuery();
			
			while (rs.next()) {

				usuario = new Usuario();
				usuario.setUsuario(rs.getString("usuario"));
				usuario.setPassword(rs.getString("password"));
				usuario.setEmail(rs.getString("email"));
				usuario.setFirstName(rs.getString("firstName"));
				usuario.setLastName(rs.getString("lastName"));
				usuario.setRole(rs.getString("role"));
			}
			
			con.close();
			
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		
		return usuario;
	}
}

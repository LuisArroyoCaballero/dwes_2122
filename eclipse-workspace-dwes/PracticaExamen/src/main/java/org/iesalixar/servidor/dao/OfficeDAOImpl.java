package org.iesalixar.servidor.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.iesalixar.servidor.bd.PoolDB;
import org.iesalixar.servidor.models.Office;

public class OfficeDAOImpl implements OfficeDAO {

	@Override
	public ArrayList<Office> getAll() {
		
		ArrayList<Office> officeList = new ArrayList<>();
		Office oficina;
		PoolDB pool = new PoolDB();
		Connection con = pool.getConnection();
		
		try {
			
			String sql = "select * from offices";
			PreparedStatement statement = con.prepareStatement(sql);
			ResultSet rs = statement.executeQuery();
			
			while (rs.next()) {
				
				oficina = new Office();
				oficina.setOfficeCode(rs.getString("officeCode"));
				oficina.setCity(rs.getString("city"));
				oficina.setPhone(rs.getString("phone"));
				oficina.setAddressLine1(rs.getString("addressLine1"));
				oficina.setAddressLine2(rs.getString("addressLine2"));
				oficina.setState(rs.getString("state"));
				oficina.setCountry(rs.getString("country"));
				oficina.setPostalCode(rs.getString("postalCode"));
				oficina.setTerritory(rs.getString("territory"));
				
				officeList.add(oficina);
				
			}
			
			con.close();
			
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		
		return officeList;
	}

}

package org.iesalixar.servidor.bd;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;

public class PoolDB {

	public DataSource dataSource;

	public PoolDB() {

		initDataSource();

	}

	private void initDataSource() {
	        
	        Properties properties = new Properties();
	        try {
	            properties.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("bd.properties"));
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        
	        BasicDataSource basicDataSource = new BasicDataSource();
	        
	        basicDataSource.setDriverClassName(properties.getProperty("db.classForName"));
	        
	        //Crear url
	        basicDataSource.setUsername( properties.getProperty("db.username"));
	        basicDataSource.setPassword( properties.getProperty("db.password"));
	        String url =   properties.getProperty("db.url" ) + "//" +
	                 properties.getProperty("db.host") + ":" +
	                 properties.getProperty("db.port") + "/" +
	               properties.getProperty("db.dbname");
	        
	        //Setear conexiones maximas, y conexiones inactivas maxima
	        basicDataSource.setUrl(url);
	             basicDataSource.setMaxTotal(Integer.parseInt(properties.getProperty("db.pool.maxTotal")));
	        basicDataSource.setMaxIdle(Integer.parseInt( properties.getProperty("db.pool.maxIdle" )));
	        
	        dataSource = basicDataSource;                        
	    }
	
	 public Connection getConnection() {
	        Connection result = null;
	        try {
	            result = dataSource.getConnection();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        
	        //logger.info("PoolDB 'getConnection' method called (it returned valid connection: '" + (result!=null) + "')");
	        
	        return result;
	    }


}

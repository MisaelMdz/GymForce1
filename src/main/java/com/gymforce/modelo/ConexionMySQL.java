package com.gymforce.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConexionMySQL {
	private Connection connection;
<<<<<<< HEAD
	private String url = "jdbc:mysql://localhost/gymforce";
	private String usuario = "root";
	private String contrasena = "";
=======
	private String url = "jdbc:mysql://localhost/gymforce1";
	private String usuario = "root";
	private String contrasena = "1";
>>>>>>> ffecaa858964d3043f76faa241ab1d0c0d09466e

	public Connection getConnection() {
		return connection;
	}

	public void setConnection(Connection connection) {
		this.connection = connection;
	}

	public void establecerConexion() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(url, usuario, contrasena);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void cerrarConexion() {
		try {
			connection.close();
		} catch (SQLException ex) {
			Logger.getLogger(ConexionMySQL.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
}

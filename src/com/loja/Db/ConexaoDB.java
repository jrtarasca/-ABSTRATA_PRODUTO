package com.loja.Db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDB {
    public static Connection conectar() {
        Connection conexao = null;
        try {
            String url = "jdbc:mysql://localhost:3306/loja";
            String usuario = "root";
            
            
            conexao = DriverManager.getConnection(url, usuario, "");
        } catch (SQLException e) {
            System.err.println("Erro ao conectar ao banco de dados: " + e.getMessage());
        }
        return conexao;
    }
}

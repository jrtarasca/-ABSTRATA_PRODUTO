package com.loja.Db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Inserir {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Connection conexao = ConexaoDB.conectar();

        if (conexao != null) {
            String sql = "INSERT INTO produtos (nomeProduto, preco, precoVenda, tipo) VALUES (?, ?, ?, ?)";

            try {
                PreparedStatement stmt = conexao.prepareStatement(sql);

                System.out.print("Digite o NOME do produto: ");
                String nome = scan.nextLine();
                
                System.out.print("Digite o preço do produto: ");
                double preco = scan.nextDouble();
                scan.nextLine();
                
                System.out.print("Digite o preço de venda do produto: ");
                double precoVenda = scan.nextDouble();
                scan.nextLine();
               
                System.out.print("O produto é alimentício?: ");
                boolean tipo = scan.nextBoolean();
            
                

                stmt.setString(1, nome);
                stmt.setDouble(2, preco);
                stmt.setDouble(3, precoVenda);
                stmt.setBoolean(4, tipo);

                
             
                stmt.executeUpdate();
                System.out.println("Produto inserido com sucesso!");
            } catch (SQLException e) {
                System.err.println("Erro ao inserir dados: " + e.getMessage());
            }
        }
    }
}

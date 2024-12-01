package  com.loja.Db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Atualizar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Connection conexao = ConexaoDB.conectar();
        if (conexao != null) {
            String sql = "UPDATE produtos SET nomeProduto = ?, preco = ?, precoVenda = ?, tipo = ? WHERE id = ?";

            try {
                PreparedStatement stmt = conexao.prepareStatement(sql);

                System.out.print("Informe o ID do Produto: ");
                int id = scan.nextInt();
                scan.nextLine();

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
                String dataValidade = null;
                String infoNutricionais = null;
                String tamanho = null, cor = null, material = null;

             

                stmt.setString(1, nome);
                stmt.setDouble(2, preco);
                stmt.setDouble(3, precoVenda);
                stmt.setBoolean(4, tipo);
                stmt.setInt(5, id);

                int rowsUpdated = stmt.executeUpdate();

                if (rowsUpdated > 0) {
                    System.out.println("Produto atualizado com sucesso!");
                } else {
                    System.out.println("Nenhum produto encontrado com o ID fornecido.");
                }
            } catch (SQLException e) {
                System.err.println("Erro ao atualizar dados: " + e.getMessage());
            }
        }
    }
}

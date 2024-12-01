package  com.loja.Db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Deletar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Connection conexao = ConexaoDB.conectar();
        if (conexao != null) {
            String sql = "DELETE FROM produtos WHERE id = ?";

            try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
                System.out.print("Digite o ID do produto que voce deseja excluir: ");
                int id = scan.nextInt();

                stmt.setInt(1, id);
                int rowsAffected = stmt.executeUpdate();

                if (rowsAffected > 0) {
                    System.out.println("Produto excluído");
                } else {
                    System.out.println("Nenhum produto encontrado com o ID fornecido.");
                }
            } catch (SQLException e) {
                System.err.println("Erro ao deletar dados: " + e.getMessage());
            }
        }
    }
}

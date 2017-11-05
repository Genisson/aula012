package acessobd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AcessoBd {
    public static void main(String[] args) throws SQLException {
        Connection conexao = DriverManager.getConnection(
                "jdbc:derby://localhost:1527/sample", "app", "app");
        System.out.println("Conectado!");
        conexao.close();
    }
}


















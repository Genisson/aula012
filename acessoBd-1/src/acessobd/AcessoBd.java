package acessobd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AcessoBd {

    public static void main(String[] args) throws SQLException {
        Connection conexao = DriverManager.getConnection(
                "jdbc:derby://localhost:1527/sample", "app", "app");
        System.out.println("Conectado!");

        PreparedStatement stmt = conexao.prepareStatement("select city from customer");

        // executa um select
        ResultSet rs = stmt.executeQuery();

        // itera no ResultSet
        while (rs.next()) {
            String cidade = rs.getString("city");
            System.out.println(cidade);
        }

        rs.close();
        stmt.close();

        conexao.close();
    }
}

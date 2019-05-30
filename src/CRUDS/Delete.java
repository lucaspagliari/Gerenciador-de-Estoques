/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRUDS;

import conexoes.ConexaoSQLite;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Lab07-Prof
 */
public class Delete {

    public static void deleteProdutos(int codigo) {

        ConexaoSQLite conexaoSQLite = new ConexaoSQLite();

        conexaoSQLite.conectar();

        ResultSet resultSet = null;

        PreparedStatement preparedStatement = null;

        String sql = "DELETE FROM  tbl_produto "
                + " WHERE codigo = ?;";

        try {

            preparedStatement = conexaoSQLite.criarPreparedStatement(sql);
            preparedStatement.setInt(1, codigo);

            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {

                System.out.println("PRODUTO Deletado");
                System.out.println("CODIGO = " + resultSet.getInt("codigo"));
                System.out.println("NOME = " + resultSet.getString("nome"));
                System.out.println("CATEGORIA = " + resultSet.getString("categoria"));
                System.out.println("QUANTIDADE = " + resultSet.getInt("quantidade"));

            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                resultSet.close();
                preparedStatement.close();
                conexaoSQLite.desconectar();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }

    }
}

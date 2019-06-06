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
 * @author Jack
 */
public class Select {

    public static String[] buscaProdutosCodigo(int codigo) {

        ConexaoSQLite conexaoSQLite = new ConexaoSQLite();

        conexaoSQLite.conectar();

        ResultSet resultSet = null;
        PreparedStatement preparedStatement = null;
        String encontrado;
        String[] retornos;
        retornos = null;
        int i = 0;
        String sql = "SELECT * "
                + " FROM tbl_produto"
                + " WHERE codigo = ?;";

        try {

            preparedStatement = conexaoSQLite.criarPreparedStatement(sql);
            preparedStatement.setInt(1, codigo);

            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {

                /*System.out.println("PRODUTO SELECIONADO");
                System.out.println("CODIGO = " + resultSet.getInt("codigo"));
                System.out.println("NOME = " + resultSet.getString("nome"));
                System.out.println("CATEGORIA = " + resultSet.getString("categoria"));
                System.out.println("QUANTIDADE = " + resultSet.getInt("quantidade"));
                 */
                encontrado = Integer.toString(resultSet.getInt("codigo")) + "|" + resultSet.getString("nome") + "|" + resultSet.getString("categoria") + "|" + Integer.toString(resultSet.getInt("quantidade"));
                retornos[i] = encontrado;
                i++;

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
        return retornos;
    }

    public static String[] buscaProdutosNome(String nome) {

        ConexaoSQLite conexaoSQLite = new ConexaoSQLite();

        conexaoSQLite.conectar();

        ResultSet resultSet = null;
        PreparedStatement preparedStatement = null;
        String encontrado;
        String[] retornos;
        retornos = null;
        int i = 0;
        String sql = "SELECT * "
                + " FROM tbl_produto"
                + " WHERE nome = ?;";

        try {

            preparedStatement = conexaoSQLite.criarPreparedStatement(sql);
            preparedStatement.setString(1, nome);

            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {

                /* System.out.println("PRODUTO SELECIONADO");
                System.out.println("CODIGO = " + resultSet.getInt("codigo"));
                System.out.println("NOME = " + resultSet.getString("nome"));
                System.out.println("CATEGORIA = " + resultSet.getString("categoria"));
                System.out.println("QUANTIDADE = " + resultSet.getInt("quantidade"));
                 */
                encontrado = Integer.toString(resultSet.getInt("codigo")) + "|" + resultSet.getString("nome") + "|" + resultSet.getString("categoria") + "|" + Integer.toString(resultSet.getInt("quantidade"));
                retornos[i] = encontrado;
                i++;

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
        return retornos;
    }

    public static String[] buscaProdutosCategoria(String categoria) {

        ConexaoSQLite conexaoSQLite = new ConexaoSQLite();

        conexaoSQLite.conectar();

        ResultSet resultSet = null;
        PreparedStatement preparedStatement = null;
        String encontrado;
        String[] retornos;
        retornos = null;
        int i = 0;
        String sql = "SELECT * "
                + " FROM tbl_produto"
                + " WHERE categoria = ?;";

        try {

            preparedStatement = conexaoSQLite.criarPreparedStatement(sql);
            preparedStatement.setString(1, categoria);

            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                /*
                System.out.println("PRODUTO SELECIONADO");
                System.out.println("CODIGO = " + resultSet.getInt("codigo"));
                System.out.println("NOME = " + resultSet.getString("nome"));
                System.out.println("CATEGORIA = " + resultSet.getString("categoria"));
                System.out.println("QUANTIDADE = " + resultSet.getInt("quantidade"));
                 */
                encontrado = Integer.toString(resultSet.getInt("codigo")) + "|" + resultSet.getString("nome") + "|" + resultSet.getString("categoria") + "|" + Integer.toString(resultSet.getInt("quantidade"));
                retornos[i] = encontrado;
                i++;

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
        return retornos;
    }
    
    
    
}


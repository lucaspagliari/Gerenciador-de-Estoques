/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRUDS;

import conexoes.ConexaoSQLite;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import Principal.Produto;
import sun.security.tools.keytool.Main;

/**
 *
 * @author Jack
 */
public class Insert {

    /**
     * @param codigo
     * @param nome
     * @param categoria
     * @param quantidade
     */
    public static void inserirProduto(int codigo, String nome, String categoria, int quantidade) {

        ConexaoSQLite conexaoSQLite = new ConexaoSQLite();

        Produto produto1 = new Produto();
        produto1.setCodigo(codigo);
        produto1.setNome(nome);
        produto1.setCategoria(categoria);
        produto1.setQuantidade(quantidade);

        conexaoSQLite.conectar();

        String sqlInsert = " INSERT INTO tbl_produto ("
                + "codigo,"
                + "nome,"
                + "categoria"
                + "quantidade"
                + ") VALUES(?,?,?)"
                + ";";

        PreparedStatement preparedStatement = conexaoSQLite.criarPreparedStatement(sqlInsert);

        try {

            preparedStatement.setInt(1, produto1.getCodigo());
            preparedStatement.setString(2, produto1.getNome());
            preparedStatement.setString(3, produto1.getCategoria());
            preparedStatement.setInt(4, produto1.getQuantidade());

            int resultado = preparedStatement.executeUpdate();

            if (resultado == 1) {
                System.out.println("Produto inserido!");
            } else {
                System.out.println("Produto não inserido! =[");
            }

        } catch (SQLException e) {
            System.out.println("Produto não inserido! =[");
        } finally{
            if(preparedStatement != null){
                try {
                    preparedStatement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            conexaoSQLite.desconectar();
        }

    }

}

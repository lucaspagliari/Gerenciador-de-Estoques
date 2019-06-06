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
import java.sql.Statement;
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
        Statement stmt = null;
        
        ConexaoSQLite conexaoSQLite = new ConexaoSQLite();

        conexaoSQLite.conectar();
        String sqlInsert = " INSERT INTO tbl_produto (codigo, nome, categoria, quantidade)"
                + "VALUES("+ codigo +", "+ nome +
                "," + categoria +", " + quantidade +");";

        stmt = conexaoSQLite.criarStatement();
        conexaoSQLite.desconectar();
 
    }
}

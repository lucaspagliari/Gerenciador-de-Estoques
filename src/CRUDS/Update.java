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
public class Update {
    
    public static void updateProdutosQuantidade(int codigo, int quantidade) {

        ConexaoSQLite conexaoSQLite = new ConexaoSQLite();

        conexaoSQLite.conectar();
        
       // ResultSet resultSet = null;
        
        PreparedStatement preparedStatement = null;
        
        String sql = "UPDATE tbl_produto "
                + " SET "
                + "quantidade = ?"
                + " WHERE codigo = ?;";

        try{
            
                        
            preparedStatement = conexaoSQLite.criarPreparedStatement(sql);
            preparedStatement.setInt(2, quantidade);
            preparedStatement.setInt(1, codigo);
            
           /* resultSet = preparedStatement.executeQuery();
            
            while (resultSet.next()) {
                
                System.out.println("PRODUTO SELECIONADO");
                System.out.println("CODIGO = " + resultSet.getInt("codigo"));
                System.out.println("NOME = " + resultSet.getString("nome"));
                System.out.println("CATEGORIA = " + resultSet.getString("categoria"));
                System.out.println("QUANTIDADE = " + resultSet.getInt("quantidade"));
                
            }*/
            
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            try{
            //    resultSet.close();
                preparedStatement.close();
                conexaoSQLite.desconectar();
            }catch(SQLException ex){
                ex.printStackTrace();
            }
        }
        
    }
public static void updateProdutosNome(int codigo, String nome) {

        ConexaoSQLite conexaoSQLite = new ConexaoSQLite();

        conexaoSQLite.conectar();
        
        //ResultSet resultSet = null;
        
        PreparedStatement preparedStatement = null;
        
        String sql = "UPDATE tbl_produto "
                + " SET "
                + "nome = ?"
                + " WHERE codigo = ?;";

        try{
            
                        
            preparedStatement = conexaoSQLite.criarPreparedStatement(sql);
            preparedStatement.setString(2, nome);
            preparedStatement.setInt(1, codigo);
            
           /*resultSet = preparedStatement.executeQuery();
            
            while (resultSet.next()) {
                
                System.out.println("PRODUTO SELECIONADO");
                System.out.println("CODIGO = " + resultSet.getInt("codigo"));
                System.out.println("NOME = " + resultSet.getString("nome"));
                System.out.println("CATEGORIA = " + resultSet.getString("categoria"));
                System.out.println("QUANTIDADE = " + resultSet.getInt("quantidade"));
                
            }*/
            
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            try{
                //resultSet.close();
                preparedStatement.close();
                conexaoSQLite.desconectar();
            }catch(SQLException ex){
                ex.printStackTrace();
            }
        }
        
    }
public static void updateProdutosCategoria(int codigo, String categoria) {

        ConexaoSQLite conexaoSQLite = new ConexaoSQLite();

        conexaoSQLite.conectar();
        
       // ResultSet resultSet = null;
        
        PreparedStatement preparedStatement = null;
        
        String sql = "UPDATE tbl_produto "
                + " SET "
                + "categoria = ?"
                + " WHERE codigo = ?;";

        try{
            
                        
            preparedStatement = conexaoSQLite.criarPreparedStatement(sql);
            preparedStatement.setString(2, categoria);
            preparedStatement.setInt(1, codigo);
            
         /*   resultSet = preparedStatement.executeQuery();
            
            while (resultSet.next()) {
                
                System.out.println("PRODUTO SELECIONADO");
                System.out.println("CODIGO = " + resultSet.getInt("codigo"));
                System.out.println("NOME = " + resultSet.getString("nome"));
                System.out.println("CATEGORIA = " + resultSet.getString("categoria"));
                System.out.println("QUANTIDADE = " + resultSet.getInt("quantidade"));
                
            }*/
            
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            try{
               // resultSet.close();
                preparedStatement.close();
                conexaoSQLite.desconectar();
            }catch(SQLException ex){
                ex.printStackTrace();
            }
        }
        
    }
}

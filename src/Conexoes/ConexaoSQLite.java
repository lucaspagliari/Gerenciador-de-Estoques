/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexoes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Prof Lab24
 */
public class ConexaoSQLite {

    private Connection conexao;
//conectar - caso nao exista ele cria DB

    public boolean conectar() {

        try {
            String url = "jdbc:sqlite:DB/DB_StorageManager.db";
            this.conexao = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            return false;
        }
        System.out.println("Conectado");
        return true;

    }

    public boolean desconectar(){

    
        try {
           
           if (this.conexao.isClosed() == false) {
            this.conexao.close();
               System.out.println("Desconectado");
        }
    }
    catch (SQLException e

    
        ) {
            System.err.println(e.getMessage());
        return false;
    }


return true;

    }
}

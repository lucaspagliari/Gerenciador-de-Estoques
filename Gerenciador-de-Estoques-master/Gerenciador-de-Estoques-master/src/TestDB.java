
import Conexoes.ConexaoSQLite;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Prof Lab24
 */
public class TestDB {
    public static void main(String[] args) {
        ConexaoSQLite conectsql = new ConexaoSQLite();
        
        conectsql.conectar(); 
        conectsql.desconectar();
    }
    
}

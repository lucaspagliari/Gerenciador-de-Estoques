/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import conexoes.ConexaoSQLite;
import CRUDS.CriarBancoSQLite;

/**
 *
 * @author Lab07-Prof
 */
public class Main {
     public static void main(String[] args) {

        ConexaoSQLite conexaoSQLite = new ConexaoSQLite();
        CriarBancoSQLite criarBancoSQLite = new CriarBancoSQLite(conexaoSQLite);

        criarBancoSQLite.criarTabelaPessoa();
        int codigo, quantidade;
        String nome;
        
     } 
}

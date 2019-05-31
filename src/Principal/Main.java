/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import conexoes.ConexaoSQLite;
import CRUDS.CriarBancoSQLite;
import CRUDS.Delete;
import CRUDS.Insert;
import CRUDS.Select;
import CRUDS.Update;

/**
 *
 * @author Lab07-Prof
 * Este é um main temporario para CRUDS
 */
public class Main {

    public static void main(String[] args) {
//ADICIONAR AO MAIN DE VERDADE POR CONTA DO CRIAR BANCO E TABELA 
        ConexaoSQLite conexaoSQLite = new ConexaoSQLite();
        CriarBancoSQLite criarBancoSQLite = new CriarBancoSQLite(conexaoSQLite);

        criarBancoSQLite.criarTabelaPessoa();
        int codigo, quantidade;
        String nome, categoria;

        //atribuição de dados deve vir da gui! 
        //os dados abaixo são apenas para teste.
        codigo = 0;
        quantidade = 0;
        nome = "sem nome";
        categoria = "sem categoria";
        
        //chamada de insert de exemplo
        Insert.inserirProduto(codigo,nome,categoria,quantidade);
        //chamadas de select
        Select.buscaProdutosCodigo(codigo);//busca por codigo
        Select.buscaProdutosCategoria(categoria);//busca por categoria
        Select.buscaProdutosNome(nome);//busca por nome
        //chamadas de update
        Update.updateProdutosCategoria(codigo, categoria);//updade de categoria. baseado em codigo sempre!
        Update.updateProdutosNome(codigo, nome);//update de nome (sim puta comentario desnecessario kkkkk)
        Update.updateProdutosQuantidade(codigo, quantidade);
        //chamada de delete
        Delete.deleteProdutos(codigo);//só da para deletar pela categoria!
        
        

    }
}

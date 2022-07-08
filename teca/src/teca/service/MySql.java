/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teca.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import teca.model.Livro;

/**
 *
 * @author Gamer
 */
public class MySql {    
//Configuração GERAL
    String nomeBanco = "tecadb";
    String url = "jdbc:mysql://localhost/"+nomeBanco;   
    String sql;
    private void DB_DeleteAndInsert(String msgTry, String msgCatch) { 
            try 
            {
             
	     Connection conexao = DriverManager.getConnection(url,"root","");

	     PreparedStatement atualizar = conexao.prepareStatement(sql);

	     atualizar.executeUpdate();

	     JOptionPane.showMessageDialog(null,msgTry);
                        
            }
	  
            catch(Exception erro){ 
          
              JOptionPane.showMessageDialog(null,msgCatch+" :"+erro);
               
            }
    }        
    
    public void inserirLivro(
        String tabela, 
        //String primary_key, 
        Integer primary_key_value,  
        String titulo,
        String genero,
        String autor,       
        Integer nEdicao,
        Integer disponibilidade) {
                  sql = "INSERT INTO "+tabela+" (codISBN, titulo, genero, autor, nEdicao, disponibilidade) VALUES ('"+primary_key_value+"', '"+titulo+"', '"+genero+"', '"+autor+"', '"+nEdicao+"', '"+disponibilidade+"')";  
                  DB_DeleteAndInsert("Livro cadastrado com sucesso! =)", "Erro na conexão com o banco de Dados");           
    }
    
    public void selecionarLivro(String tituloLivro){
        Livro LVR = new Livro();
        String tituloDB;
        Integer codISBN_DB;
        String generoDB;
        String autorDB;
        Integer nEdicaoDB;
        Integer disponibilidadeDB;
        sql = "SELECT * FROM livro WHERE titulo = '"+tituloLivro+"'";
           try 
	   {

	     Connection conexao = DriverManager.getConnection(url, "root","");

	     PreparedStatement pesquisa = conexao.prepareStatement(sql);	     
             
	     ResultSet resultado = pesquisa.executeQuery();
             
	     while (resultado.next()) {               
		 LVR.setTitulo(resultado.getString("titulo"));
                 LVR.setCodISBN(Integer.parseInt(resultado.getString("codISBN")));
                 LVR.setGenero(resultado.getString("genero"));                                   
                 LVR.setAutor(resultado.getString("autor"));                 
                 LVR.setnEdicao(Integer.parseInt(resultado.getString("nEdicao")));                
                 LVR.setDisponibilidade(Integer.parseInt(resultado.getString("disponibilidade")));                
             }
             JOptionPane.showMessageDialog(null, LVR.getDisponibilidade());
           } catch(Exception erro){ 
           
              JOptionPane.showMessageDialog(null,"Erro na Conexão com Banco de Dados : "+erro);               
           }              
    }
    
    public void excluir(String tabela, String primary_key, Integer primary_key_value) {
        sql = "DELETE FROM "+tabela+" WHERE "+primary_key+" = "+primary_key_value;
        DB_DeleteAndInsert("Livro deletado com sucesso!", "Erro na conexão com o banco de Dados");
    }
    
}

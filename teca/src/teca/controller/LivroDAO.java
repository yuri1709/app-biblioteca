/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teca.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import teca.model.Cdd;
import teca.model.Livro;
import teca.service.RegistroLivro;

/**
 *
 * @author Gamer
 */
public class LivroDAO {
    //Configuração GERAL
    String nomeBanco = "tecadb";
    String url = "jdbc:mysql://localhost/"+nomeBanco;   
    String sql, sql2;
    
    RegistroLivro RDM = new RegistroLivro();
    Cdd CDD = new Cdd();
    
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
    public void inserirLivro(Livro LVR) {
        
        sql = "INSERT INTO livro (registro, CDD, codISBN, titulo, genero, autor, nEdicao, disponibilidade) VALUES ('"+RDM.registroLivro(1000)+"','"+CDD.getCdd()+"','"+LVR.getCodISBN()+"', '"+LVR.getTitulo()+"', '"+CDD.getClasse()+"', '"+LVR.getAutor()+"', '"+LVR.getnEdicao()+"', '"+LVR.getDisponibilidade()+"')";  
        DB_DeleteAndInsert("Livro cadastrado com sucesso! =)", "Erro na conexão com o banco de Dados");    
    }
    
    
    public void excluir(Livro LVR) {
        sql2 = "SELECT * FROM livro WHERE titulo = '"+LVR.getTitulo()+"'";
        try 
	   {

	     Connection conexao = DriverManager.getConnection(url, "root","");

	     PreparedStatement pesquisa = conexao.prepareStatement(sql2);	     
             
	     ResultSet resultado = pesquisa.executeQuery();
             
	     while (resultado.next()) {                                
                 LVR.setRegistro(Integer.parseInt(resultado.getString("registro")));
             }
                                     
           } catch(Exception erro){ 
           
              JOptionPane.showMessageDialog(null,"Erro na Conexão com Banco de Dados : "+erro);               
           }                 
        
        sql = "DELETE FROM livro WHERE registro = "+LVR.getRegistro();
        DB_DeleteAndInsert("Livro de REGISTRO: "+LVR.getRegistro()+" deletado com sucesso!", "Erro na conexão com o banco de Dados");
        LVR.setTitulo("");
        LVR.setCodISBN(0);
        LVR.setGenero("");                                   
        LVR.setAutor("");                 
        LVR.setnEdicao(0);                
        LVR.setDisponibilidade(0);        
        
    }
    
    
}

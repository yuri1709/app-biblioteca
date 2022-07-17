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
    String sql, sql_get_registro;
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
    
    public void selecionarLivro(Livro LVR, String livroPesquisado){                
        sql = "SELECT * FROM livro WHERE titulo LIKE '%"+livroPesquisado+"%'";
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
             
           } catch(Exception erro){ 
           
              JOptionPane.showMessageDialog(null,"Erro na Conexão com Banco de Dados : "+erro);               
           }              
    }
    
   
    public void inserirLivro(Livro LVR) {
        
        sql = "INSERT INTO livro (registro, CDD, codISBN, titulo, genero, autor, nEdicao, disponibilidade) VALUES ('"+RDM.registroLivro(1000)+"','"+CDD.getCdd()+"','"+LVR.getCodISBN()+"', '"+LVR.getTitulo()+"', '"+CDD.getClasse()+"', '"+LVR.getAutor()+"', '"+LVR.getnEdicao()+"', '"+LVR.getDisponibilidade()+"')";  
        DB_DeleteAndInsert("Livro cadastrado com sucesso! =)", "Erro na conexão com o banco de Dados");    
    }
    
    public void editar(Livro LVR, String tituloAntigo) {
        sql_get_registro = "SELECT * FROM livro WHERE titulo = '"+tituloAntigo+"'";
        try 
	   {

	     Connection conexao = DriverManager.getConnection(url, "root","");

	     PreparedStatement pesquisa = conexao.prepareStatement(sql_get_registro);	     
             
	     ResultSet resultado = pesquisa.executeQuery();
             
	     while (resultado.next()) {                                
                 LVR.setRegistro(Integer.parseInt(resultado.getString("registro")));
                 
             }
             
             
                                     
           } catch(Exception erro){ 
           
              JOptionPane.showMessageDialog(null,"Erro na Conexão com Banco de Dados : "+erro);               
           }                 
        sql = "UPDATE livro SET CDD ='"+CDD.getCdd()+"', codISBN = '"+LVR.getCodISBN()+"', titulo = '"+LVR.getTitulo()+"', genero = '"+CDD.getClasse()+"', autor = '"+LVR.getAutor()+"', nEdicao = '"+LVR.getnEdicao()+"', titulo = '"+LVR.getTitulo()+"', disponibilidade = '"+LVR.getDisponibilidade()+"'WHERE registro='"+LVR.getRegistro()+"'";
        DB_DeleteAndInsert("Livro editdo com sucesso!", "Erro na conexão com o banco de Dados");
    }
    
    public void excluir(Livro LVR) {
        sql_get_registro = "SELECT * FROM livro WHERE titulo = '"+LVR.getTitulo()+"'";
        try 
	   {

	     Connection conexao = DriverManager.getConnection(url, "root","");

	     PreparedStatement pesquisa = conexao.prepareStatement(sql_get_registro);	     
             
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

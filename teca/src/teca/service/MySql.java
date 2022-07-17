/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teca.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Random;
import javax.swing.JOptionPane;
import teca.model.Cdd;
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
    
    Livro LVR = new Livro();
    
    //RETIRAR DA CLASSE ========================================================
    private int registroLivro(int number){ //gera um número de registro do livro
        Integer registro;
        Random gerador = new Random();
        return gerador.nextInt(number);
    }
    //===========================================================================
   
//funciona apenas nos métodos delete e insert
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
    //RETIRAR DA CLASE ==========================================
    public void inserirLivro(
        String tabela, 
        //String primary_key,         
        Float CDD,
        Integer codISBN,  
        String titulo,
        String genero,
        String autor,       
        Integer nEdicao,
        Integer disponibilidade)
    {        
        
                  sql = "INSERT INTO "+tabela+" (registro, CDD, codISBN, titulo, genero, autor, nEdicao, disponibilidade) VALUES ('"+registroLivro(1000)+"','"+CDD+"','"+codISBN+"', '"+titulo+"', '"+genero+"', '"+autor+"', '"+nEdicao+"', '"+disponibilidade+"')";  
                  DB_DeleteAndInsert("Livro cadastrado com sucesso! =)", "Erro na conexão com o banco de Dados");           
    }
    //RETIRAR DA CLASSE=====================================================
    
    
    public void selecionarLivro(String tituloLivro){                
        sql = "SELECT * FROM livro WHERE titulo LIKE '%"+tituloLivro+"%'";
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
    
    public void editarLivro(
    String tabela, 
        String tituloDoLivro,
        //String primary_key,         
        Float CDD,
        Integer codISBN,  
        String titulo,
        String genero,
        String autor,       
        Integer nEdicao,
        Integer disponibilidade )         
    {
        sql = "UPDATE "+tabela+" SET CDD ='"+CDD+"', codISBN = '"+codISBN+"', titulo = '"+titulo+"', genero = '"+genero+"', autor = '"+autor+"', nEdicao = '"+nEdicao+"', titulo = '"+titulo+"', disponibilidade = '"+disponibilidade+"'WHERE titulo='"+tituloDoLivro+"'";
        DB_DeleteAndInsert("Livro editdo com sucesso!", "Erro na conexão com o banco de Dados");
    }
    //Vou deixar isso aqui
    public void selecionarCDD(String generoLivro){
        Cdd CDD = new Cdd();
        sql = "SELECT * FROM CDD WHERE classe LIKE '%" + generoLivro +"%' ";
         try 
	   {

	     Connection conexao = DriverManager.getConnection(url, "root","");

	     PreparedStatement pesquisa = conexao.prepareStatement(sql);	     
             
	     ResultSet resultado = pesquisa.executeQuery();
             
	     while (resultado.next()) {               
                 CDD.setCdd(Float.parseFloat(resultado.getString("CDD")));
                 CDD.setClasse(resultado.getString("classe"));
             }
            JOptionPane.showMessageDialog(null,"CDD pegado com sucesso!");         
           } catch(Exception erro){ 
           
              JOptionPane.showMessageDialog(null,"Erro na Conexão com Banco de Dados : "+erro);               
           }                 
    }
    
      
        
    }
    


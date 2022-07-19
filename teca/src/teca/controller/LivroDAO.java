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
    String sql,sql2, sql_get_registro;
    RegistroLivro RDM = new RegistroLivro();
    Cdd CDD = new Cdd();
    
    
    
    public void selecionar(Livro LVR, String livroPesquisado, Boolean selecionarTodos){                
       Integer total = 0;
        
        if (selecionarTodos){ 
        sql = "SELECT * FROM livro WHERE titulo LIKE '%"+livroPesquisado+"%'";
        } else {
            //IRÁ SELECIONAR APENAS OS LIVROS DISPONIVEIS
            sql = "SELECT * FROM livro WHERE titulo LIKE '%"+livroPesquisado+"%' AND emprestado = 'D'"; 
        }
           try 
	   {
	     Connection conexao = DriverManager.getConnection(url, "root","");

	     PreparedStatement pesquisa = conexao.prepareStatement(sql);	     
             
	     ResultSet resultado = pesquisa.executeQuery();
             
	     while (resultado.next()) {  
                 LVR.setPrateleira(resultado.getString("prateleira"));
                 LVR.setEstante(resultado.getString("estante"));
                 LVR.setRegistro(resultado.getInt("registro"));
		 LVR.setTitulo(resultado.getString("titulo"));
                 LVR.setCodISBN(Integer.parseInt(resultado.getString("codISBN")));
                 LVR.setGenero(resultado.getString("genero"));                                   
                 LVR.setAutor(resultado.getString("autor"));                 
                 LVR.setnEdicao(Integer.parseInt(resultado.getString("nEdicao")));                
                 //pegando o número de livros disponiveis:
                 total++;
             }
              
               LVR.setDisponibilidade(total);//armazenando a quatidade de livros na tabela
           } catch(Exception erro){ 
           
              JOptionPane.showMessageDialog(null,"Erro na Conexão com Banco de Dados : "+erro);               
           }              
    }
       
    public void inserir(Livro LVR, Integer qtde) {
    qtde--;
    Integer registro = null, novoRegistro = null;
    //VERIFICA SE HÁ LIVROS COM O MESMO REGISTRO     
    for( int i =0; i <= qtde; i++ ) {
        registro = RDM.registroLivro(1000);
        
        while (registro == novoRegistro) {        
            sql = "SELECT * FROM livro WHERE registro ='"+registro+"'";    
            try 
                {
                  Connection conexao = DriverManager.getConnection(url, "root","");

                  PreparedStatement pesquisa = conexao.prepareStatement(sql);	     

                  ResultSet resultado = pesquisa.executeQuery();

                  while (resultado.next()) {                                
                      registro = Integer.parseInt(resultado.getString("registro"));                 
                  }
                  //ao dar select e já existir um registro do livro, ele gerará um novo registro.
                  novoRegistro = RDM.registroLivro(1000);
                  
                } catch(Exception erro){ 

                   JOptionPane.showMessageDialog(null,"registro valido : "+erro);               
                }   
        }
        //INSERE O LIVRO NO BANCO DE DADOS
        sql2 = "INSERT INTO livro (registro, CDD, codISBN, titulo, genero, autor, nEdicao, disponibilidade, emprestado,estante, prateleira) VALUES ('"+registro+"','"+CDD.getCdd()+"','"+LVR.getCodISBN()+"', '"+LVR.getTitulo()+"', '"+CDD.getClasse()+"', '"+LVR.getAutor()+"', '"+LVR.getnEdicao()+"', '"+LVR.getDisponibilidade()+"', 'D', '"+LVR.getEstante()+"', '"+LVR.getPrateleira()+"')";      
         try 
            {             
	     Connection conexao = DriverManager.getConnection(url,"root","");

	     PreparedStatement atualizar = conexao.prepareStatement(sql2);

	     atualizar.executeUpdate();                                                   
            }
	  
            catch(Exception erro){ 
               //gerar uma nova matricula                                            
          
               JOptionPane.showMessageDialog(null,"ERRO :"+erro);
               
            }

                               
    }                
       JOptionPane.showMessageDialog(null, "O sistema foi atualizado com sucesso");  
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
        
        sql = "UPDATE livro SET CDD ='"+CDD.getCdd()+"', codISBN = '"+LVR.getCodISBN()+"', titulo = '"+LVR.getTitulo()+"', genero = '"+CDD.getClasse()+"', autor = '"+LVR.getAutor()+"', nEdicao = '"+LVR.getnEdicao()+"', titulo = '"+LVR.getTitulo()+"', disponibilidade = '"+LVR.getDisponibilidade()+"', estante = '"+LVR.getEstante()+"', prateleira = '"+LVR.getPrateleira()+"'WHERE registro='"+LVR.getRegistro()+"'";
        DB_DeleteAndInsert("Livro editdo com sucesso!", "Erro na conexão com o banco de Dados",true);
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
        DB_DeleteAndInsert("Livro de REGISTRO: "+LVR.getRegistro()+" deletado com sucesso!", "Erro na conexão com o banco de Dados",true);
        LVR.setTitulo("");
        LVR.setCodISBN(0);
        LVR.setGenero("");                                   
        LVR.setAutor("");                 
        LVR.setnEdicao(0);                
        LVR.setDisponibilidade(0);        
        
    }
    
    //Métodos especificos
                      
    public void adicionarEmprestimo(Livro LVR) {
         System.out.print("valor do emprestimo: "+LVR.getEmprestado());
         sql = "UPDATE livro SET emprestado ='"+LVR.getEmprestado()+"'WHERE registro ="+LVR.getRegistro();
         DB_DeleteAndInsert("Valor do campo emprestimo alterado!", "Erro na conexão com o banco de Dados",true);
    }
    
    
    private void DB_DeleteAndInsert(String msgTry, String msgCatch, Boolean toogle) { 
            try 
            {             
	     Connection conexao = DriverManager.getConnection(url,"root","");

	     PreparedStatement atualizar = conexao.prepareStatement(sql);

	     atualizar.executeUpdate();
             if (toogle){
                JOptionPane.showMessageDialog(null,msgTry);
             }           
            }
	  
            catch(Exception erro){ 
                
              JOptionPane.showMessageDialog(null,msgCatch+" :"+erro);
               
            }
    }  
          
}

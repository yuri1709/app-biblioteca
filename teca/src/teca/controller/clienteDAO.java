/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teca.controller;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;
import javax.swing.JOptionPane;
import teca.model.Cliente;
/**
 *
 * @author Gamer
 */
public class ClienteDAO {
    String url = "jdbc:mysql://localhost/tecadb";
    String sql2;
    String sql_get_registro;
    String CPFDB = "";
   
    public void inserir(Cliente CL) {
         
	    //VERIFICANDO LOGIN EXISTENTE
            String sql2 = "SELECT * FROM clientes WHERE cpf='"+CL.getCpf()+"'";
           try 
	   {

	     Connection conexao = DriverManager.getConnection(url, "root","");

	     PreparedStatement pesquisa = conexao.prepareStatement(sql2);	     
             
	     ResultSet resultado = pesquisa.executeQuery();
             
	     while (resultado.next()) {    
                 
                 CPFDB  = resultado.getString("cpf");    
                 
             }
             
           } catch(Exception erro){ 
           
              JOptionPane.showMessageDialog(null,"Erro na Conexão com Banco de Dados : "+erro);               
           }      
       if (CPFDB.equals(CL.getCpf())) {
            
           JOptionPane.showMessageDialog(null,"O cpf inserido já foi cadastrado");
       }
       else {
           
         //String sql = "INSERT INTO cliente (nome,endereco,cpf,matricula) values ('"+cadastrarnome+"','"+cadastrarendereço.getText()+"','"+cadastrarcpf.getText()+"','"+cadastrarmatrícula.getText()+"')";
         String sql = "INSERT INTO clientes (matricula,nome,endereco,cpf) values ('"+CL.getMatricula()+"', '"+CL.getNome()+"', '"+CL.getEndereco()+"', '"+CL.getCpf()+"')"; 
        try
          {
               Connection conexao = DriverManager.getConnection(url,"root","");
               PreparedStatement atualizar = conexao.prepareStatement(sql);
               atualizar.executeUpdate();
               JOptionPane.showMessageDialog(null,"Cliente cadastrado com sucesso!");
          }

          catch(Exception erro){ 
              JOptionPane.showMessageDialog(null,"Erro na Conexão com Banco de Dados : "+erro);
          }      
       }  
    } 
    
    public void editar (Cliente CL){
        String url = "jdbc:mysql://localhost/tecadb";
	
        sql_get_registro = "SELECT * FROM clientes WHERE CPF = '"+CL.getCpf()+"'";
        try 
	   {

	     Connection conexao = DriverManager.getConnection(url, "root","");

	     PreparedStatement pesquisa = conexao.prepareStatement(sql_get_registro);	     
             
	     ResultSet resultado = pesquisa.executeQuery();
             
	     while (resultado.next()) {                                
                 CL.setMatricula(Integer.parseInt(resultado.getString("matricula")));
             }
                                     
           } catch(Exception erro){ 
           
              JOptionPane.showMessageDialog(null,"CPF NÃO ENCONTRADO : "+erro);               
           }                 
        
        
        String sql = "UPDATE clientes SET nome='"+CL.getNome()+"',endereco='"+CL.getEndereco()+"',matricula='"+CL.getMatricula()+"' WHERE cpf= '"+CL.getCpf()+"' ";
        
         try 
           {

	     Connection conexao = DriverManager.getConnection(url, "root","");

	     PreparedStatement atualizar = conexao.prepareStatement(sql);

	     atualizar.executeUpdate();

	     JOptionPane.showMessageDialog(null,"Atualizado com sucesso!");
    
	   }
	  
	   catch(SQLException erro) { 
           
              JOptionPane.showMessageDialog(null,"Erro na Conexão com Banco de Dados : "+erro);
               
           }     
    }
    
    public void gerarNovaMatricula (Cliente CL) {
        Random RDM = new Random();
        Integer novaMatricula = RDM.nextInt(5555);
        CL.setMatricula(novaMatricula);
         
	     JOptionPane.showMessageDialog(null,"Matrícula gerada com sucesso!\n"
                     + "sua nova matrícula é "+ novaMatricula
                    );    	  
    }
    
  

    
}


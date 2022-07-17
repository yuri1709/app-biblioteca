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
import teca.model.Cliente;
/**
 *
 * @author Gamer
 */
public class clienteDAO {
    String url = "jdbc:mysql://localhost/tecadb";
    String sql2;
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
    
    
    
}


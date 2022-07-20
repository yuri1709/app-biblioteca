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
import teca.model.EmprestimoLivro;
import teca.model.Livro;
import teca.service.RegistroLivro;

public class EmprestimoLivroDAO {
       String url = "jdbc:mysql://localhost/tecadb";
       String sql, sql2;
       
       public void inserir(EmprestimoLivro EML) {
                           
        sql = "INSERT INTO emp (emprestimo_id, matricula, registro) values ('"+EML.getEmprestimo_id()+"', '"+EML.getMatricula()+"','"+EML.getRegistro()+"')"; 
        try
          {
               Connection conexao = DriverManager.getConnection(url,"root","");
               PreparedStatement atualizar = conexao.prepareStatement(sql);
               atualizar.executeUpdate();
               JOptionPane.showMessageDialog(null,"Emprestimo realizado!");
          }

          catch(Exception erro){                
              JOptionPane.showMessageDialog(null,"Erro na Conexão com Banco de Dados : "+erro);
          }      
       }
              
       public void selecionar(EmprestimoLivro EML, Cliente CL) {
           String sql = "SELECT * FROM emp WHERE matricula='"+CL.getMatricula()+"'";
           try 
	   {

	     Connection conexao = DriverManager.getConnection(url, "root","");

	     PreparedStatement pesquisa = conexao.prepareStatement(sql);	     
             
	     ResultSet resultado = pesquisa.executeQuery();
             
	     while (resultado.next()) {    
                 
                //String nomes[i] = 1; 
                
                // i++
             }
             
           } catch(Exception erro){ 
           
              JOptionPane.showMessageDialog(null,"Erro na Conexão com Banco de Dados : "+erro);               
           }      
       }
       /*public void verQtdeLivros () {
           sql = "SELECT * FROM livros WHERE "
       }*/
}

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
import teca.model.Usuario;

/**
 *
 * @author Gamer
 */
public class UsuarioDAO {
   
    public void selecionar (Usuario USER) {
        String url = "jdbc:mysql://localhost/tecadb";
        String sql = "SELECT * FROM usuario WHERE login='"+USER.getLogin()+"'";  
       
        try 
            {

              Connection conexao = DriverManager.getConnection(url, "root","");

              PreparedStatement pesquisa = conexao.prepareStatement(sql);	     

              ResultSet resultado = pesquisa.executeQuery();

              while (resultado.next()) {               
                  USER.setId_usuario(Integer.parseInt(resultado.getString("id_usuario")));
                  USER.setLogin(resultado.getString("login"));
                  USER.setSenha(resultado.getString("senha"));                 
             }
            JOptionPane.showMessageDialog(null,"LOGIN : "+USER.getLogin()+ " SENHA:"+USER.getSenha());               
            } catch(Exception erro){ 

               JOptionPane.showMessageDialog(null,"Erro na Conexão com Banco de Dados : "+erro);               
            }      

    }
    
    public void inserir (Usuario USER) {
         String url = "jdbc:mysql://localhost/tecadb";
	 String loginDB =""; 
         
        //VERIFICANDO LOGIN EXISTENTE
            String sql2 = "SELECT * FROM usuario WHERE login='"+USER.getLogin()+"'";
           try 
	   {

	     Connection conexao = DriverManager.getConnection(url, "root","");

	     PreparedStatement pesquisa = conexao.prepareStatement(sql2);	     
             
	     ResultSet resultado = pesquisa.executeQuery();
             
	     while (resultado.next()) {               
		  loginDB  = resultado.getString("login");
                 
             }
             
           } catch(Exception erro){ 
           
              JOptionPane.showMessageDialog(null,"Erro na Conexão com Banco de Dados : "+erro);               
           }      
       if(loginDB.equals(USER.getLogin())){
            JOptionPane.showMessageDialog(null,"O nome inserido já foi cadastrado"); 
            
       }else {
            String sql = "INSERT INTO usuario (login,senha) values ('"+USER.getLogin()+"', '"+USER.getSenha()+"')";       
            System.out.println(USER.getSenha());
            try 
            {

	     Connection conexao = DriverManager.getConnection(url,"root","");

	     PreparedStatement atualizar = conexao.prepareStatement(sql);

	     atualizar.executeUpdate();

	     JOptionPane.showMessageDialog(null,"Administrador cadastrado com sucesso!");
    
            }
	  
            catch(Exception erro){ 
          
              JOptionPane.showMessageDialog(null,"Erro na Conexão com Banco de Dados : "+erro);
               
            }                          
         }
    }
}

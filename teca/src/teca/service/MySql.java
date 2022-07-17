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
                                     
    //Vou deixar isso aqui
    public void selecionarCDD(String generoLivro){
        Cdd CDD = new Cdd();
        Livro LVR = new Livro();         
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
    


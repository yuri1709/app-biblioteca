/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teca.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author Gamer
 */
public class MySql {
    //Configuração GERAL
    String nomeBanco = "tecadb";
    String url = "jdbc:mysql://localhost/"+nomeBanco;   
    String sql;
    
    
    public void excluir(String tabela, String primary_key, Integer primary_key_value){
        sql = "DELETE FROM "+tabela+" WHERE "+primary_key+" = "+primary_key_value;
        try 
        {
          Connection conexao = DriverManager.getConnection(url, "root","");

          PreparedStatement atualizar = conexao.prepareStatement(sql);

          atualizar.executeUpdate();

          JOptionPane.showMessageDialog(null,"Deletado com sucesso!");    
        }	  
        catch(Exception erro) { 
           JOptionPane.showMessageDialog(null,"Erro na Conexão com Banco de Dados : "+erro);               
        }
    }
}

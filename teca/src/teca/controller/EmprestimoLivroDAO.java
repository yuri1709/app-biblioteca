/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teca.controller;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import teca.model.EmprestimoLivro;

public class EmprestimoLivroDAO {
       String url = "jdbc:mysql://localhost/tecadb";
       String sql;
       
       public void inserir(EmprestimoLivro EML) {
           String sql = "INSERT INTO emp (emprestimo_id, matricula, registro) values ('"+EML.getEmprestimo_id()+"', '"+EML.getMatricula()+"','"+EML.getRegistro()+"')"; 
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
}

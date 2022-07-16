/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teca.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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
    String sql;
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
    public void inserirLivro(Livro LVR) {
        
        sql = "INSERT INTO livro (registro, CDD, codISBN, titulo, genero, autor, nEdicao, disponibilidade) VALUES ('"+RDM.registroLivro(1000)+"','"+CDD.getCdd()+"','"+LVR.getCodISBN()+"', '"+LVR.getTitulo()+"', '"+CDD.getClasse()+"', '"+LVR.getAutor()+"', '"+LVR.getnEdicao()+"', '"+LVR.getDisponibilidade()+"')";  
        DB_DeleteAndInsert("Livro cadastrado com sucesso! =)", "Erro na conexão com o banco de Dados");    
    }
    
    
    
}

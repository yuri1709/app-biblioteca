/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teca.model;

import javax.swing.JOptionPane;

/**
 *
 * @author 36127512021.2
 */
public class Usuario {
    static public String login;
    static private String senha;
    static private Integer id_usuario;

    public Integer getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Integer id_usuario) {
        Usuario.id_usuario = id_usuario;
    }
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public void exibir() {
        JOptionPane.showMessageDialog(null,"Informações do usuário \n"+
                                                                       "------------------------------\n"+
                                                                       "ID : "+id_usuario+"\n"+
                                                                       "LOGIN  : "+login+"\n"+
                                                                       "------------------------------");
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teca.view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author 36127512021.2
 */
public class TelaCadastrarADM extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadastrarADM
     */
    public TelaCadastrarADM() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cadastrarsenha = new javax.swing.JPasswordField();
        cadastrarnome = new javax.swing.JTextField();
        cadastrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel1.setText("Tela - Cadastrar");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(110, 40, 150, 30);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("Nome:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 95, 50, 50);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setText("Senha:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 160, 50, 20);

        cadastrarsenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarsenhaActionPerformed(evt);
            }
        });
        getContentPane().add(cadastrarsenha);
        cadastrarsenha.setBounds(100, 160, 200, 20);

        cadastrarnome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarnomeActionPerformed(evt);
            }
        });
        getContentPane().add(cadastrarnome);
        cadastrarnome.setBounds(100, 110, 200, 20);

        cadastrar.setText("Cadastrar");
        cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(cadastrar);
        cadastrar.setBounds(130, 220, 80, 23);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadastrarsenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarsenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cadastrarsenhaActionPerformed

    private void cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarActionPerformed
        String loginDB = "";
        TelaLogin TLO = new TelaLogin(); 
        
        if ( (cadastrarnome.getText().equals("")) || (cadastrarsenha.getPassword().equals("")) ) {
             
             JOptionPane.showMessageDialog(null, "NÃO PODE HAVER CAMPOS EM BRANCO!!!!\n"+
                                                 "PREENCHA TODOS ELES !!!!");
        cadastrarnome.setText("");
        cadastrarsenha.setText("");
        
         TLO.setVisible(true);
        }
        //CONEXAO COM O BANCO
        else{
             
            String url = "jdbc:mysql://localhost/tecadb";
	    //VERIFICANDO LOGIN EXISTENTE
            String sql2 = "SELECT * FROM usuario WHERE login='"+cadastrarnome.getText()+"'";
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
       if(loginDB.equals(cadastrarnome.getText())){
            JOptionPane.showMessageDialog(null,"O nome inserido já foi cadastrado"); 
            
       }else {
            String sql = "INSERT INTO usuario (login,senha) values ('"+cadastrarnome.getText()+"','"+cadastrarsenha.getPassword()+"')";       
            
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
    }//GEN-LAST:event_cadastrarActionPerformed

    private void cadastrarnomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarnomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cadastrarnomeActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaCadastrarADM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastrarADM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastrarADM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastrarADM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastrarADM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastrar;
    private javax.swing.JTextField cadastrarnome;
    private javax.swing.JPasswordField cadastrarsenha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}

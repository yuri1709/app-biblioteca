/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teca.view.adm;

import javax.swing.JOptionPane;
import teca.controller.UsuarioDAO;
import teca.model.Usuario;
import teca.service.CriptografiaSH256;

/**
 *
 * @author 36127512021.2
 */
public class CadastrarADM extends javax.swing.JFrame {
UsuarioDAO USERDAO = new UsuarioDAO();
Usuario USER = new Usuario();
CriptografiaSH256 SH256 = new CriptografiaSH256();

    public CadastrarADM() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cadastrarsenha = new javax.swing.JPasswordField();
        cadastrarnome = new javax.swing.JTextField();
        cadastrar = new javax.swing.JButton();
        voltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 400));
        setPreferredSize(new java.awt.Dimension(400, 400));
        setSize(new java.awt.Dimension(400, 400));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel1.setText("Cadastrar - Administrador");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(100, 50, 240, 30);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("Usuário");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(70, 120, 50, 50);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setText("Senha:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(70, 200, 50, 30);

        cadastrarsenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarsenhaActionPerformed(evt);
            }
        });
        getContentPane().add(cadastrarsenha);
        cadastrarsenha.setBounds(140, 200, 200, 30);

        cadastrarnome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarnomeActionPerformed(evt);
            }
        });
        getContentPane().add(cadastrarnome);
        cadastrarnome.setBounds(140, 130, 200, 30);

        cadastrar.setText("Cadastrar");
        cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(cadastrar);
        cadastrar.setBounds(100, 270, 110, 30);

        voltar.setText("Voltar");
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });
        getContentPane().add(voltar);
        voltar.setBounds(220, 270, 90, 30);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cadastrarsenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarsenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cadastrarsenhaActionPerformed

    private void cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarActionPerformed
                 
        if ( (cadastrarnome.getText().equals("")) || (cadastrarsenha.getText().equals("")) ) {
             
             JOptionPane.showMessageDialog(null, "NÃO PODE HAVER CAMPOS EM BRANCO!!!!\n"+
                                                 "PREENCHA TODOS ELES !!!!");
        System.out.println("SENHA:" + cadastrarsenha.getText());
        cadastrarnome.setText("");
        cadastrarsenha.setText("");
        
         setVisible(true);
        }
        else{
            USER.setLogin(cadastrarnome.getText());
            USER.setSenha(SH256.getSHA256(cadastrarsenha.getText()));            
            USERDAO.inserir(USER);
       }

    }//GEN-LAST:event_cadastrarActionPerformed

    private void cadastrarnomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarnomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cadastrarnomeActionPerformed

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
        dispose();
    }//GEN-LAST:event_voltarActionPerformed

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
            java.util.logging.Logger.getLogger(CadastrarADM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarADM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarADM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarADM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarADM().setVisible(true);
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
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables
}

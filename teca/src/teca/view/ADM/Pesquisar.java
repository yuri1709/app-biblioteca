/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teca.view.adm;

import javax.swing.JOptionPane;
import teca.controller.UsuarioDAO;
import teca.model.Usuario;

/**
 *
 * @author 36127512021.2
 */
public class Pesquisar extends javax.swing.JFrame {
    UsuarioDAO USERDAO = new UsuarioDAO();
    Usuario USER = new Usuario();
    
    public Pesquisar() {
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
        buscarUsuario = new javax.swing.JTextField();
        pesquisa = new javax.swing.JButton();
        voltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 400));
        setPreferredSize(new java.awt.Dimension(400, 400));
        setSize(new java.awt.Dimension(400, 400));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel1.setText("Exibir - Cadastro");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(110, 60, 180, 40);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("Usuário:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 150, 80, 50);

        buscarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(buscarUsuario);
        buscarUsuario.setBounds(120, 160, 240, 30);

        pesquisa.setText("Pesquisar");
        pesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisaActionPerformed(evt);
            }
        });
        getContentPane().add(pesquisa);
        pesquisa.setBounds(90, 250, 110, 30);

        voltar.setText("Voltar");
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });
        getContentPane().add(voltar);
        voltar.setBounds(210, 250, 90, 30);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
        dispose();
    }//GEN-LAST:event_voltarActionPerformed

    private void pesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisaActionPerformed
                              
        if ( (buscarUsuario.getText().equals("")) ) {
            
            JOptionPane.showMessageDialog(null, "NÃO PODE HAVER CAMPOS EM BRANCO!!!!\n"+
                                                "PREENCHA TODOS ELES !!!!");
            
           buscarUsuario.setText("");
           
        } else { 
            USER.setId_usuario(0);
            USER.setLogin(buscarUsuario.getText());
            USERDAO.selecionar(USER);
            //agora vamos chamar o método exibir da classe model Usuario
            if (USER.getId_usuario() == 0) {
                JOptionPane.showMessageDialog(null, "Usuário não encontrado!");
            } else {
                USER.exibir();
            }
        }
    }//GEN-LAST:event_pesquisaActionPerformed

    private void buscarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscarUsuarioActionPerformed

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
            java.util.logging.Logger.getLogger(Pesquisar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pesquisar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pesquisar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pesquisar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pesquisar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField buscarUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton pesquisa;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables
}

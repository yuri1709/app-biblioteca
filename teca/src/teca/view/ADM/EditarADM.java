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
public class EditarADM extends javax.swing.JFrame {
    UsuarioDAO USERDAO = new UsuarioDAO();
    Usuario USER = new Usuario();
    CriptografiaSH256 SH256 = new CriptografiaSH256();
    
    public EditarADM() {
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
        editarnome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        atualizar = new javax.swing.JButton();
        voltar = new javax.swing.JButton();
        editarsenha = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        editarantigonome = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 400));
        setSize(new java.awt.Dimension(400, 400));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel1.setText("Editar - Cadastro ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(110, 40, 210, 40);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("Novo Usuário:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 170, 100, 30);
        getContentPane().add(editarnome);
        editarnome.setBounds(140, 170, 210, 30);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setText("Nova Senha:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 210, 100, 60);

        atualizar.setText("Atualizar");
        atualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizarActionPerformed(evt);
            }
        });
        getContentPane().add(atualizar);
        atualizar.setBounds(90, 300, 90, 30);

        voltar.setText("Voltar");
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });
        getContentPane().add(voltar);
        voltar.setBounds(200, 300, 90, 30);
        getContentPane().add(editarsenha);
        editarsenha.setBounds(140, 230, 210, 30);

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setText("Antigo Usuário:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 110, 100, 30);

        editarantigonome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarantigonomeActionPerformed(evt);
            }
        });
        getContentPane().add(editarantigonome);
        editarantigonome.setBounds(140, 110, 210, 30);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void atualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizarActionPerformed
        if ( (editarnome.getText().equals("")) || (editarsenha.getPassword().equals("")) || (editarantigonome.getText().equals("")) ) {
            
            JOptionPane.showMessageDialog(null, "NÃO PODE HAVER CAMPOS EM BRANCO!!!!\n"+
                                                "PREENCHA TODOS ELES !!!!");
            
           editarnome.setText("");
           editarsenha.setText("");
          
            setVisible(true);
        
        }else{
             USER.setLogin(editarnome.getText());
             USER.setSenha(SH256.getSHA256(editarsenha.getText()));
             USERDAO.editar(USER, editarantigonome.getText());
        }
    }//GEN-LAST:event_atualizarActionPerformed

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
        dispose();
    }//GEN-LAST:event_voltarActionPerformed

    private void editarantigonomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarantigonomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editarantigonomeActionPerformed

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
            java.util.logging.Logger.getLogger(EditarADM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarADM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarADM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarADM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditarADM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atualizar;
    private javax.swing.JTextField editarantigonome;
    private javax.swing.JTextField editarnome;
    private javax.swing.JPasswordField editarsenha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables
}

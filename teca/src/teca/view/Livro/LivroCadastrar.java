/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package teca.view.Livro;

import java.text.DecimalFormat;
import teca.controller.LivroDAO;
import teca.model.Cdd;
import teca.model.Livro;
import teca.service.MySql;

/**
 *
 * @author Gamer
 */
public class LivroCadastrar extends javax.swing.JFrame {
 MySql SQL = new MySql();
 Cdd CDD = new Cdd();
 Livro LVR = new Livro(); 
 LivroDAO LDAO = new LivroDAO();
    /**
     * Creates new form LivroCadastrar
     */
    public LivroCadastrar() {
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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cddField = new javax.swing.JTextField();
        tituloField = new javax.swing.JTextField();
        edicaoField = new javax.swing.JTextField();
        codISBN_Field = new javax.swing.JTextField();
        generoField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        autorField = new javax.swing.JTextField();
        cadastrarButton = new javax.swing.JButton();
        limparButton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        quantidadeField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("Informe a localização do livro na biblioteca");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 300, 320, 50);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Código ISBN:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 220, 110, 30);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Estante:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 350, 110, 30);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("CDD:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(240, 260, 50, 30);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("Gênero:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 140, 70, 30);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("n Edição:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(30, 180, 80, 30);

        cddField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cddFieldActionPerformed(evt);
            }
        });
        getContentPane().add(cddField);
        cddField.setBounds(280, 260, 60, 30);

        tituloField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tituloFieldActionPerformed(evt);
            }
        });
        getContentPane().add(tituloField);
        tituloField.setBounds(80, 60, 260, 30);

        edicaoField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edicaoFieldActionPerformed(evt);
            }
        });
        getContentPane().add(edicaoField);
        edicaoField.setBounds(100, 180, 240, 30);

        codISBN_Field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codISBN_FieldActionPerformed(evt);
            }
        });
        getContentPane().add(codISBN_Field);
        codISBN_Field.setBounds(130, 220, 210, 30);

        generoField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generoFieldActionPerformed(evt);
            }
        });
        getContentPane().add(generoField);
        generoField.setBounds(100, 140, 240, 30);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setText("Autor:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(30, 100, 50, 30);

        autorField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                autorFieldActionPerformed(evt);
            }
        });
        getContentPane().add(autorField);
        autorField.setBounds(80, 100, 260, 30);

        cadastrarButton.setText("Cadastrar");
        cadastrarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarButtonActionPerformed(evt);
            }
        });
        getContentPane().add(cadastrarButton);
        cadastrarButton.setBounds(60, 470, 250, 40);

        limparButton.setText("Limpar");
        limparButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparButtonActionPerformed(evt);
            }
        });
        getContentPane().add(limparButton);
        limparButton.setBounds(60, 420, 250, 40);

        jLabel8.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel8.setText("Cadastro Livro");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(120, 0, 190, 50);

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setText("Título:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(30, 60, 50, 30);

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setText("Pratileira: ");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(190, 350, 110, 30);

        jLabel11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel11.setText("Quantidade");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(30, 260, 120, 30);

        quantidadeField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantidadeFieldActionPerformed(evt);
            }
        });
        getContentPane().add(quantidadeField);
        quantidadeField.setBounds(120, 260, 60, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cddFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cddFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cddFieldActionPerformed

    private void tituloFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tituloFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tituloFieldActionPerformed

    private void edicaoFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edicaoFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edicaoFieldActionPerformed

    private void codISBN_FieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codISBN_FieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codISBN_FieldActionPerformed

    private void autorFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_autorFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_autorFieldActionPerformed

    private void cadastrarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarButtonActionPerformed
        
        LVR.setTitulo(tituloField.getText()); 
        LVR.setAutor(autorField.getText());
        LVR.setnEdicao(Integer.parseInt(edicaoField.getText()));
        LVR.setCodISBN(Integer.parseInt(codISBN_Field.getText()));
        LVR.setDisponibilidade(Integer.parseInt(quantidadeField.getText()));                         
        LDAO.inserir(LVR);     
       
    }//GEN-LAST:event_cadastrarButtonActionPerformed

    private void limparButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparButtonActionPerformed
         tituloField.setText("");
        autorField.setText("");
        generoField.setText("");
        edicaoField.setText("");
        codISBN_Field.setText("");              
        cddField.setText("");
        quantidadeField.setText("");
    }//GEN-LAST:event_limparButtonActionPerformed

    private void quantidadeFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantidadeFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantidadeFieldActionPerformed

    private void generoFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generoFieldActionPerformed
      
    // TODO add your handling code here:
        
        SQL.selecionarCDD(generoField.getText());//chamada para buscar o cdd corrrespondente ao valor digitado no campo genero
        generoField.setText(CDD.getClasse());      //auto completa com dados da classe cdd do banc oque o usuario quer escrever 
        cddField.setText(Float.toString(CDD.getCdd()));//escreve o número do cdd no campo de texto   
        
       
    }//GEN-LAST:event_generoFieldActionPerformed

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
            java.util.logging.Logger.getLogger(LivroCadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LivroCadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LivroCadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LivroCadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LivroCadastrar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField autorField;
    private javax.swing.JButton cadastrarButton;
    private javax.swing.JTextField cddField;
    private javax.swing.JTextField codISBN_Field;
    private javax.swing.JTextField edicaoField;
    private javax.swing.JTextField generoField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton limparButton;
    private javax.swing.JTextField quantidadeField;
    private javax.swing.JTextField tituloField;
    // End of variables declaration//GEN-END:variables
}

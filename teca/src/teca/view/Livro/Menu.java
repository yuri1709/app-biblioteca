/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package teca.view.Livro;

import teca.model.Livro;
import teca.service.MySql;
import teca.view.ADM.TelaCadastrarADM;

/**
 *
 * @author Gamer
 */
public class Menu extends javax.swing.JFrame {
     MySql SQL = new MySql();
     Livro LVR = new Livro();
    /**
     * Creates new form Menu
     */
    public Menu() {
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
        excluirButton = new javax.swing.JButton();
        cadastraButton = new javax.swing.JButton();
        PesquisarLivroButton = new javax.swing.JButton();
        editaButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        disponiField = new javax.swing.JTextField();
        tituloField = new javax.swing.JTextField();
        edicaoField = new javax.swing.JTextField();
        codISBN_Field = new javax.swing.JTextField();
        generoField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        autorField = new javax.swing.JTextField();
        pesquisarLivroField = new javax.swing.JTextField();
        voltarButton = new javax.swing.JButton();
        emprestaButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(60000, 60000));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel1.setText("Painel Livro");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(160, 0, 130, 50);

        excluirButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        excluirButton.setText("Excluir");
        excluirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirButtonActionPerformed(evt);
            }
        });
        getContentPane().add(excluirButton);
        excluirButton.setBounds(390, 290, 100, 30);

        cadastraButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cadastraButton.setText("Cadastrar");
        cadastraButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastraButtonActionPerformed(evt);
            }
        });
        getContentPane().add(cadastraButton);
        cadastraButton.setBounds(390, 140, 100, 30);

        PesquisarLivroButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        PesquisarLivroButton.setText("Pesquisar");
        PesquisarLivroButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        PesquisarLivroButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PesquisarLivroButtonActionPerformed(evt);
            }
        });
        getContentPane().add(PesquisarLivroButton);
        PesquisarLivroButton.setBounds(20, 50, 100, 30);

        editaButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        editaButton.setText("Editar");
        editaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editaButtonActionPerformed(evt);
            }
        });
        getContentPane().add(editaButton);
        editaButton.setBounds(390, 240, 100, 30);

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Código ISBN:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 210, 110, 30);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Título:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 40, 50, 30);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Disponibilidade:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(20, 250, 120, 30);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("Gênero:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(20, 130, 70, 30);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("n Edição:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(20, 170, 80, 30);

        disponiField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                disponiFieldActionPerformed(evt);
            }
        });
        jPanel1.add(disponiField);
        disponiField.setBounds(140, 250, 50, 30);

        tituloField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tituloFieldActionPerformed(evt);
            }
        });
        jPanel1.add(tituloField);
        tituloField.setBounds(70, 40, 150, 30);

        edicaoField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edicaoFieldActionPerformed(evt);
            }
        });
        jPanel1.add(edicaoField);
        edicaoField.setBounds(90, 170, 150, 30);

        codISBN_Field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codISBN_FieldActionPerformed(evt);
            }
        });
        jPanel1.add(codISBN_Field);
        codISBN_Field.setBounds(120, 210, 150, 30);

        generoField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generoFieldActionPerformed(evt);
            }
        });
        jPanel1.add(generoField);
        generoField.setBounds(90, 130, 150, 30);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setText("Autor:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(20, 90, 50, 30);

        autorField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                autorFieldActionPerformed(evt);
            }
        });
        jPanel1.add(autorField);
        autorField.setBounds(70, 90, 150, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(20, 90, 340, 320);

        pesquisarLivroField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisarLivroFieldActionPerformed(evt);
            }
        });
        getContentPane().add(pesquisarLivroField);
        pesquisarLivroField.setBounds(120, 50, 240, 30);

        voltarButton.setText("voltar");
        getContentPane().add(voltarButton);
        voltarButton.setBounds(450, 10, 73, 23);

        emprestaButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        emprestaButton.setText("Emprestar");
        emprestaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emprestaButtonActionPerformed(evt);
            }
        });
        getContentPane().add(emprestaButton);
        emprestaButton.setBounds(390, 190, 100, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void excluirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirButtonActionPerformed
        LVR.setCodISBN(Integer.parseInt(codISBN_Field.getText()));
        SQL.excluir("livros","codISBN",LVR.getCodISBN());
    }//GEN-LAST:event_excluirButtonActionPerformed

    private void cadastraButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastraButtonActionPerformed
       LVR.setTitulo(tituloField.getText());
       LVR.setAutor(autorField.getText());
       LVR.setGenero(generoField.getText());
       LVR.setnEdicao(Integer.parseInt(edicaoField.getText()));
       LVR.setCodISBN(Integer.parseInt(codISBN_Field.getText()));
       LVR.setDisponibilidade(Integer.parseInt(disponiField.getText()));
        
       SQL.inserirLivro("livro", LVR.getCodISBN(), LVR.getTitulo(), LVR.getGenero(), LVR.getAutor(), LVR.getnEdicao(), LVR.getDisponibilidade());       
       //TelaCadastrarADM TC = new TelaCadastrarADM();
       //TC.setVisible(true);
    }//GEN-LAST:event_cadastraButtonActionPerformed

    private void PesquisarLivroButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PesquisarLivroButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PesquisarLivroButtonActionPerformed

    private void editaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editaButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editaButtonActionPerformed

    private void pesquisarLivroFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisarLivroFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pesquisarLivroFieldActionPerformed

    private void disponiFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_disponiFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_disponiFieldActionPerformed

    private void tituloFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tituloFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tituloFieldActionPerformed

    private void edicaoFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edicaoFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edicaoFieldActionPerformed

    private void codISBN_FieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codISBN_FieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codISBN_FieldActionPerformed

    private void generoFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generoFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_generoFieldActionPerformed

    private void emprestaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emprestaButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emprestaButtonActionPerformed

    private void autorFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_autorFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_autorFieldActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton PesquisarLivroButton;
    private javax.swing.JTextField autorField;
    private javax.swing.JButton cadastraButton;
    private javax.swing.JTextField codISBN_Field;
    private javax.swing.JTextField disponiField;
    private javax.swing.JTextField edicaoField;
    private javax.swing.JButton editaButton;
    private javax.swing.JButton emprestaButton;
    private javax.swing.JButton excluirButton;
    private javax.swing.JTextField generoField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField pesquisarLivroField;
    private javax.swing.JTextField tituloField;
    private javax.swing.JButton voltarButton;
    // End of variables declaration//GEN-END:variables
}

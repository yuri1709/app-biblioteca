/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package teca.view.Livro;

import java.net.URL;
import javax.swing.JOptionPane;
import teca.controller.EmprestimoLivroDAO;
import teca.controller.LivroDAO;
import teca.controller.clienteDAO;
import teca.model.Cdd;
import teca.model.Cliente;
import teca.model.EmprestimoLivro;
import teca.model.Livro;
import teca.service.MySql;

/**
 *
 * @author Gamer
 */
public class LivroEmprestar extends javax.swing.JFrame {
     clienteDAO CLDAO = new clienteDAO();
     Cliente CL = new Cliente();
     Livro LVR = new Livro(); 
     LivroDAO LDAO = new LivroDAO();       
     EmprestimoLivroDAO ELDAO = new EmprestimoLivroDAO();
     EmprestimoLivro EL = new EmprestimoLivro();
     MySql SQL = new MySql();
     Cdd CDD = new Cdd();
  
    public LivroEmprestar() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cpfField = new javax.swing.JTextField();
        checkin = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        emprestarButton = new javax.swing.JButton();
        pesquisarButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        disponibilidade = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        autor = new javax.swing.JLabel();
        autor1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        disponibilidadeField = new javax.swing.JTextField();
        generoLabel = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        autorLabel = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        tituloLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(450, 520));
        setPreferredSize(new java.awt.Dimension(450, 500));
        setSize(new java.awt.Dimension(450, 500));
        getContentPane().setLayout(null);

        jLabel8.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel8.setText("Emprestar Livro");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(130, 0, 190, 50);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setText("Informar o livro que será emprestado");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 180, 211, 40);
        getContentPane().add(cpfField);
        cpfField.setBounds(50, 110, 150, 30);

        checkin.setText("Check in");
        checkin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkinActionPerformed(evt);
            }
        });
        getContentPane().add(checkin);
        checkin.setBounds(200, 110, 100, 30);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setText("Informe o cpf do cliente:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 60, 190, 40);

        emprestarButton.setText("Emprestar");
        emprestarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emprestarButtonActionPerformed(evt);
            }
        });
        getContentPane().add(emprestarButton);
        emprestarButton.setBounds(170, 440, 100, 30);

        pesquisarButton.setToolTipText("");
        pesquisarButton.setMaximumSize(new java.awt.Dimension(150, 150));
        pesquisarButton.setMinimumSize(new java.awt.Dimension(150, 150));
        pesquisarButton.setPreferredSize(new java.awt.Dimension(200, 159));
        pesquisarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisarButtonActionPerformed(evt);
            }
        });
        getContentPane().add(pesquisarButton);
        pesquisarButton.setBounds(230, 180, 30, 30);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        disponibilidade.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        disponibilidade.setText("Disponibilidade");
        jPanel2.add(disponibilidade);
        disponibilidade.setBounds(10, 150, 110, 40);

        titulo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        titulo.setText("Título");
        jPanel2.add(titulo);
        titulo.setBounds(10, 0, 50, 40);

        autor.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        autor.setText("Gênero");
        jPanel2.add(autor);
        autor.setBounds(10, 100, 50, 40);

        autor1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        autor1.setText("Autor");
        jPanel2.add(autor1);
        autor1.setBounds(10, 50, 50, 40);

        jSeparator2.setBackground(new java.awt.Color(153, 102, 255));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel2.add(jSeparator2);
        jSeparator2.setBounds(330, 0, 30, 200);

        jSeparator5.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator5);
        jSeparator5.setBounds(60, 130, 220, 30);

        disponibilidadeField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                disponibilidadeFieldActionPerformed(evt);
            }
        });
        jPanel2.add(disponibilidadeField);
        disponibilidadeField.setBounds(100, 160, 60, 30);

        generoLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel2.add(generoLabel);
        generoLabel.setBounds(60, 110, 230, 30);

        jSeparator6.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator6);
        jSeparator6.setBounds(60, 80, 220, 30);

        autorLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel2.add(autorLabel);
        autorLabel.setBounds(60, 60, 230, 30);

        jSeparator7.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator7);
        jSeparator7.setBounds(60, 30, 220, 30);

        tituloLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel2.add(tituloLabel);
        tituloLabel.setBounds(60, 10, 230, 30);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(10, 220, 410, 200);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setText("CPF:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 100, 50, 40);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void pesquisarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisarButtonActionPerformed
        // TODO add your handling code here:
       Boolean mostrarTodosLivros = false;
       String tituloDoLivro = JOptionPane.showInputDialog("PROCURAR LIVRO :"); 
       LVR.setDisponibilidade(0);
       LDAO.selecionar(LVR, tituloDoLivro, mostrarTodosLivros );//Chamando select * pra pegar todas as informações do livro.(LivroDAO) agora o a classe Livro têm todos atributos preenchidos de acordo com o id.
       
       //Preencher os campos com os dados do livro pesquisado
       tituloLabel.setText(LVR.getTitulo());
       autorLabel.setText(LVR.getAutor());
       generoLabel.setText(LVR.getGenero());
       disponibilidadeField.setText(String.valueOf(LVR.getDisponibilidade()));
              
    }//GEN-LAST:event_pesquisarButtonActionPerformed

    private void disponibilidadeFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_disponibilidadeFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_disponibilidadeFieldActionPerformed

    private void checkinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkinActionPerformed
        // TODO add your handling code here:
        CL.setCpf(cpfField.getText());
        CLDAO.selecionar(CL);
        CL.exibirCliente();
        
       
        
    }//GEN-LAST:event_checkinActionPerformed

    private void emprestarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emprestarButtonActionPerformed
        //o empresta é o adicionar no banco de emprestimoLivro
        
        EL.setMatricula(CL.getMatricula());//Pega a matricula do model Cliente
        EL.setRegistro(LVR.getRegistro());//Pega o registro do model Livro
        
        if(LVR.getDisponibilidade() > 0) {
            ELDAO.inserir(EL);
            LVR.setEmprestado("E"); 
            LDAO.adicionarEmprestimo(LVR);
        } else {
            JOptionPane.showMessageDialog(null, "Todas as unidades já se esgotaram");
        }
        
    }//GEN-LAST:event_emprestarButtonActionPerformed

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
            java.util.logging.Logger.getLogger(LivroEmprestar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LivroEmprestar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LivroEmprestar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LivroEmprestar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LivroEmprestar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel autor;
    private javax.swing.JLabel autor1;
    private javax.swing.JLabel autorLabel;
    private javax.swing.JButton checkin;
    private javax.swing.JTextField cpfField;
    private javax.swing.JLabel disponibilidade;
    private javax.swing.JTextField disponibilidadeField;
    private javax.swing.JButton emprestarButton;
    private javax.swing.JLabel generoLabel;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JButton pesquisarButton;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel tituloLabel;
    // End of variables declaration//GEN-END:variables
}

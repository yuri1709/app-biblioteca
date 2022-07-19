/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teca.view.cliente;


import javax.swing.JOptionPane;
import teca.controller.clienteDAO;
import teca.model.Cliente;


public class Pesquisar extends javax.swing.JFrame {
    clienteDAO CLDAO = new clienteDAO();
    Cliente CL = new Cliente();
   
    public Pesquisar() {
        initComponents();
    }
     
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pesquisarcpf = new javax.swing.JTextField();
        pesquisar = new javax.swing.JButton();
        voltar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        id2 = new javax.swing.JLabel();
        id1 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        id3 = new javax.swing.JLabel();
        id4 = new javax.swing.JLabel();
        livro1 = new javax.swing.JLabel();
        livro2 = new javax.swing.JLabel();
        livro3 = new javax.swing.JLabel();
        livro4 = new javax.swing.JLabel();

        jButton2.setText("jButton2");

        jSeparator4.setBackground(new java.awt.Color(102, 102, 102));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 400));
        setPreferredSize(new java.awt.Dimension(400, 400));
        setSize(new java.awt.Dimension(400, 400));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel1.setText("Pesquisar - cliente");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(100, 50, 200, 20);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("CPF:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 120, 40, 30);

        pesquisarcpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisarcpfActionPerformed(evt);
            }
        });
        getContentPane().add(pesquisarcpf);
        pesquisarcpf.setBounds(110, 120, 200, 30);

        pesquisar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        pesquisar.setText("Pesquisar");
        pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisarActionPerformed(evt);
            }
        });
        getContentPane().add(pesquisar);
        pesquisar.setBounds(90, 180, 90, 30);

        voltar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        voltar.setText("Voltar");
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });
        getContentPane().add(voltar);
        voltar.setBounds(200, 180, 90, 30);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setText("Livro");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(140, 20, 80, 14);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setText("ID");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(10, 20, 30, 14);

        jSeparator1.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(60, 0, 10, 180);

        jSeparator2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.add(jSeparator2);
        jSeparator2.setBounds(0, 160, 400, 10);

        jSeparator3.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.add(jSeparator3);
        jSeparator3.setBounds(0, 40, 400, 30);

        jSeparator5.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.add(jSeparator5);
        jSeparator5.setBounds(0, 100, 400, 30);

        jSeparator6.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.add(jSeparator6);
        jSeparator6.setBounds(0, 130, 400, 30);

        id2.setText("2");
        jPanel1.add(id2);
        id2.setBounds(10, 80, 6, 14);

        id1.setText("1");
        jPanel1.add(id1);
        id1.setBounds(10, 50, 6, 14);

        jSeparator7.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.add(jSeparator7);
        jSeparator7.setBounds(0, 70, 400, 30);

        id3.setText("3");
        jPanel1.add(id3);
        id3.setBounds(10, 110, 6, 14);

        id4.setText("4");
        jPanel1.add(id4);
        id4.setBounds(10, 140, 6, 14);

        livro1.setText("vazio");
        jPanel1.add(livro1);
        livro1.setBounds(70, 50, 25, 14);

        livro2.setText("vazio");
        jPanel1.add(livro2);
        livro2.setBounds(70, 80, 25, 14);

        livro3.setText("vazio");
        jPanel1.add(livro3);
        livro3.setBounds(70, 110, 25, 14);

        livro4.setText("vazio");
        jPanel1.add(livro4);
        livro4.setBounds(70, 140, 25, 14);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 220, 400, 180);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void pesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisarActionPerformed
                
        if ( (pesquisarcpf.getText().equals("")) ) {
             
             JOptionPane.showMessageDialog(null, "NÃO PODE HAVER CAMPOS EM BRANCO!!!!\n"+
                                                "PREENCHA TODOS ELES !!!!");
             
             pesquisarcpf.setText("");
           
        }else{
            CL.setCpf(pesquisarcpf.getText());
            CLDAO.selecionar(CL);
            CL.exibirCliente();
            CL.limparCache();
            
            //TABELA
            id1.setText(); livro1.setText(text);
            id2.setText(text); livro2.setText(text);
            id3.setText(text); livro3.setText(text);
            id4.setText(text); livro4.setText(text);
            
            
            
            
    }//GEN-LAST:event_pesquisarActionPerformed
  }
    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
              dispose();
    }//GEN-LAST:event_voltarActionPerformed

    private void pesquisarcpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisarcpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pesquisarcpfActionPerformed

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
    private javax.swing.JLabel id1;
    private javax.swing.JLabel id2;
    private javax.swing.JLabel id3;
    private javax.swing.JLabel id4;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JLabel livro1;
    private javax.swing.JLabel livro2;
    private javax.swing.JLabel livro3;
    private javax.swing.JLabel livro4;
    private javax.swing.JButton pesquisar;
    private javax.swing.JTextField pesquisarcpf;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables
}

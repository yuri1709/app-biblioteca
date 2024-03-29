package teca.view;


import teca.view.adm.CadastrarADM;
import javax.swing.JOptionPane;
import teca.controller.UsuarioDAO;
import teca.model.Usuario;
import teca.service.CriptografiaSH256;
import teca.view.MenuLoginGeral;
import teca.view.adm.EditarADM;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 36127512021.2
 */
public class TelaLoginADM extends javax.swing.JFrame {
    UsuarioDAO USERDAO = new UsuarioDAO();
    Usuario USER = new Usuario();
    CriptografiaSH256 SH256 = new CriptografiaSH256();
    
    String loginDB = "";
    String senhaDB = "";
    public TelaLoginADM() {
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
        Login = new javax.swing.JTextField();
        Senha = new javax.swing.JPasswordField();
        Logar = new javax.swing.JButton();
        recuperarSenha = new javax.swing.JButton();
        cadastrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 400));
        setSize(new java.awt.Dimension(400, 400));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel1.setText("Login - Administrador");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(110, 40, 190, 40);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("Usuário:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 120, 60, 50);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setText("Senha:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(50, 180, 50, 50);

        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });
        getContentPane().add(Login);
        Login.setBounds(130, 130, 200, 30);

        Senha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SenhaActionPerformed(evt);
            }
        });
        getContentPane().add(Senha);
        Senha.setBounds(130, 190, 200, 30);

        Logar.setText("Logar");
        Logar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogarActionPerformed(evt);
            }
        });
        getContentPane().add(Logar);
        Logar.setBounds(150, 250, 100, 30);

        recuperarSenha.setText("Recuperar a senha");
        recuperarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recuperarSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(recuperarSenha);
        recuperarSenha.setBounds(170, 310, 180, 40);

        cadastrar.setText("Cadastar");
        cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(cadastrar);
        cadastrar.setBounds(50, 310, 110, 40);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void LogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogarActionPerformed
       
      //MenuLogin ML = new MenuLogin();
      
      //Pegando dados inseridos do campo login e senha
      USER.setLogin(Login.getText());
      USER.setSenha(Senha.getText());
      USERDAO.selecionar(USER);
       
     
       
       
       
       if ( (Login.getText().equals(USER.getLogin())) && (SH256.getSHA256(Senha.getText()).equals(USER.getSenha()) ) ){

           //pegar o nome do usuario logado
            USER.setLogin(Login.getText()); 
           
            JOptionPane.showMessageDialog(null, "Acesso Permitido!\n"+
                                                "Você irá para a Tela de Menu Principal"); 
                        
              new MenuLoginGeral().setVisible(true);//preciso desse new MenuLogin().setVisible(true) para transferir o nome do login para a próxima tela.
                                                                                    
        }else{                                   
            JOptionPane.showMessageDialog(null, "Acesso Negado"); 
                                    
        }
    }//GEN-LAST:event_LogarActionPerformed

    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LoginActionPerformed

    private void SenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SenhaActionPerformed

    private void recuperarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recuperarSenhaActionPerformed
       EditarADM ED = new EditarADM();
        
       ED.setVisible(true);
    }//GEN-LAST:event_recuperarSenhaActionPerformed

    private void cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarActionPerformed
        //TelaCadastrarADM TCA = new TelaCadastrarADM();       
        //TCA.setVisible(true);
        new CadastrarADM().setVisible(true); /*não sei porque não consigo instanciar este Jframe quando está locaizando no mesmo package 
        do  JFrame TelaLoginADM(Este aqui no caso!)*/
        
    }//GEN-LAST:event_cadastrarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaLoginADM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLoginADM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLoginADM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLoginADM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLoginADM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Logar;
    private javax.swing.JTextField Login;
    private javax.swing.JPasswordField Senha;
    private javax.swing.JButton cadastrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton recuperarSenha;
    // End of variables declaration//GEN-END:variables
}

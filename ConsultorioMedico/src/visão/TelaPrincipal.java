/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visão;

/**
 *
 * @author Osmar
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
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

        jButtonAddConsulta = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBarTelaPrincipal = new javax.swing.JMenuBar();
        jMenuCadastro = new javax.swing.JMenu();
        jMenuItemCadEspecialidade = new javax.swing.JMenuItem();
        jMenuItemCadFuncionario = new javax.swing.JMenuItem();
        jMenuItemCadMedico = new javax.swing.JMenuItem();
        jMenuItemCadUsuario = new javax.swing.JMenuItem();
        jMenuAgenda = new javax.swing.JMenu();
        jMenuRelatorio = new javax.swing.JMenu();
        jMenuSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jButtonAddConsulta.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonAddConsulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/nova-consulta.png"))); // NOI18N
        jButtonAddConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddConsultaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAddConsulta);
        jButtonAddConsulta.setBounds(20, 20, 150, 60);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundotelaLogin.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 370, 230);

        jMenuCadastro.setText("Cadastros");

        jMenuItemCadEspecialidade.setText("Nova Especialidade");
        jMenuItemCadEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadEspecialidadeActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemCadEspecialidade);

        jMenuItemCadFuncionario.setText("Novo Funcionário");
        jMenuCadastro.add(jMenuItemCadFuncionario);

        jMenuItemCadMedico.setText("Novo Médico");
        jMenuCadastro.add(jMenuItemCadMedico);

        jMenuItemCadUsuario.setText("Novo Usuário");
        jMenuCadastro.add(jMenuItemCadUsuario);

        jMenuBarTelaPrincipal.add(jMenuCadastro);

        jMenuAgenda.setText("Agenda");
        jMenuBarTelaPrincipal.add(jMenuAgenda);

        jMenuRelatorio.setText("Relatório");
        jMenuBarTelaPrincipal.add(jMenuRelatorio);

        jMenuSair.setText("Sair");
        jMenuBarTelaPrincipal.add(jMenuSair);

        setJMenuBar(jMenuBarTelaPrincipal);

        setSize(new java.awt.Dimension(389, 286));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAddConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddConsultaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonAddConsultaActionPerformed

    private void jMenuItemCadEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadEspecialidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemCadEspecialidadeActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddConsulta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenuAgenda;
    private javax.swing.JMenuBar jMenuBarTelaPrincipal;
    private javax.swing.JMenu jMenuCadastro;
    private javax.swing.JMenuItem jMenuItemCadEspecialidade;
    private javax.swing.JMenuItem jMenuItemCadFuncionario;
    private javax.swing.JMenuItem jMenuItemCadMedico;
    private javax.swing.JMenuItem jMenuItemCadUsuario;
    private javax.swing.JMenu jMenuRelatorio;
    private javax.swing.JMenu jMenuSair;
    // End of variables declaration//GEN-END:variables
}

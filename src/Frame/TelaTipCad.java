/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Frame;

/**
 *
 * @author beatr
 */
public class TelaTipCad extends javax.swing.JFrame {

    /** Creates new form TelaTipCad */
    public TelaTipCad() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        EscCdt = new javax.swing.JPanel();
        btnProdutos = new javax.swing.JButton();
        btnCliente = new javax.swing.JButton();
        btnVoltar3 = new javax.swing.JButton();
        btnEmpresa1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Logo2.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tipo de Cadastro");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        EscCdt.setBackground(new java.awt.Color(255, 255, 255));
        EscCdt.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnProdutos.setBackground(new java.awt.Color(255, 229, 77));
        btnProdutos.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnProdutos.setText("Produtos");
        btnProdutos.setToolTipText("");
        btnProdutos.setActionCommand("");
        btnProdutos.setBorderPainted(false);
        btnProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProdutosActionPerformed(evt);
            }
        });
        EscCdt.add(btnProdutos, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 430, 210, 50));

        btnCliente.setBackground(new java.awt.Color(255, 229, 77));
        btnCliente.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnCliente.setText("Cliente");
        btnCliente.setToolTipText("");
        btnCliente.setActionCommand("");
        btnCliente.setBorderPainted(false);
        btnCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteActionPerformed(evt);
            }
        });
        EscCdt.add(btnCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 360, 210, 50));

        btnVoltar3.setBackground(new java.awt.Color(255, 229, 77));
        btnVoltar3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnVoltar3.setText("Voltar");
        btnVoltar3.setToolTipText("");
        btnVoltar3.setActionCommand("");
        btnVoltar3.setBorderPainted(false);
        btnVoltar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltar3ActionPerformed(evt);
            }
        });
        EscCdt.add(btnVoltar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 20));

        btnEmpresa1.setBackground(new java.awt.Color(255, 229, 77));
        btnEmpresa1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnEmpresa1.setText("Empresa");
        btnEmpresa1.setToolTipText("");
        btnEmpresa1.setActionCommand("");
        btnEmpresa1.setBorderPainted(false);
        btnEmpresa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpresa1ActionPerformed(evt);
            }
        });
        EscCdt.add(btnEmpresa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, 210, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Logo2.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        EscCdt.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-600, -110, -1, -1));

        getContentPane().add(EscCdt, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 530));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProdutosActionPerformed
        // TODO add your handling code here:
        TelaCadProd objeto3 = new TelaCadProd();
        objeto3.setVisible(true);
    }//GEN-LAST:event_btnProdutosActionPerformed

    private void btnClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteActionPerformed
        // TODO add your handling code here:
        MenuCliente objeto3 = new MenuCliente();
        objeto3.setVisible(true);
    }//GEN-LAST:event_btnClienteActionPerformed

    private void btnVoltar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltar3ActionPerformed
        // TODO add your handling code here:
        TelaLogin objeto4 = new TelaLogin();
        objeto4.setVisible(true);
        
    }//GEN-LAST:event_btnVoltar3ActionPerformed

    private void btnEmpresa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpresa1ActionPerformed
        // TODO add your handling code here:
        TelaCadEmp objeto8 = new TelaCadEmp();
        objeto8.setVisible(true);
    }//GEN-LAST:event_btnEmpresa1ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaTipCad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaTipCad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaTipCad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaTipCad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaTipCad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel EscCdt;
    private javax.swing.JButton btnCliente;
    private javax.swing.JButton btnEmpresa1;
    private javax.swing.JButton btnProdutos;
    private javax.swing.JButton btnVoltar3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables

}

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
public class TelaPesquisa extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadUsu
     */
    public TelaPesquisa() {
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

        jPanel1 = new javax.swing.JPanel();
        PesProdut = new javax.swing.JScrollPane();
        txtPesProdut = new javax.swing.JTextPane();
        Produto = new javax.swing.JTextField();
        Codigo = new javax.swing.JTextField();
        Marca = new javax.swing.JTextField();
        BarraProduto = new javax.swing.JTextField();
        BarraMarca = new javax.swing.JTextField();
        btnPesquisar = new java.awt.Button();
        Tabela = new javax.swing.JScrollPane();
        TabProd = new javax.swing.JTable();
        BarraCodigo = new javax.swing.JTextField();
        btnSair1 = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtPesProdut.setEditable(false);
        txtPesProdut.setBackground(new java.awt.Color(255, 229, 77));
        txtPesProdut.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        txtPesProdut.setText("          Pesquisa de produto ");
        PesProdut.setViewportView(txtPesProdut);

        jPanel1.add(PesProdut, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 330, 40));

        Produto.setEditable(false);
        Produto.setBackground(new java.awt.Color(255, 255, 255));
        Produto.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        Produto.setText("Produto:");
        Produto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(Produto, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 60, -1));

        Codigo.setEditable(false);
        Codigo.setBackground(new java.awt.Color(255, 255, 255));
        Codigo.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        Codigo.setText("Código:");
        Codigo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        Codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CodigoActionPerformed(evt);
            }
        });
        jPanel1.add(Codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 50, -1));

        Marca.setEditable(false);
        Marca.setBackground(new java.awt.Color(255, 255, 255));
        Marca.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        Marca.setText("Marca:");
        Marca.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        Marca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MarcaActionPerformed(evt);
            }
        });
        jPanel1.add(Marca, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 50, -1));

        BarraProduto.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(BarraProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 420, -1));

        BarraMarca.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(BarraMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 420, -1));

        btnPesquisar.setBackground(new java.awt.Color(255, 229, 77));
        btnPesquisar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnPesquisar.setLabel("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });
        jPanel1.add(btnPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 212, 120, 30));

        TabProd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        TabProd.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        TabProd.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Código", "Produto", "Marca", "Preço", "Endereço"
            }
        ));
        Tabela.setViewportView(TabProd);

        jPanel1.add(Tabela, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 620, 150));

        BarraCodigo.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(BarraCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 190, -1));

        btnSair1.setBackground(new java.awt.Color(255, 229, 77));
        btnSair1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnSair1.setLabel("Sair");
        btnSair1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSair1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnSair1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 440, 70, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 480));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MarcaActionPerformed

    private void CodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CodigoActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnSair1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSair1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSair1ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPesquisa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPesquisa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPesquisa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPesquisa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPesquisa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BarraCodigo;
    private javax.swing.JTextField BarraMarca;
    private javax.swing.JTextField BarraProduto;
    private javax.swing.JTextField Codigo;
    private javax.swing.JTextField Marca;
    private javax.swing.JScrollPane PesProdut;
    private javax.swing.JTextField Produto;
    private javax.swing.JTable TabProd;
    private javax.swing.JScrollPane Tabela;
    private java.awt.Button btnPesquisar;
    private java.awt.Button btnSair1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextPane txtPesProdut;
    // End of variables declaration//GEN-END:variables
}
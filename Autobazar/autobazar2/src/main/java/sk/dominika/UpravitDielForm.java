package sk.dominika;

import java.awt.Frame;
import java.math.BigDecimal;

public class UpravitDielForm extends javax.swing.JDialog {

    private DielDao dielDao = DaoFactory.INSTANCE.getDielDao();
    private Diel diel;

    public UpravitDielForm(Frame parent) {
        this(new Diel(), parent);
    }

    public UpravitDielForm(Diel diel, Frame parent) {
        this(parent, true);
        this.diel = diel;
        
        if(diel.getID() != -1) {
            cmbDruh.setSelectedItem(diel.getDruh());
            cmbPodkategoria.setSelectedItem(diel.getPodkategoria());
            txtCena.setText(diel.getCena().toString());
        }
    }

    public UpravitDielForm(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cmbDruh = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        txtCena = new javax.swing.JTextField();
        cmbPodkategoria = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        btnOk = new javax.swing.JButton();
        btnZrusit = new javax.swing.JButton();
        lblNazov = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Druh:");

        cmbDruh.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Airbagy", "Autosklá", "Auto na náhradné diely", "Brzdové sýstém", "Elektroinštalácie(káblovanie)", "Filtre", "Interiér", "Karoséria", "Motor", "Palivový systém", "Podvozok a nápravy", "Prevodovka", "Riadenie", "Spojky", "Súčasti motora", "Svetlá, zrkadlá", "Tlmiče", "Tuning", "Výfuk", "Zapaľovanie", "Iné" }));
        cmbDruh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbDruhActionPerformed(evt);
            }
        });

        jLabel3.setText("Cena:");

        txtCena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCenaActionPerformed(evt);
            }
        });

        cmbPodkategoria.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Osobné a úžitkové autá", "Nákladné autá", "Autobusy", "Motorky", "Návesy a prívesy", "Karavany a obytné autá", "Stroje", "Iné" }));

        jLabel2.setText("Podkategória:");

        btnOk.setText("OK");
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });

        btnZrusit.setText("Zrušiť");
        btnZrusit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZrusitActionPerformed(evt);
            }
        });

        lblNazov.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblNazov.setText("Autobazár");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(cmbDruh, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCena))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cmbPodkategoria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnZrusit, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnOk, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(21, 21, 21))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblNazov)
                .addGap(139, 139, 139))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblNazov)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbDruh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbPodkategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnOk)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnZrusit))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbDruhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDruhActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbDruhActionPerformed

    private void txtCenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCenaActionPerformed

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        diel.setDruh(cmbDruh.getSelectedItem().toString());
        diel.setPodkategoria(cmbPodkategoria.getSelectedItem().toString());
        diel.setCena(new BigDecimal(txtCena.getText()));
        
        dielDao.save(diel);

        dispose();
    }//GEN-LAST:event_btnOkActionPerformed

    private void btnZrusitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnZrusitActionPerformed
        dispose();
    }//GEN-LAST:event_btnZrusitActionPerformed

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
            java.util.logging.Logger.getLogger(UpravitDielForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpravitDielForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpravitDielForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpravitDielForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                UpravitDielForm dialog = new UpravitDielForm(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOk;
    private javax.swing.JButton btnZrusit;
    private javax.swing.JComboBox cmbDruh;
    private javax.swing.JComboBox cmbPodkategoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblNazov;
    private javax.swing.JTextField txtCena;
    // End of variables declaration//GEN-END:variables
}

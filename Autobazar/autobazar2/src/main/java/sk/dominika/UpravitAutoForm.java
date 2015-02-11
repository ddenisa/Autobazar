package sk.dominika;

import java.awt.Frame;
import java.math.BigDecimal;

public class UpravitAutoForm extends javax.swing.JDialog {

    private AutoDao autoDao = DaoFactory.INSTANCE.getAutoDao();
    private Auto auto;

    public UpravitAutoForm(Frame parent) {
        this(new Auto(), parent);
    }

    public UpravitAutoForm(Auto auto, Frame parent) {
        this(parent, true);
        this.auto = auto;

        if (auto.getID() != -1) {
            cmbZnacka.setSelectedItem(auto.getZnacka());
            txtModel.setText(auto.getModel());
            cmbPalivo.setSelectedItem(auto.getPalivo());
            Integer rok = auto.getRokVyroby();
            cmbRokVyroby.setSelectedItem(rok.toString());
            Integer najazdene = auto.getNajazdeneKm();
            txtNajazdeneKm.setText(najazdene.toString());
            Integer objem = auto.getObjemMotora();
            txtObjemMotora.setText(objem.toString());
            txtFarba.setText(auto.getFarba());
            txtCena.setText(auto.getCena().toString());

            chkAbs.setSelected(auto.isAbs());
            chkParkovaciaKamera.setSelected(auto.isParkovaciaKamera());
            chkAutoradio.setSelected(auto.isRadio());
            chkTempomat.setSelected(auto.isTempomat());
            chkKlimatizacia.setSelected(auto.isKlimatizacia());
            chkTazneZariadenie.setSelected(auto.isTazneZariadenie());
        }
    }

    public UpravitAutoForm(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNazov = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cmbRokVyroby = new javax.swing.JComboBox();
        cmbPalivo = new javax.swing.JComboBox();
        cmbZnacka = new javax.swing.JComboBox();
        txtModel = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtNajazdeneKm = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtObjemMotora = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtFarba = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtCena = new javax.swing.JTextField();
        btnOk = new javax.swing.JButton();
        chkTazneZariadenie = new javax.swing.JCheckBox();
        chkKlimatizacia = new javax.swing.JCheckBox();
        chkAutoradio = new javax.swing.JCheckBox();
        chkTempomat = new javax.swing.JCheckBox();
        chkParkovaciaKamera = new javax.swing.JCheckBox();
        chkAbs = new javax.swing.JCheckBox();
        btnZrusit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblNazov.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblNazov.setText("Autobazár");

        jLabel1.setText("Značka:");

        jLabel2.setText("Model:");

        jLabel3.setText("Palivo:");

        jLabel4.setText("Rok výroby:");

        cmbRokVyroby.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000" }));

        cmbPalivo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Benzín", "Diesel", "LPG + benzín", "CNG", "Hybrid", "Elektromotor" }));

        cmbZnacka.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Alfa Romeo", "Audi", "BMW", "Chevrolet", "Citroën", "Dacia", "Daewoo", "Fiat", "Ford", "Honda", "Hyundai", "Jaguar", "Jeep", "Kia", "Lada", "Lamborgini", "Land Rover", "Lexus", "Mazda", "Mercedes-Benz", "Mitsubishi", "Nissan", "Opel", "Peugeot", "Porsche", "Renault", "Seat", "Smart", "Subaru", "Suzuki", "Škoda", "Toyota", "Trabant", "Volkswagen", "Volvo" }));
        cmbZnacka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbZnackaActionPerformed(evt);
            }
        });

        jLabel5.setText("Najzdené km:");

        jLabel6.setText("Objem motora:");

        jLabel7.setText("Farba:");

        jLabel8.setText("Cena:");

        btnOk.setText("OK");
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });

        chkTazneZariadenie.setText("Ťažné zariadenie");

        chkKlimatizacia.setText("Klimatizácia");

        chkAutoradio.setText("Autorádio");

        chkTempomat.setText("Tempomat");

        chkParkovaciaKamera.setText("Parkovacia kamera");

        chkAbs.setText("ABS");

        btnZrusit.setText("Zrušiť");
        btnZrusit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZrusitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(lblNazov))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chkParkovaciaKamera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chkAbs, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtNajazdeneKm)
                            .addComponent(cmbZnacka, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addComponent(txtObjemMotora, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(jLabel6)
                            .addComponent(chkAutoradio)
                            .addComponent(chkTempomat)
                            .addComponent(txtModel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(chkTazneZariadenie)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                                .addComponent(btnZrusit, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(cmbPalivo, 0, 100, Short.MAX_VALUE)
                                        .addComponent(jLabel3)
                                        .addComponent(txtFarba))
                                    .addComponent(jLabel7)
                                    .addComponent(chkKlimatizacia))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel4)
                                            .addComponent(cmbRokVyroby, 0, 101, Short.MAX_VALUE)
                                            .addComponent(txtCena))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(btnOk, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNazov)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbZnacka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbPalivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbRokVyroby, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNajazdeneKm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtObjemMotora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFarba, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkAbs)
                    .addComponent(chkAutoradio)
                    .addComponent(chkKlimatizacia)
                    .addComponent(btnOk))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkParkovaciaKamera)
                    .addComponent(chkTempomat)
                    .addComponent(chkTazneZariadenie)
                    .addComponent(btnZrusit))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        auto.setZnacka(cmbZnacka.getSelectedItem().toString());
        auto.setModel(txtModel.getText());
        auto.setPalivo(cmbPalivo.getSelectedItem().toString());
        int rok = Integer.valueOf((String) cmbRokVyroby.getSelectedItem());
        auto.setRokVyroby(rok);
        auto.setNajazdeneKm(Integer.parseInt(txtNajazdeneKm.getText()));
        auto.setObjemMotora(Integer.parseInt(txtObjemMotora.getText()));
        auto.setFarba(txtFarba.getText());
        auto.setCena(new BigDecimal(txtCena.getText()));

        auto.setAbs(chkAbs.isSelected());
        auto.setParkovaciaKamera(chkParkovaciaKamera.isSelected());
        auto.setRadio(chkAutoradio.isSelected());
        auto.setTempomat(chkTempomat.isSelected());
        auto.setKlimatizacia(chkKlimatizacia.isSelected());
        auto.setTazneZariadenie(chkTazneZariadenie.isSelected());

        autoDao.save(auto);

        dispose();
    }//GEN-LAST:event_btnOkActionPerformed

    private void btnZrusitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnZrusitActionPerformed
        dispose();
    }//GEN-LAST:event_btnZrusitActionPerformed

    private void cmbZnackaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbZnackaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbZnackaActionPerformed

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
            java.util.logging.Logger.getLogger(UpravitAutoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpravitAutoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpravitAutoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpravitAutoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                UpravitAutoForm dialog = new UpravitAutoForm(new javax.swing.JFrame(), true);
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
    private javax.swing.JCheckBox chkAbs;
    private javax.swing.JCheckBox chkAutoradio;
    private javax.swing.JCheckBox chkKlimatizacia;
    private javax.swing.JCheckBox chkParkovaciaKamera;
    private javax.swing.JCheckBox chkTazneZariadenie;
    private javax.swing.JCheckBox chkTempomat;
    private javax.swing.JComboBox cmbPalivo;
    private javax.swing.JComboBox cmbRokVyroby;
    private javax.swing.JComboBox cmbZnacka;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lblNazov;
    private javax.swing.JTextField txtCena;
    private javax.swing.JTextField txtFarba;
    private javax.swing.JTextField txtModel;
    private javax.swing.JTextField txtNajazdeneKm;
    private javax.swing.JTextField txtObjemMotora;
    // End of variables declaration//GEN-END:variables
}

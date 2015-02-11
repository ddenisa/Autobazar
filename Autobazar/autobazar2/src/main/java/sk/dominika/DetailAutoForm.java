package sk.dominika;


public class DetailAutoForm extends javax.swing.JDialog {

    
    public DetailAutoForm(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    public DetailAutoForm(Auto auto, java.awt.Frame parent) {
        this(parent, true);
        
        lblZnackaModel.setText(auto.getZnacka() + " " + auto.getModel());
        lblPalivo.setText(auto.getPalivo());
        Integer rok = auto.getRokVyroby();
        lblRokVyroby.setText(rok.toString());
        Integer najazdene = auto.getNajazdeneKm();
        lblNajazdeneKm.setText(najazdene.toString());
        Integer objem = auto.getObjemMotora();
        lblObjemMotora.setText(objem.toString());
        lblFarba.setText(auto.getFarba());
        lblCena.setText(auto.getCena().toString() + " €");
    
        StringBuilder sb = new StringBuilder();
        String prefix = "";
        if(auto.isAbs()) {
            sb.append(prefix).append("ABS");
            prefix = ", ";
        }
        if(auto.isParkovaciaKamera()) {
            sb.append(prefix).append("Parkovacia kamera");
            prefix = ", ";
        }
        if(auto.isRadio()) {
            sb.append(prefix).append("Autoradio");
        }
        lblOstatne1.setText(sb.toString());
        
        sb = new StringBuilder();
        prefix = "";
        if(auto.isTempomat()) {
            sb.append(prefix).append("Tempomat");
            prefix = ", ";
        }
        if(auto.isKlimatizacia()) {
            sb.append(prefix).append("Klimatizacia");
            prefix = ", ";
        }
        if(auto.isAbs()) {
            sb.append(prefix).append("Ťažné zariadenie");
        }
        lblOstatne2.setText(sb.toString());
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNazov = new javax.swing.JLabel();
        lblZnackaModel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblOstatne1 = new javax.swing.JLabel();
        lblFarba = new javax.swing.JLabel();
        lblObjemMotora = new javax.swing.JLabel();
        lblNajazdeneKm = new javax.swing.JLabel();
        lblRokVyroby = new javax.swing.JLabel();
        lblPalivo = new javax.swing.JLabel();
        lblCena = new javax.swing.JLabel();
        btnZavrieť = new javax.swing.JButton();
        lblOstatne2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblNazov.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblNazov.setText("Autobazár");

        lblZnackaModel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblZnackaModel.setText("ZnackaModel");

        jLabel1.setText("Palivo:");

        jLabel2.setText("Rok výroby:");

        jLabel3.setText("Najazdené km:");

        jLabel4.setText("Objem motora:");

        jLabel5.setText("Farba:");

        lblOstatne1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblOstatne1.setText("Ostatne");

        lblFarba.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblFarba.setText("farba");
        lblFarba.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        lblObjemMotora.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblObjemMotora.setText("objem");
        lblObjemMotora.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        lblNajazdeneKm.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblNajazdeneKm.setText("km");
        lblNajazdeneKm.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        lblRokVyroby.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblRokVyroby.setText("rok");
        lblRokVyroby.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        lblPalivo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblPalivo.setText("palivo");
        lblPalivo.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        lblCena.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblCena.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblCena.setText("cena");

        btnZavrieť.setText("Zavrieť");
        btnZavrieť.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZavrieťActionPerformed(evt);
            }
        });

        lblOstatne2.setText("Ostatne");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblOstatne1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblCena)
                .addGap(73, 73, 73))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnZavrieť)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblZnackaModel)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNajazdeneKm)
                                    .addComponent(lblRokVyroby)
                                    .addComponent(lblPalivo)
                                    .addComponent(lblFarba)
                                    .addComponent(lblObjemMotora)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(lblNazov))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblOstatne2)))
                .addGap(122, 141, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNazov)
                .addGap(18, 18, 18)
                .addComponent(lblZnackaModel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblPalivo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblRokVyroby))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblNajazdeneKm))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblObjemMotora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFarba)
                    .addComponent(jLabel5))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOstatne1)
                    .addComponent(lblCena))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblOstatne2)
                .addGap(11, 11, 11)
                .addComponent(btnZavrieť)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnZavrieťActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnZavrieťActionPerformed
        dispose();
    }//GEN-LAST:event_btnZavrieťActionPerformed

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
            java.util.logging.Logger.getLogger(DetailAutoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DetailAutoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DetailAutoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DetailAutoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DetailAutoForm dialog = new DetailAutoForm(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnZavrieť;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblCena;
    private javax.swing.JLabel lblFarba;
    private javax.swing.JLabel lblNajazdeneKm;
    private javax.swing.JLabel lblNazov;
    private javax.swing.JLabel lblObjemMotora;
    private javax.swing.JLabel lblOstatne1;
    private javax.swing.JLabel lblOstatne2;
    private javax.swing.JLabel lblPalivo;
    private javax.swing.JLabel lblRokVyroby;
    private javax.swing.JLabel lblZnackaModel;
    // End of variables declaration//GEN-END:variables
}

package sk.dominika;

import javax.swing.JOptionPane;

public class HlavnyFormularForm extends javax.swing.JFrame {

    private DielDao dielDao = DaoFactory.INSTANCE.getDielDao();
    private AutoDao autoDao = DaoFactory.INSTANCE.getAutoDao();
    private MotorkaDao motorkaDao = DaoFactory.INSTANCE.getMotorkaDao();
    private AutobusDao autobusDao=DaoFactory.INSTANCE.getAutobusDao();
    
    private AutoTableModel autoTableModel = new AutoTableModel();
    private DielTableModel dielTableModel = new DielTableModel();
    private MotorkaTableModel motorkaTableModel = new MotorkaTableModel();
    private AutobusTableModel autobusTableModel = new AutobusTableModel();
    
    private boolean jeKosik = false;

    public HlavnyFormularForm() {
        initComponents();
        tabAuta.setModel(autoTableModel);
        tabDiely.setModel(dielTableModel);
        tabMotorky.setModel(motorkaTableModel);
        tabAutobusy.setModel(autobusTableModel);
        aktualizujZoznamAut();
        aktualizujZoznamDielov();
        aktualizujZoznamMotoriek();
        aktualizujZoznamAutobusov();
    }

    private void aktualizujZoznamAut() {
        autoTableModel.obnov();
    }
    
    private void aktualizujZoznamDielov() {
        dielTableModel.obnov();
    }

    private void aktualizujZoznamMotoriek() {
        motorkaTableModel.obnov();
    }
    
     private void aktualizujZoznamAutobusov() {
        autobusTableModel.obnov();
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lblNazov = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jAuta = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabAuta = new javax.swing.JTable();
        btnOdobrat = new javax.swing.JButton();
        btnUpravit = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnZavriet = new javax.swing.JButton();
        btnDetaily = new javax.swing.JButton();
        btnPridat = new javax.swing.JButton();
        btnKosik = new javax.swing.JButton();
        jMotorky = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabMotorky = new javax.swing.JTable();
        btnOdstranitMotorku = new javax.swing.JButton();
        btnUpravitMotorku = new javax.swing.JButton();
        btnHladatMotorku = new javax.swing.JButton();
        btnZavrietMotorku = new javax.swing.JButton();
        btnDetailyMotorka = new javax.swing.JButton();
        btnPridatMotorku = new javax.swing.JButton();
        btnNakupnyKosikMotorky = new javax.swing.JButton();
        jNahradneDiely = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabDiely = new javax.swing.JTable();
        btnPridatDiel = new javax.swing.JButton();
        btnOdstranitDiel = new javax.swing.JButton();
        btnUpravitDiel = new javax.swing.JButton();
        btnHladatDiel = new javax.swing.JButton();
        btnZavrietDiel = new javax.swing.JButton();
        jAutobus = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tabAutobusy = new javax.swing.JTable();
        btnPridatAutobus = new javax.swing.JButton();
        btnOdstranitAutobus = new javax.swing.JButton();
        btnUpravitAutobus = new javax.swing.JButton();
        btnHladatAutobus = new javax.swing.JButton();
        btnZavrietAutobus = new javax.swing.JButton();
        btnNakupnyKosikAUtobus = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblNazov.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblNazov.setText("Autobazár");

        tabAuta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(tabAuta);

        btnOdobrat.setText("Odstrániť");
        btnOdobrat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOdobratActionPerformed(evt);
            }
        });

        btnUpravit.setText("Upraviť...");
        btnUpravit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpravitActionPerformed(evt);
            }
        });

        jButton1.setText("Hľadať...");

        btnZavriet.setText("Zavrieť");
        btnZavriet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZavrietActionPerformed(evt);
            }
        });

        btnDetaily.setText("Detaily...");
        btnDetaily.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetailyActionPerformed(evt);
            }
        });

        btnPridat.setText("Pridať...");
        btnPridat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPridatActionPerformed(evt);
            }
        });

        btnKosik.setText("Do kosika");
        btnKosik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKosikActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jAutaLayout = new javax.swing.GroupLayout(jAuta);
        jAuta.setLayout(jAutaLayout);
        jAutaLayout.setHorizontalGroup(
            jAutaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jAutaLayout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jAutaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnZavriet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDetaily, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUpravit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPridat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnOdobrat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnKosik, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jAutaLayout.setVerticalGroup(
            jAutaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jAutaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnPridat)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnOdobrat)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUpravit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(btnKosik)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDetaily)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnZavriet)
                .addContainerGap())
            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("          Autá           ", jAuta);

        tabMotorky.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(tabMotorky);

        btnOdstranitMotorku.setText("Odstrániť");
        btnOdstranitMotorku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOdstranitMotorkuActionPerformed(evt);
            }
        });

        btnUpravitMotorku.setText("Upraviť...");
        btnUpravitMotorku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpravitMotorkuActionPerformed(evt);
            }
        });

        btnHladatMotorku.setText("Hľadať...");

        btnZavrietMotorku.setText("Zavrieť");
        btnZavrietMotorku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZavrietMotorkuActionPerformed(evt);
            }
        });

        btnDetailyMotorka.setText("Detaily...");

        btnPridatMotorku.setText("Pridať...");
        btnPridatMotorku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPridatMotorkuActionPerformed(evt);
            }
        });

        btnNakupnyKosikMotorky.setText("Do kosika");
        btnNakupnyKosikMotorky.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNakupnyKosikMotorkyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jMotorkyLayout = new javax.swing.GroupLayout(jMotorky);
        jMotorky.setLayout(jMotorkyLayout);
        jMotorkyLayout.setHorizontalGroup(
            jMotorkyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jMotorkyLayout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jMotorkyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnUpravitMotorku, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnHladatMotorku, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnOdstranitMotorku, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnZavrietMotorku, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDetailyMotorka, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPridatMotorku, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNakupnyKosikMotorky, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 30, Short.MAX_VALUE))
        );
        jMotorkyLayout.setVerticalGroup(
            jMotorkyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jMotorkyLayout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
            .addGroup(jMotorkyLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnPridatMotorku)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnOdstranitMotorku)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUpravitMotorku)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnHladatMotorku)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnNakupnyKosikMotorky)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDetailyMotorka)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnZavrietMotorku)
                .addContainerGap())
        );

        jTabbedPane1.addTab("        Motorky       ", jMotorky);

        tabDiely.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tabDiely);

        btnPridatDiel.setText("Pridať...");
        btnPridatDiel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPridatDielActionPerformed(evt);
            }
        });

        btnOdstranitDiel.setText("Odstrániť");
        btnOdstranitDiel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOdstranitDielActionPerformed(evt);
            }
        });

        btnUpravitDiel.setText("Upraviť...");
        btnUpravitDiel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpravitDielActionPerformed(evt);
            }
        });

        btnHladatDiel.setText("Hľadať...");

        btnZavrietDiel.setText("Zavrieť");
        btnZavrietDiel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZavrietDielActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jNahradneDielyLayout = new javax.swing.GroupLayout(jNahradneDiely);
        jNahradneDiely.setLayout(jNahradneDielyLayout);
        jNahradneDielyLayout.setHorizontalGroup(
            jNahradneDielyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jNahradneDielyLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jNahradneDielyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnPridatDiel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnOdstranitDiel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUpravitDiel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnHladatDiel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnZavrietDiel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 30, Short.MAX_VALUE))
        );
        jNahradneDielyLayout.setVerticalGroup(
            jNahradneDielyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(jNahradneDielyLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnPridatDiel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnOdstranitDiel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUpravitDiel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnHladatDiel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addComponent(btnZavrietDiel)
                .addContainerGap())
        );

        jTabbedPane1.addTab("  Náhradné diely  ", jNahradneDiely);

        tabAutobusy.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane5.setViewportView(tabAutobusy);

        btnPridatAutobus.setText("Pridať...");
        btnPridatAutobus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPridatAutobusActionPerformed(evt);
            }
        });

        btnOdstranitAutobus.setText("Odstrániť");
        btnOdstranitAutobus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOdstranitAutobusActionPerformed(evt);
            }
        });

        btnUpravitAutobus.setText("Upraviť...");
        btnUpravitAutobus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpravitAutobusActionPerformed(evt);
            }
        });

        btnHladatAutobus.setText("Hľadať...");

        btnZavrietAutobus.setText("Zavrieť");
        btnZavrietAutobus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZavrietAutobusActionPerformed(evt);
            }
        });

        btnNakupnyKosikAUtobus.setText("Do kosika");
        btnNakupnyKosikAUtobus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNakupnyKosikAUtobusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jAutobusLayout = new javax.swing.GroupLayout(jAutobus);
        jAutobus.setLayout(jAutobusLayout);
        jAutobusLayout.setHorizontalGroup(
            jAutobusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jAutobusLayout.createSequentialGroup()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jAutobusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnPridatAutobus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnOdstranitAutobus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUpravitAutobus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnHladatAutobus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnZavrietAutobus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNakupnyKosikAUtobus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 30, Short.MAX_VALUE))
        );
        jAutobusLayout.setVerticalGroup(
            jAutobusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(jAutobusLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnPridatAutobus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnOdstranitAutobus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUpravitAutobus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnHladatAutobus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(btnNakupnyKosikAUtobus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnZavrietAutobus)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Autobus", jAutobus);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblNazov)
                .addGap(232, 232, 232))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblNazov)
                .addGap(29, 29, 29)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPridatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPridatActionPerformed
        UpravitAutoForm upravitAutoForm = new UpravitAutoForm(this);
        upravitAutoForm.setVisible(true);

        aktualizujZoznamAut();
    }//GEN-LAST:event_btnPridatActionPerformed

    private void btnDetailyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetailyActionPerformed
        int vybranyRiadok = tabAuta.getSelectedRow();
        //int indexVModeli = tabAuta.convertRowIndexToModel(vybranyRiadok);
        if (vybranyRiadok == -1) {
            return;
        }

        Auto vybraneAuto = autoTableModel.dajPodlaCislaRiadku(vybranyRiadok);

        DetailAutoForm autoDetailForm = new DetailAutoForm(vybraneAuto, this);
        autoDetailForm.setVisible(true);
    }//GEN-LAST:event_btnDetailyActionPerformed

    private void btnZavrietActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnZavrietActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnZavrietActionPerformed

    private void btnUpravitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpravitActionPerformed
        int vybranyRiadok = tabAuta.getSelectedRow();
        //int indexVModeli = tabAuta.convertRowIndexToModel(vybranyRiadok);
        if (vybranyRiadok == -1) {
            return;
        }

        Auto vybraneAuto = autoTableModel.dajPodlaCislaRiadku(vybranyRiadok);

        if (vybraneAuto == null) {
            return;
        }

        UpravitAutoForm upravitAutoForm = new UpravitAutoForm(vybraneAuto, this);
        upravitAutoForm.setVisible(true);

        aktualizujZoznamAut();
    }//GEN-LAST:event_btnUpravitActionPerformed

    private void btnOdobratActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOdobratActionPerformed
        int vybranyRiadok = tabAuta.getSelectedRow();
        //int vybranyIndexVModeli = tabAuta.convertRowIndexToModel(vybranyRiadok);
        if (vybranyRiadok == -1) {
            return;
        }

        Auto vybraneAuto = autoTableModel.dajPodlaCislaRiadku(vybranyRiadok);

        int tlacidlo = JOptionPane.showConfirmDialog(this, "Naozaj chcete odstrániť túto položku?",
                "Odstrániť", JOptionPane.YES_NO_OPTION);

        if (tlacidlo == JOptionPane.YES_OPTION) {
            autoDao.odstran(vybraneAuto);
            aktualizujZoznamAut();
        }

    }//GEN-LAST:event_btnOdobratActionPerformed

    private void btnPridatDielActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPridatDielActionPerformed
        UpravitDielForm upravitDielForm = new UpravitDielForm(this);
        upravitDielForm.setVisible(true);
        
        aktualizujZoznamDielov();
    }//GEN-LAST:event_btnPridatDielActionPerformed

    private void btnOdstranitDielActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOdstranitDielActionPerformed
        int vybranyRiadok = tabDiely.getSelectedRow();
        // int vybratyIndexVModeli = tabDiely.convertRowIndexToModel(vybranyRiadok);
        
        Diel vybranyDiel
                = dielTableModel.dajPodlaCislaRiadku(vybranyRiadok);

        if(vybranyDiel == null) {
            return;
        }
        
        int tlacidlo = JOptionPane.showConfirmDialog(this, 
                "Naozaj chcete odstrániť túto položku?",
                "Odstrániť",
                JOptionPane.YES_NO_OPTION
        );
        if(tlacidlo == JOptionPane.YES_OPTION) {
            dielDao.odstran(vybranyDiel);    
            aktualizujZoznamDielov();            
        }
    }//GEN-LAST:event_btnOdstranitDielActionPerformed

    private void btnUpravitDielActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpravitDielActionPerformed
        int vybranyRiadok = tabDiely.getSelectedRow();
        //int indexVModeli = tabAuta.convertRowIndexToModel(vybranyRiadok);
        if (vybranyRiadok == -1) {
            return;
        }

        Diel vybranyDiel = dielTableModel.dajPodlaCislaRiadku(vybranyRiadok);

        if (vybranyDiel == null) {
            return;
        }

        UpravitDielForm upravitDielForm = new UpravitDielForm(vybranyDiel, this);
        upravitDielForm.setVisible(true);

        aktualizujZoznamDielov();
    }//GEN-LAST:event_btnUpravitDielActionPerformed

    private void btnZavrietDielActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnZavrietDielActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnZavrietDielActionPerformed

    private void btnPridatMotorkuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPridatMotorkuActionPerformed
        UpravitMotorkuForm upravitMotorkaForm = new UpravitMotorkuForm(this);
        upravitMotorkaForm.setVisible(true);
        
        aktualizujZoznamMotoriek();
    }//GEN-LAST:event_btnPridatMotorkuActionPerformed

    private void btnZavrietMotorkuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnZavrietMotorkuActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnZavrietMotorkuActionPerformed

    private void btnOdstranitMotorkuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOdstranitMotorkuActionPerformed
        int vybranyRiadok = tabMotorky.getSelectedRow();
        // int vybratyIndexVModeli = tabDiely.convertRowIndexToModel(vybranyRiadok);
        
        Motorka vybranaMotorka = motorkaTableModel.dajPodlaCislaRiadku(vybranyRiadok);

        if(vybranaMotorka == null) {
            return;
        }
        
        int tlacidlo = JOptionPane.showConfirmDialog(this, 
                "Naozaj chcete odstrániť túto položku?",
                "Odstrániť",
                JOptionPane.YES_NO_OPTION
        );
        if(tlacidlo == JOptionPane.YES_OPTION) {
            motorkaDao.odstran(vybranaMotorka);    
            aktualizujZoznamMotoriek();            
        }
    }//GEN-LAST:event_btnOdstranitMotorkuActionPerformed

    private void btnUpravitMotorkuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpravitMotorkuActionPerformed
        int vybranyRiadok = tabMotorky.getSelectedRow();
        //int indexVModeli = tabAuta.convertRowIndexToModel(vybranyRiadok);
        if (vybranyRiadok == -1) {
            return;
        }

        Motorka vybranaMotorka = motorkaTableModel.dajPodlaCislaRiadku(vybranyRiadok);

        if (vybranaMotorka == null) {
            return;
        }

        UpravitMotorkuForm upravitMotorkaForm = new UpravitMotorkuForm(vybranaMotorka, this);
        upravitMotorkaForm.setVisible(true);

        aktualizujZoznamMotoriek();
    }//GEN-LAST:event_btnUpravitMotorkuActionPerformed

    private void btnPridatAutobusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPridatAutobusActionPerformed
        UpravitAutobusForm upravitAutobusForm = new UpravitAutobusForm(this);
        upravitAutobusForm.setVisible(true);
        
        aktualizujZoznamAutobusov();
    }//GEN-LAST:event_btnPridatAutobusActionPerformed

    private void btnOdstranitAutobusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOdstranitAutobusActionPerformed
        int vybranyRiadok = tabAutobusy.getSelectedRow();
        // int vybratyIndexVModeli = tabDiely.convertRowIndexToModel(vybranyRiadok);
        
        Autobus vybranyAutobus = autobusTableModel.dajPodlaCislaRiadku(vybranyRiadok);

        if(vybranyAutobus == null) {
            return;
        }
        
        int tlacidlo = JOptionPane.showConfirmDialog(this, 
                "Naozaj chcete odstrániť túto položku?",
                "Odstrániť",
                JOptionPane.YES_NO_OPTION
        );
        if(tlacidlo == JOptionPane.YES_OPTION) {
            autobusDao.odstran(vybranyAutobus);    
            aktualizujZoznamAutobusov();            
        }
    }//GEN-LAST:event_btnOdstranitAutobusActionPerformed

    private void btnUpravitAutobusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpravitAutobusActionPerformed
           int vybranyRiadok = tabAutobusy.getSelectedRow();
       
        if (vybranyRiadok == -1) {
            return;
        }

        Autobus vybranyAutobus = autobusTableModel.dajPodlaCislaRiadku(vybranyRiadok);

        if (vybranyAutobus == null) {
            return;
        }

        UpravitAutobusForm upravitAutobusForm = new UpravitAutobusForm(vybranyAutobus, this);
        upravitAutobusForm.setVisible(true);

        aktualizujZoznamAutobusov();
    }//GEN-LAST:event_btnUpravitAutobusActionPerformed

    private void btnZavrietAutobusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnZavrietAutobusActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnZavrietAutobusActionPerformed

    private void btnKosikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKosikActionPerformed
      int vybranyRiadok = tabAuta.getSelectedRow();
        
        if (vybranyRiadok == -1) {
            return;
        }

        Auto vybraneAuto = autoTableModel.dajPodlaCislaRiadku(vybranyRiadok);

        if (vybraneAuto == null) {
            return;
        }

        NakupnyKosikForm nakupnyKosikForm = new NakupnyKosikForm(vybraneAuto,this);
        nakupnyKosikForm.setVisible(true);

        aktualizujZoznamAut();
    }//GEN-LAST:event_btnKosikActionPerformed

    private void btnNakupnyKosikAUtobusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNakupnyKosikAUtobusActionPerformed
        int vybranyRiadok = tabAutobusy.getSelectedRow();
        //int indexVModeli = tabAuta.convertRowIndexToModel(vybranyRiadok);
        if (vybranyRiadok == -1) {
            return;
        }

        Autobus vybranyAutobus = autobusTableModel.dajPodlaCislaRiadku(vybranyRiadok);

        if (vybranyAutobus == null) {
            return;
        }

        NakupnyKosikFormAutobus nakupnyKosikForm = new NakupnyKosikFormAutobus(vybranyAutobus,this);
        nakupnyKosikForm.setVisible(true);

        aktualizujZoznamAutobusov();
    }//GEN-LAST:event_btnNakupnyKosikAUtobusActionPerformed

    private void btnNakupnyKosikMotorkyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNakupnyKosikMotorkyActionPerformed
       int vybranyRiadok = tabMotorky.getSelectedRow();
        //int indexVModeli = tabAuta.convertRowIndexToModel(vybranyRiadok);
        if (vybranyRiadok == -1) {
            return;
        }

        Motorka vybranaMotorka = motorkaTableModel.dajPodlaCislaRiadku(vybranyRiadok);

        if (vybranaMotorka == null) {
            return;
        }

        
            NakupnyKosikFormMotorka nakupnyKosikForm = new NakupnyKosikFormMotorka(vybranaMotorka,this);
            nakupnyKosikForm.setVisible(true);
              

        aktualizujZoznamMotoriek();
    }//GEN-LAST:event_btnNakupnyKosikMotorkyActionPerformed

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
            java.util.logging.Logger.getLogger(HlavnyFormularForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HlavnyFormularForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HlavnyFormularForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HlavnyFormularForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HlavnyFormularForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDetaily;
    private javax.swing.JButton btnDetailyMotorka;
    private javax.swing.JButton btnHladatAutobus;
    private javax.swing.JButton btnHladatDiel;
    private javax.swing.JButton btnHladatMotorku;
    private javax.swing.JButton btnKosik;
    private javax.swing.JButton btnNakupnyKosikAUtobus;
    private javax.swing.JButton btnNakupnyKosikMotorky;
    private javax.swing.JButton btnOdobrat;
    private javax.swing.JButton btnOdstranitAutobus;
    private javax.swing.JButton btnOdstranitDiel;
    private javax.swing.JButton btnOdstranitMotorku;
    private javax.swing.JButton btnPridat;
    private javax.swing.JButton btnPridatAutobus;
    private javax.swing.JButton btnPridatDiel;
    private javax.swing.JButton btnPridatMotorku;
    private javax.swing.JButton btnUpravit;
    private javax.swing.JButton btnUpravitAutobus;
    private javax.swing.JButton btnUpravitDiel;
    private javax.swing.JButton btnUpravitMotorku;
    private javax.swing.JButton btnZavriet;
    private javax.swing.JButton btnZavrietAutobus;
    private javax.swing.JButton btnZavrietDiel;
    private javax.swing.JButton btnZavrietMotorku;
    private javax.swing.JPanel jAuta;
    private javax.swing.JPanel jAutobus;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jMotorky;
    private javax.swing.JPanel jNahradneDiely;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblNazov;
    private javax.swing.JTable tabAuta;
    private javax.swing.JTable tabAutobusy;
    private javax.swing.JTable tabDiely;
    private javax.swing.JTable tabMotorky;
    // End of variables declaration//GEN-END:variables

}

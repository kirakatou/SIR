/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sumames.sir.ui.report;

import com.sumames.sir.Main;
import com.sumames.sir.entity.AccountChart;
import com.sumames.sir.helper.AppUtil;
import com.sumames.sir.helper.AutoCompletion;
import com.sumames.sir.helper.TextComponentUtils;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author My pc
 */
public class AccountChartData extends javax.swing.JPanel {

    private String option;
    private int recordId;
    private AccountChart accountChart;

    /**
     * Creates new form EmployerInput
     *
     * @param option utk mengetahui masuk dari form mana
     * @param recordId utk mengetahui record id jika mengedit data
     */
    public AccountChartData(String option, int recordId) {
        this.option = option;
        this.recordId = recordId;
        initComponents();
        loadingData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btSave = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tfDesc = new javax.swing.JTextArea();
        cbFor = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tfNameAcc = new javax.swing.JTextField();
        cbMain = new javax.swing.JComboBox<>();
        tfAcc = new javax.swing.JTextField();

        setFont(new java.awt.Font("Noto Serif", 0, 14)); // NOI18N
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(844, 417));

        btSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sumames/sir/resources/image/buttons/6-01.png"))); // NOI18N
        btSave.setBorderPainted(false);
        btSave.setContentAreaFilled(false);
        btSave.setPreferredSize(new java.awt.Dimension(65, 23));
        btSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSaveActionPerformed(evt);
            }
        });

        jLabel6.setFont(getFont());
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Akun Sebagai:");
        jLabel6.setPreferredSize(new java.awt.Dimension(25, 30));

        jLabel4.setFont(getFont());
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Description :");

        jLabel1.setFont(getFont());
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Data Akun Induk:");
        jLabel1.setPreferredSize(new java.awt.Dimension(44, 30));

        tfDesc.setColumns(20);
        tfDesc.setRows(5);
        jScrollPane1.setViewportView(tfDesc);

        cbFor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Judul", "Sub Judul", "Detail" }));
        cbFor.setPreferredSize(new java.awt.Dimension(100, 30));
        cbFor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbForActionPerformed(evt);
            }
        });

        jLabel7.setFont(getFont());
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("No Akun:");
        jLabel7.setPreferredSize(new java.awt.Dimension(69, 30));

        jLabel8.setFont(getFont());
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Nama Akun:");
        jLabel8.setPreferredSize(new java.awt.Dimension(63, 30));

        tfNameAcc.setFont(getFont());
        tfNameAcc.setPreferredSize(new java.awt.Dimension(100, 30));
        tfNameAcc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNameAccActionPerformed(evt);
            }
        });
        TextComponentUtils.setNumericTextOnly(tfNameAcc);

        cbMain.setPreferredSize(new java.awt.Dimension(100, 30));
        cbMain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMainActionPerformed(evt);
            }
        });
        AutoCompletion.enable(cbMain);

        tfAcc.setFont(getFont());
        tfAcc.setPreferredSize(new java.awt.Dimension(100, 30));
        tfAcc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfAccActionPerformed(evt);
            }
        });
        TextComponentUtils.setNumericTextOnly(tfNameAcc);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbMain, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbFor, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfNameAcc, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfAcc, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 330, Short.MAX_VALUE)
                        .addComponent(btSave, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cbMain, jScrollPane1, tfAcc, tfNameAcc});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbFor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(tfAcc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfNameAcc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btSave, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap(233, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel1, jLabel4, jLabel6, jLabel7, jLabel8});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cbFor, cbMain, tfAcc, tfNameAcc});

    }// </editor-fold>//GEN-END:initComponents


    private void btSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSaveActionPerformed
        saveData();
    }//GEN-LAST:event_btSaveActionPerformed

    private void tfNameAccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNameAccActionPerformed

    }//GEN-LAST:event_tfNameAccActionPerformed

    private void tfAccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfAccActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfAccActionPerformed

    private void cbForActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbForActionPerformed
        if (cbFor.getSelectedIndex() == 0) {
            cbMain.setEnabled(false);
        } else {
            cbMain.setEnabled(true);
            AutoCompletion.enable(cbMain);
        }
    }//GEN-LAST:event_cbForActionPerformed

    private void cbMainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMainActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbMainActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btSave;
    private javax.swing.JComboBox<String> cbFor;
    private javax.swing.JComboBox<String> cbMain;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField tfAcc;
    private javax.swing.JTextArea tfDesc;
    private javax.swing.JTextField tfNameAcc;
    // End of variables declaration//GEN-END:variables

    public void loadingData() {
        AutoCompletion.enable(cbMain);

        if (option.equals("NEW")) {
            cbMain.setSelectedIndex(0);
        } else if (option.equals("EDIT")) {
            accountChart = AppUtil.getService().getAccountChartById(recordId);
            objectToForm();
        }
    }

    public void saveData() {
        if (option.equals("NEW")) {
            formToObject();
            accountChart.setCreateDatetime(new Date());
            accountChart.setCreateByRecordId(Main.getFrame().getLogin().getEmployeeRecordId());
            if (AppUtil.getService().save(accountChart)) {
                msg("Save Done!");
                Main.getFrame().getTab().removeTabAt(Main.getFrame().getTab().getSelectedIndex());
            } else {
                msg("Save Failed!");
            }
        } else if (option.equals("EDIT")) {
            formToObject();
            accountChart.setRecordId(recordId);
            accountChart.setEditDatetime(new Date());
            accountChart.setEditByRecordId(Main.getFrame().getLogin().getEmployeeRecordId());
            if (AppUtil.getService().save(accountChart)) {
                msg("Save Done!");
                Main.getFrame().getTab().removeTabAt(Main.getFrame().getTab().getSelectedIndex());
            } else {
                msg("Save Failed!");
            }
        }
    }

    public void formToObject() {

    }

    public void objectToForm() {
        if (accountChart != null) {
            
        }
    }

    private void msg(String msg) {
        JOptionPane.showMessageDialog(null, msg);
    }
}

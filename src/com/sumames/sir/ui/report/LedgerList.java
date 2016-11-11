/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sumames.sir.ui.report;

import com.sumames.sir.Main;
import com.sumames.sir.entity.AccountChart;
import com.sumames.sir.entity.Ledger;
import com.sumames.sir.helper.AppUtil;
import com.sumames.sir.helper.AutoCompletion;
import com.sumames.sir.helper.Support;
import java.util.HashMap;
import java.util.List;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author My pc
 */
public class LedgerList extends javax.swing.JPanel {

    private List<Ledger> Ledgers;
    private HashMap<String, Integer> accId;
    /**
     * Creates new form Journal
     */
    public LedgerList() {
        initComponents();
        refreshCombobox();
        refreshTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbLedger = new javax.swing.JTable();
        btRefresh = new javax.swing.JButton();
        cbAcc = new javax.swing.JComboBox<>();
        dtStart = new com.toedter.calendar.JDateChooser();
        dtEnd = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 153, 0));
        setOpaque(false);

        tbLedger.setModel(new javax.swing.table.DefaultTableModel(
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
        tbLedger.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbLedgerMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbLedger);

        btRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sumames/sir/resources/image/buttons/5-01.png"))); // NOI18N
        btRefresh.setBorderPainted(false);
        btRefresh.setContentAreaFilled(false);
        btRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRefreshActionPerformed(evt);
            }
        });

        cbAcc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        dtStart.setOpaque(false);
        dtStart.setPreferredSize(new java.awt.Dimension(91, 25));
        dtStart.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                dtStartPropertyChange(evt);
            }
        });

        dtEnd.setOpaque(false);
        dtEnd.setPreferredSize(new java.awt.Dimension(91, 25));
        dtEnd.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                dtEndPropertyChange(evt);
            }
        });

        jLabel1.setFont(getFont());
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TO");

        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("...");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 777, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(dtStart, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dtEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cbAcc, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {dtEnd, dtStart});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btRefresh)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbAcc, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dtStart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dtEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cbAcc, jButton1});

    }// </editor-fold>//GEN-END:initComponents

    private void btRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRefreshActionPerformed
        refreshTable();
    }//GEN-LAST:event_btRefreshActionPerformed

    private void tbLedgerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbLedgerMouseClicked
        if (evt.getClickCount() == 2) {
            if (tbLedger.getSelectedRow() >= 0) {
                JournalData cd = new JournalData("EDIT", Integer.valueOf(tbLedger.getValueAt(tbLedger.getSelectedRow(), 0).toString()));
                new Support().NewTab(Main.getFrame().getTab(), cd, "Account Chart Data - " + tbLedger.getValueAt(tbLedger.getSelectedRow(), 1).toString());
            }else {
                msg("No Data is Selected");
            }
        }    
    }//GEN-LAST:event_tbLedgerMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void dtStartPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_dtStartPropertyChange
        refreshTable();
    }//GEN-LAST:event_dtStartPropertyChange

    private void dtEndPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_dtEndPropertyChange
        refreshTable();
    }//GEN-LAST:event_dtEndPropertyChange


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btRefresh;
    private javax.swing.JComboBox<String> cbAcc;
    private com.toedter.calendar.JDateChooser dtEnd;
    private com.toedter.calendar.JDateChooser dtStart;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbLedger;
    // End of variables declaration//GEN-END:variables
    private void refreshTable() {
        Ledgers = AppUtil.getService().getLedgerByAccId(dtStart.getDate(), dtEnd.getDate(), accId.get(cbAcc.getSelectedItem()));
        tbLedger.setModel(new LedgerTableModel(Ledgers));
        tbLedger.getColumnModel().getColumn(0).setMinWidth(0);
        tbLedger.getColumnModel().getColumn(0).setMaxWidth(0);
    }
    private void refreshCombobox(){
        cbAcc.removeAllItems();
        
        AutoCompletion.enable(cbAcc);
        accId = new HashMap();
        List<AccountChart> list = AppUtil.getService().getAccountCharts();
        for (AccountChart acc : list) {
            String name = acc.getAccountNo() + " - " + acc.getAccountName();
            accId.put(name, acc.getRecordId());
            cbAcc.addItem(name);
        }
        dtStart.setDate(new Date());
        dtEnd.setDate(new Date());
    }
    private class LedgerTableModel extends AbstractTableModel {

        private List<Ledger> listLedgers;
        private final String[] tableHeaders = {"Record Id", "No", "Date", "Account No", "Account Name", "Relation", "Debit", "Credit"};

        public LedgerTableModel(List<Ledger> listLedgers) {
            this.listLedgers = listLedgers;
        }

        public int getRowCount() {
            return listLedgers.size();
        }

        public int getColumnCount() {
            return 8;
        }

        @Override
        public String getColumnName(int columnIndex) {
            return tableHeaders[columnIndex];
        }

        public Object getValueAt(int rowIndex, int columnIndex) {
            Ledger p = Ledgers.get(rowIndex);
            switch (columnIndex) {
                case 0:
                    return p.getRecordId();
                case 1:
                    return p.getNo();
                case 2:
                    return p.getDate();
                case 3:
                    return p.getAccountNo();
                case 4:
                    return p.getAccountName();
                case 5:
                    return p.getRelation();
                case 6:
                    return p.getDebetTransaction();
                case 7:
                    return p.getCreditTransaction();
                default:
                    return "";
            }
        }
    }

    private void msg(String msg) {
        JOptionPane.showMessageDialog(null, msg);
    }
}
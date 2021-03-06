/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sumames.sir.ui.report;

import com.sumames.sir.Main;
import com.sumames.sir.entity.Customer;
import com.sumames.sir.entity.AccountChart;
import com.sumames.sir.helper.AppUtil;
import com.sumames.sir.ui.renderer.ComboBoxRenderer;
import com.sumames.sir.helper.Support;
import java.awt.Color;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author My pc
 */
public class AccountChartList extends javax.swing.JPanel {

    private List<AccountChart> AccountCharts;

    /**
     * Creates new form AccountChart
     */
    public AccountChartList() {
        initComponents();
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
        tbAccountChart = new javax.swing.JTable();
        tfSearch = new javax.swing.JTextField();
        btRefresh = new javax.swing.JButton();
        btAdd = new javax.swing.JButton();
        btEdit = new javax.swing.JButton();
        btDelete = new javax.swing.JButton();
        btSearch = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 153, 0));
        setOpaque(false);

        tbAccountChart.setModel(new javax.swing.table.DefaultTableModel(
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
        tbAccountChart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbAccountChartMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbAccountChart);

        tfSearch.setPreferredSize(new java.awt.Dimension(6, 25));

        btRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sumames/sir/resources/image/buttons/5-01.png"))); // NOI18N
        btRefresh.setBorderPainted(false);
        btRefresh.setContentAreaFilled(false);
        btRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRefreshActionPerformed(evt);
            }
        });

        btAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sumames/sir/resources/image/buttons/2-01.png"))); // NOI18N
        btAdd.setBorder(null);
        btAdd.setContentAreaFilled(false);
        btAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddActionPerformed(evt);
            }
        });

        btEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sumames/sir/resources/image/buttons/3-01.png"))); // NOI18N
        btEdit.setBorder(null);
        btEdit.setContentAreaFilled(false);
        btEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditActionPerformed(evt);
            }
        });

        btDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sumames/sir/resources/image/buttons/4-01.png"))); // NOI18N
        btDelete.setBorder(null);
        btDelete.setContentAreaFilled(false);
        btDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeleteActionPerformed(evt);
            }
        });

        btSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sumames/sir/resources/image/buttons/1-01.png"))); // NOI18N
        btSearch.setBorderPainted(false);
        btSearch.setContentAreaFilled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 777, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btAdd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btEdit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btDelete)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(tfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btSearch)
                    .addComponent(btRefresh)
                    .addComponent(btEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btDelete)
                    .addComponent(btAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRefreshActionPerformed
        refreshTable();
    }//GEN-LAST:event_btRefreshActionPerformed

    private void btAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddActionPerformed
        AccountChartData cd = new AccountChartData("NEW", 0);
        new Support().NewTab(Main.getFrame().getTab(), cd, "Account Chart Data - New");

    }//GEN-LAST:event_btAddActionPerformed

    private void btEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditActionPerformed
        if (tbAccountChart.getSelectedRow() >= 0) {
            AccountChartData cd = new AccountChartData("EDIT", Integer.valueOf(tbAccountChart.getValueAt(tbAccountChart.getSelectedRow(), 0).toString()));
            new Support().NewTab(Main.getFrame().getTab(), cd, "Account Chart Data - " + tbAccountChart.getValueAt(tbAccountChart.getSelectedRow(), 1).toString());
        }else {
            msg("No Data is Selected");
        }
    }//GEN-LAST:event_btEditActionPerformed

    private void btDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeleteActionPerformed
        if (tbAccountChart.getSelectedRow() >= 0) {
            AccountChart accountChart = AppUtil.getService().getAccountChartById(Integer.valueOf(tbAccountChart.getValueAt(tbAccountChart.getSelectedRow(), 0).toString()));
            if (accountChart != null) {
                accountChart.setDeleteDatetime(new Date());
                accountChart.setDeleteByRecordId(Main.getFrame().getLogin().getEmployeeRecordId());
                if (AppUtil.getService().save(accountChart)) {
                    msg("Delete Done!");
                    refreshTable();
                } else {
                    msg("Delete Failed!");
                }

            }

        }
    }//GEN-LAST:event_btDeleteActionPerformed

    private void tbAccountChartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbAccountChartMouseClicked
        if (evt.getClickCount() == 2) {
            if (tbAccountChart.getSelectedRow() >= 0) {
                AccountChartData cd = new AccountChartData("EDIT", Integer.valueOf(tbAccountChart.getValueAt(tbAccountChart.getSelectedRow(), 0).toString()));
                new Support().NewTab(Main.getFrame().getTab(), cd, "Account Chart Data - " + tbAccountChart.getValueAt(tbAccountChart.getSelectedRow(), 1).toString());
            }else {
                msg("No Data is Selected");
            }
        }    
    }//GEN-LAST:event_tbAccountChartMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdd;
    private javax.swing.JButton btDelete;
    private javax.swing.JButton btEdit;
    private javax.swing.JButton btRefresh;
    private javax.swing.JButton btSearch;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbAccountChart;
    private javax.swing.JTextField tfSearch;
    // End of variables declaration//GEN-END:variables
    private void refreshTable() {
            AccountCharts = AppUtil.getService().getAccountCharts();
            tbAccountChart.setModel(new AccountChartTableModel(AccountCharts));
            tbAccountChart.getColumnModel().getColumn(0).setMinWidth(0);
            tbAccountChart.getColumnModel().getColumn(0).setMaxWidth(0);

    }

    private class AccountChartTableModel extends AbstractTableModel {

        private List<AccountChart> listAccountCharts;
        private final String[] tableHeaders = {"Record Id", "Nama Kelompok Akun", "Nama Sub Kelompok Akun"};

        public AccountChartTableModel(List<AccountChart> listAccountCharts) {
            this.listAccountCharts = listAccountCharts;
        }

        public int getRowCount() {
            return listAccountCharts.size();
        }

        public int getColumnCount() {
            return 3;
        }

        @Override
        public String getColumnName(int columnIndex) {
            return tableHeaders[columnIndex];
        }

        public Object getValueAt(int rowIndex, int columnIndex) {
            AccountChart p = AccountCharts.get(rowIndex);
            switch (columnIndex) {
                case 0:
                    return p.getRecordId();
                case 1:
                    return p.getAccountNo();
                case 2:
                    return p.getAccountName();
                default:
                    return "";
            }
        }
    }

    private void msg(String msg) {
        JOptionPane.showMessageDialog(null, msg);
    }
}

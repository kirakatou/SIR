/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sumames.sir.ui.purchase;

import com.sumames.sir.Main;
import com.sumames.sir.entity.Employer;
import com.sumames.sir.helper.AppUtil;
import com.sumames.sir.ui.renderer.ComboBoxRenderer;
import com.sumames.sir.helper.Support;
import com.sumames.sir.entity.PurchaseInvoice;
import com.sumames.sir.entity.Rent;
import com.sumames.sir.ui.rent.RentData;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author My pc
 */
public class PurchaseInvoiceList extends javax.swing.JPanel {

    private List<PurchaseInvoice> invoices;

    /**
     * Creates new form rent
     */
    public PurchaseInvoiceList() {
        initComponents();
        System.out.println("1");
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
        tbInvoice = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        btRefresh = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        dtEnd = new com.toedter.calendar.JDateChooser();
        dtStart = new com.toedter.calendar.JDateChooser();
        btSearch = new javax.swing.JButton();
        cbOption = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 153, 0));
        setOpaque(false);

        tbInvoice.setModel(new javax.swing.table.DefaultTableModel(
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
        tbInvoice.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbInvoiceMouseClicked(evt);
            }
        });
        tbInvoice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbInvoiceKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tbInvoice);

        jTextField1.setPreferredSize(new java.awt.Dimension(6, 25));

        btRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sumames/sir/resources/image/buttons/5-01.png"))); // NOI18N
        btRefresh.setBorderPainted(false);
        btRefresh.setContentAreaFilled(false);
        btRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRefreshActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sumames/sir/resources/image/buttons/2-01.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sumames/sir/resources/image/buttons/3-01.png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.setContentAreaFilled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sumames/sir/resources/image/buttons/4-01.png"))); // NOI18N
        jButton4.setBorder(null);
        jButton4.setContentAreaFilled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        dtEnd.setOpaque(false);
        dtEnd.setPreferredSize(new java.awt.Dimension(91, 25));

        dtStart.setOpaque(false);
        dtStart.setPreferredSize(new java.awt.Dimension(91, 25));

        btSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sumames/sir/resources/image/buttons/1-01.png"))); // NOI18N
        btSearch.setBorderPainted(false);
        btSearch.setContentAreaFilled(false);

        cbOption.setBackground(new java.awt.Color(250, 174, 66));
        cbOption.setForeground(new java.awt.Color(255, 255, 255));
        cbOption.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbOption.setPreferredSize(new java.awt.Dimension(56, 25));
        cbOption.setRenderer(new ComboBoxRenderer());

        jLabel1.setFont(new java.awt.Font("Alfa Slab One", 0, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("TO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 777, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dtStart, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbOption, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(dtEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbOption, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel1)
                            .addComponent(dtEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dtStart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btSearch)
                    .addComponent(btRefresh)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRefreshActionPerformed
        refreshTable();
    }//GEN-LAST:event_btRefreshActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new Support().NewTab(Main.getFrame().getTab(), new PurchaseInvoiceData("NEW", 0), "Invoice Data");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tbInvoiceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbInvoiceMouseClicked
        if (evt.getClickCount() == 2) {
            if (tbInvoice.getSelectedRow() >= 0) {
                PurchaseInvoiceData rd = new PurchaseInvoiceData("EDIT", Integer.valueOf(tbInvoice.getValueAt(tbInvoice.getSelectedRow(), 0).toString()));
                new Support().NewTab(Main.getFrame().getTab(), rd, "Purchase Invoice Data - " + tbInvoice.getValueAt(tbInvoice.getSelectedRow(), 1).toString());
            }
        }
    }//GEN-LAST:event_tbInvoiceMouseClicked

    private void tbInvoiceKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbInvoiceKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbInvoiceKeyPressed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        PurchaseInvoiceData rd = new PurchaseInvoiceData("EDIT", Integer.valueOf(tbInvoice.getValueAt(tbInvoice.getSelectedRow(), 0).toString()));
        new Support().NewTab(Main.getFrame().getTab(), rd, "Purchase Invoice Data - " + tbInvoice.getValueAt(tbInvoice.getSelectedRow(), 1).toString());
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if (tbInvoice.getSelectedRow() >= 0) {
            PurchaseInvoice invoice = AppUtil.getService().getInvoiceById(Integer.valueOf(tbInvoice.getValueAt(tbInvoice.getSelectedRow(), 0).toString()));
            if (invoice != null) {
                invoice.setDeleteDatetime(new Date());
                invoice.setDeleteByUserRecordId(Main.getFrame().getLogin().getEmployeeRecordId());
                if (AppUtil.getService().save(invoice)) {
                    msg("Delete Done!");
                    refreshTable();
                } else {
                    msg("Delete Failed!");
                }

            }

        }
    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btRefresh;
    private javax.swing.JButton btSearch;
    private javax.swing.JComboBox<String> cbOption;
    private com.toedter.calendar.JDateChooser dtEnd;
    private com.toedter.calendar.JDateChooser dtStart;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tbInvoice;
    // End of variables declaration//GEN-END:variables

    private void refreshTable() {
//        invoices = AppUtil.getService().getInvoice();
        tbInvoice.setModel(new CustomerTableModel(invoices));
        tbInvoice.getColumnModel().getColumn(0).setMinWidth(0);
        tbInvoice.getColumnModel().getColumn(0).setMaxWidth(0);
    }

    private class CustomerTableModel extends AbstractTableModel {

        private List<PurchaseInvoice> listInvoice;
        private final String[] tableHeaders = {"Record Id", "no", "date", "department", "Invoice_by_record_id", "total", "date_needed", "note"};

        public CustomerTableModel(List<PurchaseInvoice> listInvoice) {
            this.listInvoice = listInvoice;
        }

        public int getRowCount() {
            return listInvoice.size();
        }

        public int getColumnCount() {
            return 8;
        }

        @Override
        public String getColumnName(int columnIndex) {
            return tableHeaders[columnIndex];
        }

        public Object getValueAt(int rowIndex, int columnIndex) {
            PurchaseInvoice p = invoices.get(rowIndex);
            switch (columnIndex) {
                case 0:
                    return p.getRecordId();
                case 1:
                    return p.getNo();
                case 2:
                    return p.getDate();
                case 3:
//                    return p.getDepartment();
                case 4:
//                    return e.getName();
                case 5:
//                    return p.getTotal();
                case 6:
//                    return p.getDateNeeded();
                case 7:
                    return p.getNote();
                default:
                    return "";
            }
        }
    }

    private void msg(String msg) {
        JOptionPane.showMessageDialog(null, msg);
    }

}
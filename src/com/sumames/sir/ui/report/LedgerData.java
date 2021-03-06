/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sumames.sir.ui.report;

import com.sumames.sir.Main;
import com.sumames.sir.entity.Car;
import com.sumames.sir.entity.Customer;
import com.sumames.sir.entity.Rent;
import com.sumames.sir.entity.RentDetail;
import com.sumames.sir.helper.AppUtil;
import com.sumames.sir.helper.AutoCompletion;
import com.sumames.sir.helper.Support;
import com.sumames.sir.helper.TextComponentUtils;
import com.sumames.sir.ui.renderer.TableCellListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author My pc
 */
public class LedgerData extends javax.swing.JPanel {
    
    private String option;
    private int recordId;
    private Rent rent;
    private JComboBox<String> cbCarName;
    private JComboBox<String> cbCarPlate;
    private HashMap<String, Integer> carID;
    private HashMap<String, Integer> carPlateID;
    private HashMap<String, Integer> customerID;
    private Action action;

    /**
     * Creates new form EmployerInput
     */
    public LedgerData(String option, int recordId) {
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
        tfNo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbRent = new javax.swing.JTable();
        btDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tfDesc = new javax.swing.JTextArea();
        cbCustomerName = new javax.swing.JComboBox<>();
        cbCustomerNo = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        tfSubtotal = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tfDisc = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tfTotal = new javax.swing.JTextField();
        date = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();
        chReturn = new javax.swing.JCheckBox();

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

        tfNo.setFont(getFont());
        tfNo.setPreferredSize(new java.awt.Dimension(100, 30));

        jLabel6.setFont(getFont());
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("No :");
        jLabel6.setPreferredSize(new java.awt.Dimension(25, 30));

        jLabel4.setFont(getFont());
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Description :");

        jLabel1.setFont(getFont());
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Name :");
        jLabel1.setPreferredSize(new java.awt.Dimension(44, 30));

        tbRent.setFont(getFont());
        tbRent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Car Name", "Car Plate", "Price", "Period (days)", "Subtotal"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Double.class, java.lang.Object.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, false, true, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        KeyStroke keyStroke = KeyStroke.getKeyStroke(KeyEvent.VK_DELETE, 0);
        tbRent.getActionMap().put("save", saveAction());
        tbRent.getInputMap(JComponent.WHEN_FOCUSED).put(keyStroke, "save");

        action  = new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                abstractActionPerformed(e);
            }
        };
        TableCellListener tcl = new TableCellListener(tbRent, action);
        JTextField currentCell = new JTextField();
        TextComponentUtils.setNumericTextOnly(currentCell);
        cbCarName = new JComboBox<String>();
        cbCarPlate = new JComboBox<String>();

        tbRent.getColumnModel().getColumn(4).setCellEditor(new DefaultCellEditor(currentCell));
        tbRent.getColumnModel().getColumn(1).setCellEditor(new DefaultCellEditor(cbCarName));
        tbRent.getColumnModel().getColumn(2).setCellEditor(new DefaultCellEditor(cbCarPlate));
        tbRent.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbRentKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(tbRent);
        if (tbRent.getColumnModel().getColumnCount() > 0) {
            tbRent.getColumnModel().getColumn(0).setMinWidth(0);
            tbRent.getColumnModel().getColumn(0).setMaxWidth(0);
        }

        btDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sumames/sir/resources/image/buttons/4-01.png"))); // NOI18N
        btDelete.setBorder(null);
        btDelete.setContentAreaFilled(false);
        btDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeleteActionPerformed(evt);
            }
        });

        tfDesc.setColumns(20);
        tfDesc.setRows(5);
        jScrollPane1.setViewportView(tfDesc);

        cbCustomerName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbCustomerName.setSelectedIndex(1);
        cbCustomerName.setPreferredSize(new java.awt.Dimension(100, 30));
        cbCustomerName.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbCustomerNameItemStateChanged(evt);
            }
        });

        cbCustomerNo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbCustomerNo.setSelectedIndex(1);
        cbCustomerNo.setPreferredSize(new java.awt.Dimension(100, 30));
        cbCustomerNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCustomerNoActionPerformed(evt);
            }
        });

        jLabel7.setFont(getFont());
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Sub Total :");
        jLabel7.setPreferredSize(new java.awt.Dimension(69, 30));

        tfSubtotal.setEditable(false);
        tfSubtotal.setBackground(new java.awt.Color(255, 153, 0));
        tfSubtotal.setFont(getFont());
        tfSubtotal.setForeground(new java.awt.Color(255, 255, 255));
        tfSubtotal.setEnabled(false);
        tfSubtotal.setPreferredSize(new java.awt.Dimension(100, 30));
        TextComponentUtils.setNumericTextOnly(tfSubtotal);

        jLabel8.setFont(getFont());
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Discount :");
        jLabel8.setPreferredSize(new java.awt.Dimension(63, 30));

        tfDisc.setFont(getFont());
        tfDisc.setPreferredSize(new java.awt.Dimension(100, 30));
        tfDisc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDiscActionPerformed(evt);
            }
        });
        TextComponentUtils.setNumericTextOnly(tfDisc);

        jLabel9.setFont(getFont());
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Total :");
        jLabel9.setPreferredSize(new java.awt.Dimension(40, 30));

        tfTotal.setEditable(false);
        tfTotal.setBackground(new java.awt.Color(255, 153, 0));
        tfTotal.setFont(getFont());
        tfTotal.setForeground(new java.awt.Color(255, 255, 255));
        tfTotal.setEnabled(false);
        tfTotal.setPreferredSize(new java.awt.Dimension(100, 30));
        TextComponentUtils.setNumericTextOnly(tfTotal);

        date.setOpaque(false);
        date.setPreferredSize(new java.awt.Dimension(91, 30));

        jLabel10.setFont(getFont());
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Date :");
        jLabel10.setPreferredSize(new java.awt.Dimension(40, 30));

        chReturn.setBackground(new java.awt.Color(255, 255, 255));
        chReturn.setFont(getFont());
        chReturn.setForeground(new java.awt.Color(255, 255, 255));
        chReturn.setText("Returned");
        chReturn.setOpaque(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(84, 84, 84)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(65, 65, 65)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cbCustomerNo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(tfNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tfTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(chReturn))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfSubtotal, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                                    .addComponent(tfDisc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btSave, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btDelete)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tfNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(34, 34, 34))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(chReturn))
                                .addGap(0, 0, 0)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbCustomerNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(tfTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(32, 32, 32))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tfDisc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btSave, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void abstractActionPerformed(java.awt.event.ActionEvent evt) {
        TableCellListener tcl = (TableCellListener) evt.getSource();
        int row = tbRent.getSelectedRow();
        if (tbRent.getSelectedRow() >= 0) {
            switch (tcl.getColumn()) {
                case 1:
                    if (!tcl.getNewValue().equals("")) {
                        Car car = AppUtil.getService().getCarById(carID.get(tcl.getNewValue().toString()));
                        tbRent.setValueAt(car.getPlateNumber(), row, 2);
                        tbRent.setValueAt(car.getPrice(), row, 3);
                        
                        if (tbRent.getModel().getValueAt(row, 4) != null) {
                            int a = Integer.parseInt(tbRent.getModel().getValueAt(row, 4).toString());
                            tbRent.setValueAt(car.getPrice() * a, row, 5);
                        } else {
                            tbRent.setValueAt(0, row, 5);
                        }
                        count();
                    }
                    break;
                case 2:
                    if (!tcl.getNewValue().equals("")) {
                        Car car = AppUtil.getService().getCarById(carPlateID.get(tcl.getNewValue().toString()));
                        tbRent.setValueAt(car.getName(), row, 1);
                        tbRent.setValueAt(car.getPrice(), row, 3);
                        
                        if (tbRent.getModel().getValueAt(row, 4) != null) {
                            int a = Integer.parseInt(tbRent.getModel().getValueAt(row, 4).toString());
                            tbRent.setValueAt(car.getPrice() * a, row, 5);
                        } else {
                            tbRent.setValueAt(0, row, 5);
                        }
                        count();
                    }
                    break;
                case 3: {
                    int a;
                    if (tbRent.getModel().getValueAt(row, 4) == null) {
                        a = 0;
                    } else {
                        a = Integer.parseInt(tbRent.getModel().getValueAt(row, 4).toString());
                    }
                    Double b = (Double) tcl.getNewValue();
                    Double subtotal = a * b;
                    tbRent.setValueAt(subtotal, row, 5);
                    count();
                    break;
                }
                case 4: {
                    double a;
                    if (tbRent.getModel().getValueAt(row, 3) == null) {
                        a = 0.00;
                    } else {
                        a = Double.parseDouble(String.valueOf(tbRent.getModel().getValueAt(row, 3)));
                    }
                    int b = Integer.parseInt(tcl.getNewValue().toString());
                    double subtotal = a * b;
                    tbRent.setValueAt(subtotal, row, 5);
                    count();
                    break;
                }
                default:
                    break;
            }
            
        }
    }
    
    private AbstractAction saveAction() {
        AbstractAction save = new AbstractAction() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
//                JOptionPane.showMessageDialog(RentData.this.tbRent, "Action Triggered.");
                tbRent.editingCanceled(null);
                tbRent.editingStopped(null);
                int selectedRow = tbRent.getSelectedRow();
                if (selectedRow != -1) {
                    ((DefaultTableModel) tbRent.getModel()).removeRow(selectedRow);
                    tbRent.scrollRectToVisible(tbRent.getCellRect(tbRent.getRowCount() - 1, 0, true));
                }
            }
        };
        return save;
    }
    

    private void btSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSaveActionPerformed
        saveData();
    }//GEN-LAST:event_btSaveActionPerformed

    private void tbRentKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbRentKeyPressed
        if (evt.getID() == KeyEvent.KEY_PRESSED) {
            if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
                if (tbRent.getSelectedRow() == tbRent.getRowCount() - 1) {
                    addRow();
                }
            }
        }
    }//GEN-LAST:event_tbRentKeyPressed

    private void btDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeleteActionPerformed
        DefaultTableModel model = (DefaultTableModel) tbRent.getModel();
        model.removeRow(tbRent.getSelectedRow());
    }//GEN-LAST:event_btDeleteActionPerformed

    private void tfDiscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDiscActionPerformed
        count();
    }//GEN-LAST:event_tfDiscActionPerformed

    private void cbCustomerNameItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbCustomerNameItemStateChanged
//        System.out.println(cbCustomerNo.getSelectedIndex() + " != "  + cbCustomerName.getSelectedIndex());
//        if(cbCustomerNo.getSelectedIndex() != cbCustomerName.getSelectedIndex()){
        cbCustomerNo.setSelectedIndex(cbCustomerName.getSelectedIndex());
//        }else {

//        }
    }//GEN-LAST:event_cbCustomerNameItemStateChanged

    private void cbCustomerNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCustomerNoActionPerformed
//        System.out.println(cbCustomerNo.getSelectedIndex() + " 1");
//        cbCustomerName.setSelectedIndex(cbCustomerNo.getSelectedIndex());
    }//GEN-LAST:event_cbCustomerNoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btDelete;
    private javax.swing.JButton btSave;
    private javax.swing.JComboBox<String> cbCustomerName;
    private javax.swing.JComboBox<String> cbCustomerNo;
    private javax.swing.JCheckBox chReturn;
    private com.toedter.calendar.JDateChooser date;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbRent;
    private javax.swing.JTextArea tfDesc;
    private javax.swing.JTextField tfDisc;
    private javax.swing.JTextField tfNo;
    private javax.swing.JTextField tfSubtotal;
    private javax.swing.JTextField tfTotal;
    // End of variables declaration//GEN-END:variables
    private void addRow() {
        DefaultTableModel model = (DefaultTableModel) tbRent.getModel();
        if (model != null) {
            model.addRow(new Object[]{});
        }
        
    }
    
    public void loadingData() {
        cbCarName.removeAllItems();
        cbCustomerName.removeAllItems();
        cbCustomerNo.removeAllItems();
        AutoCompletion.enable(cbCarName);
        AutoCompletion.enable(cbCarPlate);
        AutoCompletion.enable(cbCustomerName);
        AutoCompletion.enable(cbCustomerNo);
        carID = new HashMap();
        carPlateID = new HashMap();
        customerID = new HashMap();
        List<Car> list = AppUtil.getService().getCars();
        for (Car cars : list) {
            carID.put(cars.getName(), cars.getRecordId());
            carPlateID.put(cars.getPlateNumber(), cars.getRecordId());
            cbCarName.addItem(cars.getName());
            cbCarPlate.addItem(cars.getPlateNumber());
        }
        List<Customer> customerList = AppUtil.getService().getCustomers();
        for (Customer customers : customerList) {
            customerID.put(customers.getNo(), customers.getRecordId());
            cbCustomerNo.addItem(customers.getNo());
            cbCustomerName.addItem(customers.getName());
        }
        if (option.equals("NEW")) {
            tfNo.setText("");
            tfSubtotal.setText("0");
            tfDisc.setText("0");
            tfTotal.setText("0");
            tfDesc.setText("");
            date.setDate(new Date());
            chReturn.setVisible(false);
            addRow();
        } else if (option.equals("EDIT")) {
            chReturn.setVisible(true);
            rent = AppUtil.getService().getRentById(recordId);
            objectToForm();
            refreshTable();
        }
    }
    
    public void refreshTable() {
        List<RentDetail> list = AppUtil.getService().getListRentById(recordId);
        DefaultTableModel dtm = (DefaultTableModel) tbRent.getModel();
        dtm.setRowCount(0);
        for (RentDetail rd : list) {
            Car car = AppUtil.getService().getCarById(rd.getCarRecordId());
            dtm.addRow(new Object[]{rd.getRecordId(), car.getName(), car.getPlateNumber(), rd.getPrice(), rd.getPeriod(), rd.getSubtotal()});
        }
    }
    
    public void count() {
        if (tbRent.getRowCount() > 0) {
            Double subtotal = 0.00;
            
            for (int i = 0; i <= tbRent.getRowCount() - 1; i++) {
                System.out.println("Value = " + tbRent.getModel().getValueAt(i, 5));
                subtotal = subtotal + Double.parseDouble(tbRent.getModel().getValueAt(i, 5).toString());
                System.out.println("Subtotal" + subtotal);
            }
            tfSubtotal.setText(subtotal.toString());
//            System.out.println(tfDisc.getText());
            double disc = Double.parseDouble(tfDisc.getText());
            subtotal = subtotal - disc;
            tfTotal.setText(subtotal.toString());
        }
    }
    
    private void runReport() {
        try {
            List<RentDetail> tests = AppUtil.getService().getListRentById(recordId);
            JRBeanCollectionDataSource beanColDataSource = new JRBeanCollectionDataSource(tests);
            HashMap param = new HashMap();
            param.put("INVOICENO", tfNo.getText());
            param.put("DESCRIPTION", tfDesc.getText());
            JasperPrint jasperPrint = JasperFillManager.fillReport("SirInvoice.jasper", param, beanColDataSource);
            JasperViewer.viewReport(jasperPrint, false);

            // to directly popup save file
            // JasperPrintManager.printReport(jasperPrint, false);
        } catch (JRException ex) {
            System.out.println("Error:\n" + ex.getLocalizedMessage());
        }
    }
    
    public void saveData() {
        if (option.equals("NEW")) {
            formToObject();
            rent.setCreateDatetime(new Date());
            rent.setCreateByUserRecordId(Main.getFrame().getLogin().getEmployeeRecordId());
            if (AppUtil.getService().save(rent)) {
                for (int i = 0; i < tbRent.getRowCount(); i++) {
                    RentDetail rentDetail = new RentDetail();
                    rentDetail.setRentRecordId(rent.getRecordId());
                    rentDetail.setCarRecordId(carPlateID.get(tbRent.getValueAt(i, 2).toString()));
                    rentDetail.setPrice(Double.parseDouble(tbRent.getValueAt(i, 3).toString()));
                    rentDetail.setPeriod(Integer.parseInt(tbRent.getValueAt(i, 4).toString()));
                    rentDetail.setSubtotal(Double.parseDouble(tbRent.getValueAt(i, 5).toString()));
                    rentDetail.setCreateDatetime(new Date());
                    rentDetail.setCreateByUserRecordId(Main.getFrame().getLogin().getEmployeeRecordId());
                    AppUtil.getService().save(rentDetail);
                }
                msg("Save Done!");
                Main.getFrame().getTab().removeTabAt(Main.getFrame().getTab().getSelectedIndex());
            } else {
                msg("Save Failed!");
            }
        } else if (option.equals("EDIT")) {
            formToObject();
            rent.setRecordId(recordId);
            if (AppUtil.getService().save(rent)) {
                for (int i = 0; i < tbRent.getRowCount(); i++) {
                    RentDetail rentDetail = new RentDetail();
                    if(tbRent.getValueAt(i, 0) != null){
                        rentDetail.setRecordId((Integer) tbRent.getValueAt(i, 0));
                    }
                    rentDetail.setRentRecordId(rent.getRecordId());
                    rentDetail.setCarRecordId(carPlateID.get(tbRent.getValueAt(i, 2).toString()));
                    rentDetail.setPrice(Double.parseDouble(tbRent.getValueAt(i, 3).toString()));
                    rentDetail.setPeriod(Integer.parseInt(tbRent.getValueAt(i, 4).toString()));
                    rentDetail.setSubtotal(Double.parseDouble(tbRent.getValueAt(i, 5).toString()));
                    rentDetail.setCreateDatetime(new Date());
                    rentDetail.setCreateByUserRecordId(Main.getFrame().getLogin().getEmployeeRecordId());
                    AppUtil.getService().save(rentDetail);
                }
                msg("Save Done!");
                Main.getFrame().getTab().removeTabAt(Main.getFrame().getTab().getSelectedIndex());
            } else {
                msg("Save Failed!");
            }
        }
    }
    
    public void formToObject() {
        if (rent == null) {
            rent = new Rent();
        }
        rent.setNo(tfNo.getText());
        rent.setCustomerProfilesRecordId(customerID.get(cbCustomerNo.getSelectedItem()));
        rent.setSubtotal(Double.parseDouble(tfSubtotal.getText()));
        rent.setDiscount(Double.parseDouble(tfDisc.getText()));
        rent.setTotal(Double.parseDouble(tfTotal.getText()));
        rent.setDescription(tfDesc.getText());
        rent.setDate(date.getDate());
        rent.setReturned(chReturn.isSelected());
        
    }
    
    public void objectToForm() {
        if (rent != null) {
            tfNo.setText(rent.getNo());
            tfSubtotal.setText(Double.toString(rent.getSubtotal()));
            tfDisc.setText(Double.toString(rent.getDiscount()));
            tfTotal.setText(Double.toString(rent.getTotal()));
            tfDesc.setText(rent.getDescription());
            cbCustomerNo.setSelectedItem(Support.getKeyFromValue(customerID, rent.getCustomerProfilesRecordId()));
            date.setDate(rent.getDate());
            chReturn.setSelected(rent.getReturned());
        }
    }
    
    private void msg(String msg) {
        JOptionPane.showMessageDialog(null, msg);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sumames.sir.ui.renderer;

import java.awt.Component;
import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author James Riady
 */
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
 
/**
 *
 * @author Deny Prasetyo
 */
public class DoubleCellRenderer extends DefaultTableCellRenderer {
 
 private DecimalFormat decimalFormat;
 
 public DoubleCellRenderer() {
 Locale idLocale = new Locale("id");
 DecimalFormatSymbols dfs = new DecimalFormatSymbols(idLocale);
 dfs.setCurrencySymbol("Rp. ");
 decimalFormat = new DecimalFormat("\u00A4##,###.##", dfs);
 }
 
 @Override
 public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
 JLabel component = (JLabel) super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
 component.setHorizontalAlignment(SwingConstants.RIGHT);
 component.setText(decimalFormat.format(value));
 
 return component;
 }
}

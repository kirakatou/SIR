/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sumames.sir.helper;

import java.awt.Component;
import java.sql.SQLException;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;

/**
 *
 * @author Asus
 */
public class Support {
    public Support(){
        
    }
    
    public void NewTab(JTabbedPane tab, Component component, String TabName){
        int count = tab.getTabCount();
        int Yes = 0;
        if (count != 0) {
            for (int i = 0; i < count; i++) {
                if (tab.getTitleAt(i).equals(TabName + "  ")) {
                    int dialogResult = JOptionPane.showConfirmDialog(null, "<html><p>This tab is already opened, <br>Do you want to open this tab again?</p><html>", "Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);

                    if (dialogResult == JOptionPane.YES_OPTION) {
                        Yes = 1;
                        
                    }
                    else if (dialogResult == JOptionPane.NO_OPTION){
                        Yes = 0;
                        tab.setSelectedIndex(i);
                    }
                    break;

                } 
                else{
                    Yes = 1;
                }
            }
        } 
        if (count == 0 || Yes == 1){
            tab.add(component, TabName + "  ");
            tab.setSelectedIndex(tab.getTabCount() - 1);
        }
    }
//    public static String AutoNumber(String FieldName, String TableName, String Prefix, Boolean WithDateTime) {
//        String AutoNumber = null;
//        String vTempNumber = null;
//            sql = "SELECT " + FieldName + " FROM " + TableName
//                    + " where " + FieldName + " like '%" + Prefix + "%'  "
//                    + "ORDER BY " + FieldName + " ASC";
//            
//            while (rs.next()) {
//                vTempNumber = String.format("%03d", Integer.parseInt(rs.getString(FieldName).substring(rs.getString(FieldName).length() - 3)) + 1);
//
//            }
//            if (rs.isBeforeFirst()) {
//                vTempNumber = "001";
//                System.out.println("no data");
//            }
//            
//        if (WithDateTime) {
//            java.util.Date date = new java.util.Date();
//            Calendar cal = Calendar.getInstance();
//            cal.setTime(date);
//            String MonthData = String.format("%02d", cal.get(Calendar.MONTH) + 1);
//            String YearData = Integer.toString(cal.get(Calendar.YEAR)).substring(2);
//
//            AutoNumber = Prefix + "." + MonthData + YearData + "." + vTempNumber;
//        } else {
//            AutoNumber = Prefix + "." + vTempNumber;
//        }
//        c.Disconnect();
//
//        return AutoNumber;
//    }
}

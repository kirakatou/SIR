/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sumames.sir.ui.renderer;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JList;
import javax.swing.UIManager;

/**
 *
 * @author Sutandi
 */
public class ComboBoxRenderer extends javax.swing.plaf.basic.BasicComboBoxRenderer
  {
    static Color oldColor;
    public ComboBoxRenderer()
    {
      super();
      setOpaque(true);
    }
    public Component getListCellRendererComponent(JList list,Object value,int index,boolean isSelected,boolean cellHasFocus)
    {
      setText(value.toString());
      oldColor = UIManager.getColor("ComboBox.selectionBackground");
      if(isSelected) setBackground(oldColor);
      else {
          setBackground(new Color(250, 174, 66));
      }
      return this;
    }
  }

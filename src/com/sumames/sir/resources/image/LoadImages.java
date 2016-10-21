/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sumames.sir.resources.image;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author My pc
 */
public class LoadImages {
    private Image bg;
    private Image Logo;

    public Image getBg() {
        return bg;
    }

    public Image getLogo() {
        return Logo;
    }
    public LoadImages() {
        try {
            bg = new ImageIcon(getClass().getResource("/com/sumames/sir/resources/image/menu/6-01.png")).getImage();
            Logo = new ImageIcon(getClass().getResource("/com/sumames/sir/resources/image/Login/Logo.png")).getImage();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error Loading Images");
        }
    }
}

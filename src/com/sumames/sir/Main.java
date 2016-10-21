/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sumames.sir;

import com.sumames.sir.service.AccessDetailService;
import com.sumames.sir.service.AccessService;
import com.sumames.sir.service.CarService;
import com.sumames.sir.service.CustomerService;
import com.sumames.sir.service.EmployerService;
import com.sumames.sir.service.GarageService;
import com.sumames.sir.service.LoginService;
import com.sumames.sir.service.impl.AccessDetailServiceImpl;
import com.sumames.sir.service.impl.AccessServiceImpl;
import com.sumames.sir.service.impl.CarServiceImpl;
import com.sumames.sir.service.impl.CustomerServiceImpl;
import com.sumames.sir.service.impl.EmployerServiceImpl;
import com.sumames.sir.service.impl.GarageServiceImpl;
import com.sumames.sir.service.impl.LoginServiceImpl;
import com.sumames.sir.ui.MainFrame;

/**
 *
 * @author Asus
 */
public class Main {
    private static CustomerService customerService;
    private static EmployerService employerService;
    private static LoginService loginService;
    private static GarageService garageService;
    private static CarService carService;
    private static AccessService accessService;
    private static AccessDetailService accessDetailService;
    private static MainFrame frame;

    public static CustomerService getCustomerService() {
        return customerService;
    }

    public static EmployerService getEmployerService() {
        return employerService;
    }

    public static LoginService getLoginService() {
        return loginService;
    }

    public static AccessService getAccessService() {
        return accessService;
    }

    public static AccessDetailService getAccessDetailService() {
        return accessDetailService;
    }

    public static GarageService getGarageService() {
        return garageService;
    }

    public static CarService getCarService() {
        return carService;
    }
    
    
    
    public static MainFrame getFrame() {
        return frame;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                ApplicationContext applicationContext =
//                        new ClassPathXmlApplicationContext("applicationContext.xml");
                customerService = new CustomerServiceImpl();
                employerService = new EmployerServiceImpl();
                loginService = new LoginServiceImpl();
                accessService = new AccessServiceImpl();
                accessDetailService = new AccessDetailServiceImpl();
                garageService = new GarageServiceImpl();
                carService = new CarServiceImpl();
                frame = new MainFrame();
                frame.setVisible(true);
            }
        });
    }
    
}

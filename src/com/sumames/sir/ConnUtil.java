/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sumames.sir;

import com.sumames.sir.service.CustomerService;
import com.sumames.sir.service.impl.CustomerServiceImpl;

/**
 *
 * @author Asus
 */
public class ConnUtil {
    private static CustomerService customerService;
    
    public static CustomerService getCustomerService() {
        if(customerService == null){
            customerService = new CustomerServiceImpl();
        }
        return customerService;
    }
}

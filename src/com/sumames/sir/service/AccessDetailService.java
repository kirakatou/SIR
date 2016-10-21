/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sumames.sir.service;

import com.sumames.sir.entity.Customer;
import com.sumames.sir.entity.LoginAccess;
import com.sumames.sir.entity.LoginAccessDetail;
import java.util.List;

/**
 *
 * @author Asus
 */
public interface AccessDetailService {

    public boolean save(Object obj);

    public boolean delete(Object obj);

    public List<LoginAccessDetail> getAccessDetailAll();
    
    
}

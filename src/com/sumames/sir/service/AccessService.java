/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sumames.sir.service;

import com.sumames.sir.entity.LoginAccess;
import java.util.List;

/**
 *
 * @author Asus
 */
public interface AccessService {

    public boolean save(Object obj);

    public boolean delete(Object obj);

    public List<LoginAccess> getAccessAll();
    
    
}

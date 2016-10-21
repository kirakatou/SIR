/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sumames.sir.service;

import com.sumames.sir.entity.Car;
import java.util.List;

/**
 *
 * @author Asus
 */
public interface CarService {

    public boolean save(Object obj);

    public boolean delete(Object obj);

    public List<Car> getCarAll();
    
    public Car getById(int id);
    
    public List<Car> getByGarageId(int id);
}

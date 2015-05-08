/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.warehouseapp.repository;

import com.mycompany.warehouseapp.domain.EmpAddress;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Xolela
 */
public interface EmpAddressRepository extends CrudRepository<EmpAddress,Long>{
    
}

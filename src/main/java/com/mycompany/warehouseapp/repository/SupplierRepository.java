/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.warehouseapp.repository;

import com.mycompany.warehouseapp.domain.Supplier;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Xolela
 */
public interface SupplierRepository extends CrudRepository<Supplier,Long> {
    
}

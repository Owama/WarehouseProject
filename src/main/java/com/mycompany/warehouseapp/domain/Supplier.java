/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.warehouseapp.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Xolela
 */
@Entity
public class Supplier implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int supplierNumber;
    
   private Supplier() {
    }

    public Supplier(Builder builder) {
        supplierNumber=builder.supplierNumber;
      
    }

      public static class Builder{
        private int supplierNumber;
      

        public Builder supplierNumber(int supplierNumber) {
            this.supplierNumber = supplierNumber;
            return this;
        }

            public Builder copy(Supplier value){
            this.supplierNumber=value.supplierNumber;
         
            return this;
        }

        public Supplier build(){
            return new Supplier(this);
        }
    }
    

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public int getSupplierNumber() {
        return supplierNumber;
    }

    public void setSupplierNumber(int supplierNumber) {
        this.supplierNumber = supplierNumber;
    }
    
       public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Supplier)) {
            return false;
        }
        Supplier other = (Supplier) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.warehouseapp.domain.Supplier[ id=" + id + " ]";
    }
    
}

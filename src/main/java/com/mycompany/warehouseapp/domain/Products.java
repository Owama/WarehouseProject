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
public class Products implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String productCode;
    private String description;
    private double unitPrice;
    
    
    
    private Products() {
    }

    public Products(Builder builder) {
        productCode=builder.productCode;
        description=builder.description;
         unitPrice=builder.unitPrice;
        
    }

       public static class Builder{
        private String productCode;
        private String description;
         private double unitPrice;

        public Builder(String description) {
            this.description = description;
        }

        
        public Builder(double unitPrice) {
            this.unitPrice = unitPrice;
        }
        public Builder description(String value){
            this.description=value;
            return this;
        }

        public Builder copy(Products value){
            this.description=value.description;
            this.productCode=value.productCode;
            this.unitPrice=value.unitPrice;
            return this;
        }

        public Products build(){
            return new Products(this);
        }
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getProductCode() {
        return productCode;
    }

    public String getDescription() {
        return description;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
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
        if (!(object instanceof Products)) {
            return false;
        }
        Products other = (Products) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.warehouseapp.domain.Products[ id=" + id + " ]";
    }
    
}

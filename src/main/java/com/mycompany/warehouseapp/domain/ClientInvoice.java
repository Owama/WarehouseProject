/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.warehouseapp.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Xolela
 */
@Entity
public class ClientInvoice implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Date invoiceDate;
    private double orderAmount;
    
    
    private ClientInvoice() {
    }

    public ClientInvoice(Builder builder) {
        invoiceDate=builder.invoiceDate;
        orderAmount=builder.orderAmount;
    }

       public static class Builder{
        private Date invoiceDate;
        private double orderAmount;

        public Builder(Date invoiceDate) {
            this.invoiceDate = invoiceDate;
        }

        public Builder orderAmount(double value){
            this.orderAmount=value;
            return this;
        }

        public Builder copy(ClientInvoice value){
            this.orderAmount=value.orderAmount;
            this.invoiceDate=value.invoiceDate;
            return this;
        }

        public ClientInvoice build(){
            return new ClientInvoice(this);
        }
    }
    public Long getId() {
        return id;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Date getInvoiceDate() {
        return invoiceDate;
    }

    public double getOrderAmount() {
        return orderAmount;
    }

    public void setInvoiceDate(Date invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public void setOrderAmount(double orderAmount) {
        this.orderAmount = orderAmount;
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
        if (!(object instanceof ClientInvoice)) {
            return false;
        }
        ClientInvoice other = (ClientInvoice) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.warehouseapp.domain.ClientInvoice[ id=" + id + " ]";
    }
    
}

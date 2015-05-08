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
public class ClientOrder implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String orderNumber;
    private Date orderDate;

    
    
    private ClientOrder() {
    }

    public ClientOrder(Builder builder) {
        orderNumber=builder.orderNumber;
        orderDate=builder.orderDate;
    }

        public static class Builder{
        private String orderNumber;
        private Date orderDate;

        public Builder(String orderNumber) {
            this.orderNumber = orderNumber;
        
        }

        public Builder orderDate(Date value){
            this.orderDate=value;
            return this;
        }

        public Builder copy(ClientOrder value){
            this.orderDate=value.orderDate;
            this.orderNumber=value.orderNumber;
            return this;
        }

        public ClientOrder build(){
            return new ClientOrder(this);
        }
    }
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
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
        if (!(object instanceof ClientOrder)) {
            return false;
        }
        ClientOrder other = (ClientOrder) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.warehouseapp.domain.ClientOrder[ id=" + id + " ]";
    }
    
}

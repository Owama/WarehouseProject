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
public class Employee implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String employeeNumber;
    
    private Employee() {
    }

    public Employee(Builder builder) {
        employeeNumber=builder.employeeNumber;
       
    }

       public static class Builder{
        private String employeeNumber;
       

        public Builder(String employeeNumber) {
            this.employeeNumber = employeeNumber;
        }

        public Builder employeeNumber(String value){
            this.employeeNumber=value;
            return this;
        }

        public Builder copy(Employee value){
            this.employeeNumber=value.employeeNumber;
           
            return this;
        }

        public Employee build(){
            return new Employee(this);
        }
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
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
        if (!(object instanceof Employee)) {
            return false;
        }
        Employee other = (Employee) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.warehouseapp.domain.Employee[ id=" + id + " ]";
    }
    
}

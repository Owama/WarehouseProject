/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.warehouseapp.api;
import com.mycompany.warehouseapp.domain.Employee;
import com.mycompany.warehouseapp.services.EmployeeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Xolela
 */
@RestController
@RequestMapping("/api/**")
public class HomePage {
    @Autowired
    private EmployeeServices service;
    @RequestMapping(value = "home",method = RequestMethod.GET)
    public String Index(){
        return "This is a Home Page";
    }

    @RequestMapping(value = "/Employee",method = RequestMethod.GET)
    public Employee getEmployeeNumber(){
        Employee employee = new Employee.Builder("12345")
                .employeeNumber(null).build();

        return employee;
    }

    @RequestMapping(value = "/Employee", method = RequestMethod.GET)
    public Employee getEmployee(){
        
        return service.getEmployee();
    }
}
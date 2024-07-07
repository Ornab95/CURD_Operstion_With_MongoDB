package com.ab.curd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ab.curd.dto.EmployeeTO;
import com.ab.curd.service.EmployeeService;

@RestController
@RequestMapping("/api/emp")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/Create")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public String createEmployee(@RequestBody EmployeeTO emp) {
        return employeeService.createEmployee(emp);

    }
}

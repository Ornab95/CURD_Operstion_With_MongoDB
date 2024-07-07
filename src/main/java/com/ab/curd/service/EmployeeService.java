package com.ab.curd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ab.curd.dto.EmployeeTO;
import com.ab.curd.model.Employee;
import com.ab.curd.repo.EmployeeRepo;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepo employeeRepo;

    public String createEmployee(EmployeeTO employeeTO) {
        try {
            Employee emp = Employee.builder().empName(employeeTO.getEmpName()).salary(employeeTO.getSalary()).location(employeeTO.getLocation()).build();

            employeeRepo.save(emp);
        } catch (Exception e) {

        }
        return "Employee Create Successfully";

    }

}

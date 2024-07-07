package com.ab.curd.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ab.curd.model.Employee;

@Repository
public interface EmployeeRepo extends MongoRepository<Employee, String> {

}

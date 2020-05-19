package com.uebueng3.springbootcrudrestfulwebservices.repository;

import com.uebueng3.springbootcrudrestfulwebservices.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}

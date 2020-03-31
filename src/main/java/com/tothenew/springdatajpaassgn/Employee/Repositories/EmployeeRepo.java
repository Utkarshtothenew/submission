package com.tothenew.springdatajpaassgn.Employee.Repositories;

import com.tothenew.springdatajpaassgn.Employee.Entities.Employee;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface EmployeeRepo extends PagingAndSortingRepository<Employee, Integer> {
     List<Employee> findEmployeesByName(String name);
     List<Employee> findByNameStartingWith(String character);
     List<Employee> findEmployeesByAgeBetween(Integer start,Integer end);
}

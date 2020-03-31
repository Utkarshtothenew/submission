package com.tothenew.springdatajpaassgn;

import com.tothenew.springdatajpaassgn.Employee.Entities.Employee;
import com.tothenew.springdatajpaassgn.Employee.Repositories.EmployeeRepo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

@SpringBootTest
class SpringDataJpaAssgnApplicationTests {

    @Autowired
    private EmployeeRepo employeeRepo;

    @Test
    public void createEmployee() {
        Employee employee = new Employee();
        employee.setId(1);
        employee.setAge(22);
        employee.setName("Aaju");
        employee.setLocation("Delhi");

        Employee employee1 = new Employee();
        employee1.setId(2);
        employee1.setAge(32);
        employee1.setName("Kaju");
        employee1.setLocation("Noida");

        employeeRepo.save(employee);
        employeeRepo.save(employee1);
    }

    @Test
    public void updateEmployee() {
        Optional<Employee> employee = employeeRepo.findById(1);
        Employee employee1 = employee.get();
        employee1.setName("kaju");
        employeeRepo.save(employee1);
    }

    @Test
    public void deleteEmployee() {
        employeeRepo.deleteById(2);
    }

    @Test
    public void readEmployee() {
        Optional<Employee> employee = employeeRepo.findById(1);
        Assertions.assertNotNull(employee);
        Employee employee1 = employee.get();
        Assertions.assertEquals("Aaju",employee1.getName());
        // get all employees
        employeeRepo.findAll().forEach(e -> System.out.println(e));
    }

    @Test
    public void getEmployeeCount() {
        System.out.println("Count is --------------------> " + employeeRepo.count());
    }

    @Test
    public void PaginationAndSortingOnAge() {
        employeeRepo.findAll(PageRequest.of(0, 1, Sort.by(Sort.Direction.ASC,"Age"))).forEach(employee -> System.out.println("Page and sorting----> " + employee));
    }

    @Test
    public void findEmployeeByName() {
       employeeRepo.findEmployeesByName("Raju").forEach(employee -> System.out.println(employee));
    }

    @Test
    public void findByLike() {
        employeeRepo.findByNameStartingWith("A").forEach(employee -> System.out.println("Starting with A----------------> " + employee));
    }

    @Test
    public void findAgeBetween28To32() {
        employeeRepo.findEmployeesByAgeBetween(28,32).forEach(employee -> System.out.println("Age b/w 28 32--------> " + employee));
    }
}

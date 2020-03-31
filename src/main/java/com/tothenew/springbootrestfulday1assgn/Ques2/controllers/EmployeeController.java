package com.tothenew.springbootrestfulday1assgn.Ques2.controllers;

import com.tothenew.springbootrestfulday1assgn.Ques2.Exceptions.EmployeeNotFoundException;
import com.tothenew.springbootrestfulday1assgn.Ques2.Model.EmployeeBean;
import com.tothenew.springbootrestfulday1assgn.Ques2.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employee/all")
    public List<EmployeeBean> getAll() {
        return employeeService.getAll();
    }

    @GetMapping("/employee/{id}")
    public EmployeeBean getById(@PathVariable Integer id) {
        EmployeeBean employeeBean = employeeService.getById(id);
        if (employeeBean == null) {
            throw new EmployeeNotFoundException("id-" + id) ;
        }
        return employeeBean;
    }

    @PostMapping("/employee")
    public EmployeeBean addEmployee(@Valid @RequestBody EmployeeBean employeeBean) {
        return employeeService.addEmployee(employeeBean);
    }

    @DeleteMapping("/employee/delete/{id}")
    public List<EmployeeBean> deleteEmployee(@PathVariable Integer id) {
        return employeeService.deleteById(id);
    }

    @PutMapping("/employee/update")
    public List<EmployeeBean> updateEmployee(@RequestBody EmployeeBean employeeBean) {
        return employeeService.updateEmployee(employeeBean);
    }
}

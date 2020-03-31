package com.tothenew.springdatajpa2;

import com.tothenew.springdatajpa2.Employee.Entities.Employee;
import com.tothenew.springdatajpa2.Employee.Repositories.EmployeeRep;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringDataJpa2Application {

    public static void main(String[] args) {
       ApplicationContext applicationContext =  SpringApplication.run(SpringDataJpa2Application.class, args);

        EmployeeRep employeeRep = applicationContext.getBean(EmployeeRep.class);

        Employee employee = new Employee();
        employee.setFirstName("Shiva");
        employee.setLastName("Tiwari");
        employee.setAge(22);
        employee.setSalary(10000);

        Employee employee2 = new Employee();
        employee2.setFirstName("Shivam");
        employee2.setLastName("Lamba");
        employee2.setAge(32);
        employee2.setSalary(20000);

        Employee employee3 = new Employee();
        employee3.setFirstName("Rohan");
        employee3.setLastName("Sharma");
        employee3.setAge(52);
        employee3.setSalary(40000);

        Employee employee4 = new Employee();
        employee4.setFirstName("Rishabh");
        employee4.setLastName("Singh");
        employee4.setAge(29);
        employee4.setSalary(10000);

        employeeRep.save(employee);
        employeeRep.save(employee2);
        employeeRep.save(employee3);
        employeeRep.save(employee4);

        // ans 1
        List<Object[]> employeeList = employeeRep.queryForAnswerOne();
        for (Object[] e: employeeList) {
         System.out.println(e[0]);
        }
     System.out.println(employeeRep.findAll());


//      ans 2
         List<Object[]> objects =employeeRep.helpForAnswerTwo();
         for (Object[] e: objects) {
          employeeRep.queryForAnswerTwo(String.valueOf(e[0]),25000);
         }
     System.out.println(employeeRep.findAll());


//      ans 3
       int minSalary = employeeRep.helpForAnswerThree();
       employeeRep.queryForAnswerThree(minSalary);

       System.out.println(employeeRep.findAll());

       // ans 4

        Employee employee5 = new Employee();
        employee5.setFirstName("Rohit");
        employee5.setLastName("Veer Singh");
        employee5.setAge(29);
        employee5.setSalary(10000);

        employeeRep.save(employee5);

        List<Object[]> objects1 = employeeRep.queryForAnswerFour();
        for(Object[] o: objects1) {
            System.out.println(o[0]);
            System.out.println(o[1]);
            System.out.println(o[2]);
        }

        // ans 5

        Employee employee6 = new Employee();
        employee6.setFirstName("Mohit");
        employee6.setLastName("Arora");
        employee6.setAge(50);
        employee6.setSalary(10000);

        employeeRep.save(employee6);
        employeeRep.queryForAnswerFive(45);



    }

}

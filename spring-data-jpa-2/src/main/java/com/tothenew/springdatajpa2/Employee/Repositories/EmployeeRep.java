package com.tothenew.springdatajpa2.Employee.Repositories;

import com.tothenew.springdatajpa2.Employee.Entities.Employee;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import javax.annotation.security.PermitAll;
import javax.transaction.Transactional;
import java.util.List;

public interface EmployeeRep extends CrudRepository<Employee,Integer> {

    @Query("select firstName,lastName from Employee as emp where salary < (select avg(salary) from Employee ORDER BY age ASC, salary DESC)")
    List<Object[]> queryForAnswerOne();

    @Query("select salary from Employee where salary<(select avg(salary) from Employee )")
    List<Object[]> helpForAnswerTwo();

    @Transactional
    @Modifying
    @Query("update Employee emp set emp.salary=:sal where emp.firstName=:name")
    void queryForAnswerTwo(@Param("name") String name,@Param("sal") int sal);

    @Query("select min(salary) from Employee")
    int helpForAnswerThree();

    @Transactional
    @Modifying
    @Query("delete from Employee where salary=:minSal")
    void queryForAnswerThree(@Param("minSal") int minSal);

    @Query(value = "select empId,empFirstName,empAge from employeeTable where empLastName like '%Singh'",nativeQuery = true)
    List<Object[]> queryForAnswerFour();

    @Transactional
    @Modifying
    @Query(value = "delete from employeeTable where empAge>:age",nativeQuery = true)
    void queryForAnswerFive(@Param("age") int age);
}




//    @Transactional
//    @Modifying
//    @Query("update Employee emp set emp.salary=:salary where emp.salary < (select avg(salary) from Employee)")
//    void queryForAnswerTwo(@Param("salary") int salary);
//    // where emp.salary < (select avg(salary) from Employee where emp.id=id)
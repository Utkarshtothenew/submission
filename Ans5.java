package com.tothenew;

import java.util.*;

class Employee {
    String name;
    Double age;
    Double salary;

    public Employee(String name, Double age, Double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}

public class Ans5 {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Raju",40D,12000D);
        Employee employee2 = new Employee("Ramu",50D,22000D);
        Employee employee3 = new Employee("Raja",20D,8000D);
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);

        Collections.sort(employeeList, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o2.age.compareTo(o1.age);
            }
        });
        Iterator iterator = employeeList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}

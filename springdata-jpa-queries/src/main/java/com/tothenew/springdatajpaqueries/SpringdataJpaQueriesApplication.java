package com.tothenew.springdatajpaqueries;

import com.tothenew.springdatajpaqueries.Embedded.AnotherEmpRepo;
import com.tothenew.springdatajpaqueries.Embedded.AnotherEmployee;
import com.tothenew.springdatajpaqueries.Embedded.AnotherEmployeeSalary;
import com.tothenew.springdatajpaqueries.JoinedInheritence.Address;
import com.tothenew.springdatajpaqueries.JoinedInheritence.EmployeeJoinedRepo;
import com.tothenew.springdatajpaqueries.JoinedInheritence.RegularEmployeeJoined;
import com.tothenew.springdatajpaqueries.JoinedInheritence.TraineeEmployeeJoined;
import com.tothenew.springdatajpaqueries.SingleTableInheritence.EmployeeRepo;
import com.tothenew.springdatajpaqueries.SingleTableInheritence.RegularEmployee;
import com.tothenew.springdatajpaqueries.SingleTableInheritence.TraineeEmployee;
import com.tothenew.springdatajpaqueries.TablePerClassInheritence.EmployeeRepoTable;
import com.tothenew.springdatajpaqueries.TablePerClassInheritence.RegularEmployeeShowing;
import com.tothenew.springdatajpaqueries.TablePerClassInheritence.TraineeEmployeeShowing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringdataJpaQueriesApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(SpringdataJpaQueriesApplication.class, args);

//        StudentRepo studentRepo = applicationContext.getBean(StudentRepo.class);
//
//        Student student = new Student();
//        student.setFirstName("John");
//        student.setLastName("Ferguson");
//        student.setScore(88);
//
//        Student student2 = new Student();
//        student2.setFirstName("Bill");
//        student2.setLastName("Gates");
//        student2.setScore(75);
//
//        studentRepo.save(student);
//        studentRepo.save(student2);
//
//        System.out.println(studentRepo.findAllStudents(PageRequest.of(0,3)));
//        System.out.println(studentRepo.findAll());
//
//
//        List<Object[]> studentObject =  studentRepo.findAllStudentPartialData();
//        for (Object[] o : studentObject) {
//            System.out.println(o[0]);
//            System.out.println(o[1]);
//        }
//
//        List<Student> studentList = studentRepo.findAllStudentByFirstName("Bill");
//        for (Student s:studentList) {
//            System.out.println(s);
//        }
//        studentRepo.deleteBill();


        // Single Table Inheritence
        EmployeeRepo employeeRepo = applicationContext.getBean(EmployeeRepo.class);

        employeeRepo.save(new RegularEmployee("Shiva",100000,"SomeProject"));
        employeeRepo.save(new TraineeEmployee("Shivam",1,"SomeScore"));

        System.out.println(employeeRepo.findById(1L));
        System.out.println(employeeRepo.findById(2L));

        // Table Per Class Inheritence
        EmployeeRepoTable employeeRepoTable = applicationContext.getBean(EmployeeRepoTable.class);
        employeeRepoTable.save(new RegularEmployeeShowing("Shiva",100000,"SomeProject"));
        employeeRepoTable.save(new TraineeEmployeeShowing("Shivam",1,"SomeScore"));

        // Joined Inheritence
        EmployeeJoinedRepo employeeJoinedRepo = applicationContext.getBean(EmployeeJoinedRepo.class);
        employeeJoinedRepo.save(new RegularEmployeeJoined("Shiva",100000,"SomeProject",new Address("s","a")));
        employeeJoinedRepo.save(new TraineeEmployeeJoined("Shivam",1,"SomeScore",new Address("s","c")));

        // Showing embedded
        AnotherEmployee anotherEmployee = new AnotherEmployee("reema","shukla",50,new AnotherEmployeeSalary(20000L,200L,2l,500L));

        AnotherEmpRepo anotherEmpRepo = applicationContext.getBean(AnotherEmpRepo.class);
        anotherEmpRepo.save(anotherEmployee);

        System.exit(-1);


    }

}

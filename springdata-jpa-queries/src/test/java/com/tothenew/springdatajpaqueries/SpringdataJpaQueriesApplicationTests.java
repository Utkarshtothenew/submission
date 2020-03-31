package com.tothenew.springdatajpaqueries;

import com.tothenew.springdatajpaqueries.Student.Entities.Student;
import com.tothenew.springdatajpaqueries.Student.Repositories.StudentRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;

@SpringBootTest
class SpringdataJpaQueriesApplicationTests {

    @Autowired
    private StudentRepo repository;

    @Test
    public void testStudentCreate() {
        Student student = new Student();
        student.setFirstName("John");
        student.setLastName("Ferguson");
        student.setScore(88);

        Student student2 = new Student();
        student2.setFirstName("Bill");
        student2.setLastName("Gates");
        student2.setScore(75);

        repository.save(student);
        repository.save(student2);
    }
    @Test
    public void testFindAllStudents() {
        System.out.println(repository.findAllStudents(PageRequest.of(0,3)));
    }
}

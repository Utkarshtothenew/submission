package com.tothenew.springdatajpaqueries.Student.Repositories;

import com.tothenew.springdatajpaqueries.Student.Entities.Student;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;

import java.util.List;


public interface StudentRepo extends CrudRepository<Student,Long> {
    @Query("from Student")
    List<Student> findAllStudents(Pageable pageable);

    @Query("select st.firstName,st.lastName from Student st")
    List<Object[]> findAllStudentPartialData();

    @Query(value = "select * from student where first_Name=:firstName",nativeQuery = true)
    List<Student> findAllStudentByFirstName(@Param("firstName") String firstName);

    @Transactional
    @Modifying
    @Query("delete from Student where firstName='Bill'")
     void deleteBill();
}

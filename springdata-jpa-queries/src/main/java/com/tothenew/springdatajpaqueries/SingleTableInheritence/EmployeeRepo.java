package com.tothenew.springdatajpaqueries.SingleTableInheritence;

import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepo extends CrudRepository<EmployeeSingle,Long> {
}

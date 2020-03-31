package com.tothenew.springdatajpaqueries.TablePerClassInheritence;

import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepoTable extends CrudRepository<EmployeeShowing,Long> {
}

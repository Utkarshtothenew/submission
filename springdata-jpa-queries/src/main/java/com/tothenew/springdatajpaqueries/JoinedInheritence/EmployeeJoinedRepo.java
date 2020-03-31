package com.tothenew.springdatajpaqueries.JoinedInheritence;

import org.springframework.data.repository.CrudRepository;

public interface EmployeeJoinedRepo extends CrudRepository<EmployeeJoined,Long> {
}

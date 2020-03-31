package com.tothenew.SpringSecurityDemo.repositories;

import com.tothenew.SpringSecurityDemo.entities.GrantAuthorityImpl;
import com.tothenew.SpringSecurityDemo.entities.Roles;
import org.springframework.data.repository.CrudRepository;

import javax.management.relation.Role;

public interface EnumRepository extends CrudRepository<GrantAuthorityImpl,Integer>
{

}

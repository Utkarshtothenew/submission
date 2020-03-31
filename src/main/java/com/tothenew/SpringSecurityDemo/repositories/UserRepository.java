package com.tothenew.SpringSecurityDemo.repositories;

import com.tothenew.SpringSecurityDemo.entities.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UserRepository extends CrudRepository<User,Integer>
{
    List<User> findByusername(String username);
}

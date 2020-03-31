package com.tothenew.SpringSecurityDemo.services;

import com.tothenew.SpringSecurityDemo.entities.Roles;
import com.tothenew.SpringSecurityDemo.entities.User;
import com.tothenew.SpringSecurityDemo.repositories.EnumRepository;
import com.tothenew.SpringSecurityDemo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class UserDetailsServiceImpl implements UserDetailsService
{
    @Autowired
    EnumRepository enumRepository;
    @Autowired
    PasswordEncoder passwordEncoder;
    @Autowired
    UserRepository userRepository;


    public void  initialiseDatabase()
    {
        enumRepository.save(Roles.ADMIN.getRole());
        enumRepository.save(Roles.USER.getRole());
        //	enumRepository.save(Roles.ADMIN);
        userRepository.save(new User("Utkarsh",passwordEncoder.encode("utkarsh"), Arrays.asList(Roles.ADMIN.getRole(),Roles.USER.getRole()),true,true,true,true));
        userRepository.save(new User("Devansh",passwordEncoder.encode("devansh"), Arrays.asList(Roles.USER.getRole()),true,true,true,true));

    }
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException
    {
       String encryptpassword = passwordEncoder.encode("utkarsh");
        System.out.println("Tryinmg user of name : "+ username);
        System.out.println("Password is : "+encryptpassword);
        List<User> list = userRepository.findByusername(username);
        list.forEach(System.out::println);
        return list.get(0);
    }
}

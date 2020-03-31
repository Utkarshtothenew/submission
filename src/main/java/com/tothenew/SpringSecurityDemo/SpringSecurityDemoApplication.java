package com.tothenew.SpringSecurityDemo;

import com.tothenew.SpringSecurityDemo.entities.Roles;
import com.tothenew.SpringSecurityDemo.entities.User;
import com.tothenew.SpringSecurityDemo.repositories.EnumRepository;
import com.tothenew.SpringSecurityDemo.repositories.UserRepository;
import com.tothenew.SpringSecurityDemo.services.UserDetailsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Arrays;

@SpringBootApplication
public class SpringSecurityDemoApplication
{


	public static void main(String[] args)
	{
		ApplicationContext applicationContext = SpringApplication.run(SpringSecurityDemoApplication.class, args);
//		enumRepository.save(Roles.ADMIN.getRole());
//		enumRepository.save(Roles.USER.getRole());
//		//	enumRepository.save(Roles.ADMIN);
//		userRepository.save(new User("Utkarsh",passwordEncoder.encode("utkarsh"), Arrays.asList(Roles.ADMIN.getRole(),Roles.USER.getRole()),true,true,true,true));
//		userRepository.save(new User("Devansh",passwordEncoder.encode("devansh"), Arrays.asList(Roles.USER.getRole()),true,true,true,true));

		UserDetailsServiceImpl userDetailsService = applicationContext.getBean(UserDetailsServiceImpl.class);
		userDetailsService.initialiseDatabase();
	}

}

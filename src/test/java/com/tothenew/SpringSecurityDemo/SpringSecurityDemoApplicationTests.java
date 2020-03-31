package com.tothenew.SpringSecurityDemo;

import com.tothenew.SpringSecurityDemo.entities.GrantAuthorityImpl;
import com.tothenew.SpringSecurityDemo.entities.Roles;
import com.tothenew.SpringSecurityDemo.entities.User;
import com.tothenew.SpringSecurityDemo.repositories.EnumRepository;
import com.tothenew.SpringSecurityDemo.repositories.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Arrays;

@SpringBootTest
class SpringSecurityDemoApplicationTests {

	@Autowired
	EnumRepository enumRepository;
	@Autowired
	PasswordEncoder passwordEncoder;
	@Autowired
	UserRepository userRepository;
//	@Test
//	void contextLoads() {
//	}
	@Test
	void createUser()
	{
		enumRepository.save(Roles.ADMIN.getRole());
		enumRepository.save(Roles.USER.getRole());
	//	enumRepository.save(Roles.ADMIN);
		userRepository.save(new User("Utkarsh",passwordEncoder.encode("utkarsh"), Arrays.asList(Roles.ADMIN.getRole(),Roles.USER.getRole()),true,true,true,true));
		userRepository.save(new User("Devansh",passwordEncoder.encode("devansh"), Arrays.asList(Roles.USER.getRole()),true,true,true,true));
	}

}

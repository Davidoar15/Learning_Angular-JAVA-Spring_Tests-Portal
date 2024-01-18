package com.system.tests;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/* 
import java.util.HashSet;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import com.system.tests.entities.Rol;
import com.system.tests.entities.User;
import com.system.tests.entities.UserRol;
import com.system.tests.services.UserService;
*/

@SpringBootApplication
public class SystemTestsBackendApplication /*implements CommandLineRunner*/ {

	/* 
	@Autowired
	private UserService userService;
	*/

	public static void main(String[] args) {
		SpringApplication.run(SystemTestsBackendApplication.class, args);
	}

	/* 
	@Override
	public void run(String... args) throws Exception {
		User user = new User();

		user.setName("David");
		user.setLastName("Olivo");
		user.setUsername("davidoar15");
		user.setPassword("12345");
		user.setEmail("test@gmail.com");
		user.setCellPhone("123456789");
		user.setProfile("pfp.png");

		Rol rol = new Rol();
		rol.setRolId(1L);
		rol.setName("ADMIN");

		Set<UserRol> userRoles = new HashSet<>();
		UserRol userRol = new UserRol();
		userRol.setUser(user);
		userRol.setRol(rol);
		userRoles.add(userRol);

		User savedUser = userService.saveUser(user, userRoles);
		System.out.println(savedUser);
	}
	*/

}

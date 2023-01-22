package Examportal;

import Examportal.Entity.Role;
import Examportal.Entity.User;
import Examportal.Entity.UserRole;
import Examportal.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class ExamPortalApplication  implements CommandLineRunner {

	@Autowired
	private UserService userService;

	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	public static void main(String[] args) {
		SpringApplication.run(ExamPortalApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		System.out.println("starting code");

//		hmne yha pe user aur role liye h
//		jo bhi user aur role aarhe hai uske hmne ek userrole me connect kiya hai
//		 aur uss userrole ko ek set me add kiya hai jo ki userrole hai
//		User user = new User();
//		user.setUsername("raushan");
//		user.setFirstName("Raushan");
//		user.setLastName("Raj");
//		user.setEmail("Raushan@gmail.com");
//		user.setPhone("7779833016");
//		user.setProfile("default.png");
//		user.setPassword(this.bCryptPasswordEncoder.encode("abc"));
//
//		Role role = new Role();
//		role.setRoleId(44L);
//		role.setRoleName("Admin");
//		//hm ab user me userRole set krenge
//		Set<UserRole> user_roleSet = new HashSet<>();
//		UserRole userRole = new UserRole();
//		userRole.setUser(user);
//		userRole.setRole(role);
//		user_roleSet.add(userRole);
//
//       this.userService.Createuser(user,user_roleSet);

	}
}

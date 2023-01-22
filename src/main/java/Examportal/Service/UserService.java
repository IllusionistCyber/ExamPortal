package Examportal.Service;

import Examportal.Entity.User;
import Examportal.Entity.UserRole;

import java.util.Set;

public interface UserService {
    //yha pr hm user de rhe hai aur usko hm userRole ke set ko de rhe hai user role ke set me hme user ka role dena hai
    //user role containing Roles
   public User Createuser(User user, Set<UserRole> userRoles) throws Exception;
   public User GetByUserName(String UserName);
   public void DeleteById(Long userid);
   public User UpdateUser(User user);
}

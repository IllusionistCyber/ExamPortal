package com.Examportal.ExamPortal.Services.ServiceImplementations;

import com.Examportal.ExamPortal.Dao.Repo;
import com.Examportal.ExamPortal.Dao.RoleRepo;
import com.Examportal.ExamPortal.Entity.user;
import com.Examportal.ExamPortal.Entity.userRole;
import com.Examportal.ExamPortal.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public class userServiceImpl implements UserService {

    @Autowired
    private Repo userRepo;

    @Autowired
    private RoleRepo roleRepo;


    //creatingUser
    @Override
    public user createuser(user User, List<userRole> userRoles) throws  Exception{
       user local= this.userRepo.findByUserName(User.getUserName());
       if(local!=null){
          System.out.println("User Already Present");
          throw new Exception("User Already Present");
       }else{
          for (userRole ur:userRoles){
              this.roleRepo.save(ur.getRole());
          }
          User.getUserRoles().addAll(userRoles);
          local =this.userRepo.save(User);
       }
       return local;
    }
}

package Examportal.Service.Implementation;

import Examportal.Entity.User;
import Examportal.Entity.UserRole;
import Examportal.Repository.RoleRepository;
import Examportal.Repository.UserRepository;
import Examportal.Service.UserService;
import Examportal.helper.UserFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public class UserServiceImplementation implements UserService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RoleRepository roleRepository;

    @Override
    public User Createuser(User user, Set<UserRole> userRoles) throws Exception {
        //hm yha pe ye check krenge ki jo user aayega usse check krenge ki data base me toh koi nhi h us username ka koi

       User local = this.userRepository.findByUserName(user.getUsername());
       if(local!=null){
           System.out.println("user already present");
           throw new UserFoundException();
       }else{
           //hm yha user ka role nikalenge  userroles se jo aarha hai aur usko database me save krenge
           for(UserRole ur:userRoles){
               roleRepository.save(ur.getRole());
           }
           //hm ye jo roles aarhe hai inko save karane ke baad hm inko user ke ssaath link bhi krenge ki konsa role hai user ka
           user.getUserRoles().addAll(userRoles);
           local= this.userRepository.save(user);
       }
        return local;
    }

    @Override
    public User GetByUserName(String UserName) {
        User local=this.userRepository.findByUserName(UserName);
        if(local==null){
            System.out.println("user not found");
            return null;
        }else{
            return local;
        }
    }

    @Override
    public void DeleteById(Long userid) {
        System.out.println(userid+"Deleted Successfully");
      this.userRepository.deleteById(userid);
    }

    @Override
    public User UpdateUser(User user) {
        User localuser=this.userRepository.findByUserName(user.getUsername());
        localuser.setUsername(user.getUsername());
        localuser.setFirstName(user.getFirstName());
        localuser.setLastName(user.getLastName());
        localuser.setEmail(user.getEmail());
        localuser.setPhone(user.getPhone());
        localuser.setProfile(user.getProfile());
        localuser.setPassword(user.getPassword());
        return this.userRepository.save(localuser);
    }


}

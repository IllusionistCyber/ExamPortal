package com.Examportal.ExamPortal.Services;

import com.Examportal.ExamPortal.Entity.user;
import com.Examportal.ExamPortal.Entity.userRole;

import java.util.List;

public interface UserService {

    //creatinguser
    public user createuser(user User, List<userRole> userRoles) throws Exception, Exception;
}

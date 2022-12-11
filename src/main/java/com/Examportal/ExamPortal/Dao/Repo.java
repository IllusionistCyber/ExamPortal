package com.Examportal.ExamPortal.Dao;

import com.Examportal.ExamPortal.Entity.user;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repo extends JpaRepository<user,Long> {
    public user findByUserName(String userName);
}

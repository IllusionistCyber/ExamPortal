package com.Examportal.ExamPortal.Dao;

import com.Examportal.ExamPortal.Entity.roles;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepo extends JpaRepository<roles,Long> {
}

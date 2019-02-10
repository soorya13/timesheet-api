package com.enterprise.timesheetapi.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.enterprise.timesheetapi.model.User;

public interface UserRepo extends JpaRepository<User,Long> {
	
	public User findByEmailAndPassword(String email, String password);

}

package com.form.RegisterForm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.form.RegisterForm.entity.User;
import com.form.RegisterForm.repo.UserRepository;

@Service
public class UserServiceImpl implements UserService{

	
	@Autowired
	UserRepository userRepo;
	
	@Override
	public String saveUser(User user) {
		userRepo.save(user);
		return "User  "+user.getFullName()+" saved succesfully";
	}

}

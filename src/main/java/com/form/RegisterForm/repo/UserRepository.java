package com.form.RegisterForm.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.form.RegisterForm.entity.User;

public interface UserRepository extends MongoRepository<User, String> {

}

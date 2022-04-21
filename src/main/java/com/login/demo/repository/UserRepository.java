package com.login.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.login.demo.model.User;

@Repository
public interface UserRepository extends MongoRepository<User,Long>{
	
	public User findByEmail(String email);
	

}

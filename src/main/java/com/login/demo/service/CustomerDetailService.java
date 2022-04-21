package com.login.demo.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.login.demo.configration.CustomeUserDetail;
import com.login.demo.model.User;
import com.login.demo.repository.UserRepository;

public class CustomerDetailService implements UserDetailsService {

	private UserRepository userRepo;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user=userRepo.findByEmail(username);
		if(user==null) {
			throw new UsernameNotFoundException("User Not found");
		}
		return new CustomeUserDetail(user);
	}
	
}

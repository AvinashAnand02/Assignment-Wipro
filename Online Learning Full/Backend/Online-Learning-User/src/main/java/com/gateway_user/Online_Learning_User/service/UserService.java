package com.gateway_user.Online_Learning_User.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gateway_user.Online_Learning_User.model.Users;
import com.gateway_user.Online_Learning_User.repository.UserRepository;

@Service
public class UserService {
	
	private UserRepository repository;

	public UserService(UserRepository repository) {
		super();
		this.repository = repository;
	}
	 public Users createUser(Users user) {
	        return repository.save(user);
	    }

	    public List<Users> getAllUsers() {
	        return repository.findAll();
	    }

	    public Users getUserById(Long id) {
	        return repository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
	    }

	   
	    public Users updateUser(Long id, Users user) {
	        Users existing = getUserById(id);
	        existing.setName(user.getName());
	        existing.setEmail(user.getEmail());
	        existing.setPassword(user.getPassword());
	        existing.setRole(user.getRole());
	        return repository.save(existing);
	    }

	    public void deleteUser(Long id) {
	        repository.deleteById(id);
	    }
}

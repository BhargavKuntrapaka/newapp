package com.woodworld.furniture.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.woodworld.furniture.entity.Address;
import com.woodworld.furniture.entity.LoginDao;
import com.woodworld.furniture.entity.User;
import com.woodworld.furniture.entity.Address;
import com.woodworld.furniture.repository.UserRepository;

import antlr.collections.List;

@RestController
@CrossOrigin
public class UserController {
	@Autowired
	private UserRepository userRepo;	
	@PostMapping("/saveuser")
	public User saveUser(@RequestBody User user) {
		System.out.println(user);
		Address add = user.getAddress();
		add.setUser(user);
		return userRepo.save(user);
		
	}
	
	@GetMapping("/getalluser")
	public java.util.List<User> getAllUser() {
		return userRepo.findAll();		
	}
	
	@GetMapping("/getuser")
	public Optional<User> getUser(@RequestParam Long Id) {
		return userRepo.findById(Id);
	}
	
	@GetMapping("/login")
	public User login(@RequestBody LoginDao dao) {
			User user = userRepo.findOneByEmailIdIgnoreCaseAndPassword(dao.getEmailId(), dao.getPassword());
//		if (user == null) {
//			return null;
//		}
//		else {
//			return "user loge in";
//		}
			return user;
	}
	
	@DeleteMapping("/deleteuser")
	public void deleteUser(@RequestParam Long Id) {
		userRepo.deleteById(Id);
	}

	
}

package com.woodworld.furniture.repository;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.woodworld.furniture.entity.User;
@SpringBootTest
class UserRepositoryTest {

	@Autowired
	UserRepository userRepo;
	@Test
	void test() {
//		User user = new User("Bhargav","k");
//		userRepo.save(user);
	}

}

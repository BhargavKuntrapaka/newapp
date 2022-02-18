package com.woodworld.furniture.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.woodworld.furniture.entity.User;
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	User findOneByEmailIdIgnoreCaseAndPassword(String emailId, String password);

	
}

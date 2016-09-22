/**
 * 
 */
package com.easy.buy.admin.user.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.easy.buy.admin.user.dto.User;

/**
 * @author Sambaiah
 *
 */
public interface UserRepository extends MongoRepository<User, String> {
	public User findByEmail(String email);

	public List<User> findByStatus(String status);
}

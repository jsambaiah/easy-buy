/**
 * 
 */
package com.easy.buy.admin.user.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.easy.buy.admin.user.dto.User;
import com.easy.buy.admin.user.repository.UserRepository;

/**
 * @author Sambaiah
 *
 */
public class UserService {
	@Autowired
	private UserRepository userRepository;

	public User findByEmail(String email) {
		return userRepository.findByEmail(email);
	}

	public List<User> findByStatus(String status) {
		return userRepository.findByStatus(status);
	}
}

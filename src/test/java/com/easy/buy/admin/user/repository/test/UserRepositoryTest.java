/**
 * 
 */
package com.easy.buy.admin.user.repository.test;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.easy.buy.admin.user.dto.User;
import com.easy.buy.admin.user.repository.UserRepository;

/**
 * @author Sambaiah
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
public class UserRepositoryTest {
	@Autowired
	UserRepository userRepository;

	@Test
	public void findByEmail() {
		String email = "jsambasivarao@gmail.com";
		User user = userRepository.findByEmail(email);
		assertTrue("User is not found for Email : " + email, user == null);
	}

	@Test
	public void findByStatus() {
		String status = "A";
		List<User> users = userRepository.findByStatus(status);
		assertTrue("List of active users : " + users,
				(users != null && !users.isEmpty()));
	}
}

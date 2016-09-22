/**
 * 
 */
package com.easy.buy.admin.user.repository;

import java.util.List;

import javax.annotation.Resource;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.easy.buy.admin.user.dto.User;

/**
 * @author Sambaiah
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:ebuy-mongo-test-config.xml" })
public class UserRepositoryTest {
	@Resource
	UserRepository userRepository;

	@Before
	public void before() {
		userRepository.deleteAll();
	}

	@Test
	public void yourTest() {
		User u = new User();
		u.setEmail("jsambasivarao@gmail.com");
		u.setPassword("samba_123");
		u.setRole(new Integer(1));
		u.setStatus("A");
		userRepository.insert(u);
		User userByEmail = userRepository.findByEmail(u.getEmail());
		Assert.assertNotNull(userByEmail);
		List<User> usersByStatus = userRepository.findByStatus(u.getStatus());
		Assert.assertNotNull(usersByStatus);
	}

	@After
	public void after() {
		userRepository.deleteAll();
	}
}

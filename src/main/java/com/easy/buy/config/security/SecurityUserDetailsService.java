package com.easy.buy.config.security;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.easy.buy.admin.user.dto.User;
import com.easy.buy.admin.user.repository.UserRepository;

/**
 *
 * UserDetails service that reads the user credentials from the database, using
 * a JPA repository.
 *
 */
@Component
public class SecurityUserDetailsService implements UserDetailsService {
	private static final Logger LOGGER = Logger
			.getLogger(SecurityUserDetailsService.class);

	@Resource
	private UserRepository userRepository;

	public UserDetails loadUserByUsername(String email)
			throws UsernameNotFoundException {
		User user = userRepository.findByEmail(email);

		if (user == null) {
			String message = "Username not found" + email;
			LOGGER.info(message);
			throw new UsernameNotFoundException(message);
		}
		LOGGER.info("Found user in database: " + user);
		UserDetails udetails = new org.springframework.security.core.userdetails.User(
				email, user.getPassword(), getAuthorities(user.getRole()));

		return udetails;
	}

	private List<GrantedAuthority> getAuthorities(Integer role) {
		List<GrantedAuthority> authList = new ArrayList<GrantedAuthority>();
		if (role.intValue() == 1) {
			authList.add(new SimpleGrantedAuthority("ROLE_ADMIN"));

		} else if (role.intValue() == 2) {
			authList.add(new SimpleGrantedAuthority("ROLE_USER"));
		}
		LOGGER.info("Found user in database: " + authList);
		return authList;
	}
}

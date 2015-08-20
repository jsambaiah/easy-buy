/**
 * 
 */
package com.easy.buy.admin.user.repository;

import java.util.List;

import com.easy.buy.admin.user.dto.User;
import com.easy.buy.core.repository.BaseRepository;

/**
 * @author Sambaiah
 *
 */
public interface UserRepository extends BaseRepository<User, String> {
	public User findByEmail(String email);
	public List<User> findByStatus(String status);
}

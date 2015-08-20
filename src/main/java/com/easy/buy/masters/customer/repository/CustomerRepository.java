/**
 * 
 */
package com.easy.buy.masters.customer.repository;

import com.easy.buy.core.repository.BaseRepository;
import com.easy.buy.masters.customer.dto.Customer;

/**
 * @author Sambaiah
 *
 */
public interface CustomerRepository extends BaseRepository<Customer, String> {
	public Customer findByUserId(String userId);
}

/**
 * 
 */
package com.easy.buy.masters.customer.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.easy.buy.masters.customer.dto.Customer;
import com.easy.buy.masters.customer.repository.CustomerRepository;

/**
 * @author Sambaiah
 *
 */
public class CustomerService {
	@Autowired
	private CustomerRepository customerRepository;
	public Customer findByUserId(String userId) {
		return customerRepository.findByUserId(userId);
	}
}

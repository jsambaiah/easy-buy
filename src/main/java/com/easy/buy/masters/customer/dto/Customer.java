/**
 * 
 */
package com.easy.buy.masters.customer.dto;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import com.easy.buy.masters.customer.address.dto.Address;

/**
 * @author Sambaiah
 *
 */
@Document
public class Customer {
	@Id
	private String id;
	@Indexed
	private String userId;
	private String firstName;
	private String lastName;
	private String gender;
	@DBRef
	private Address address;

	public Customer() {
	}

	/**
	 * @param id
	 * @param firstName
	 * @param lastName
	 * @param gender
	 * @param address
	 */
	public Customer(String id, String userId, String firstName,
			String lastName, String gender, Address address) {
		super();
		this.id = id;
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.address = address;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * @param userId
	 *            the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName
	 *            the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName
	 *            the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * @param gender
	 *            the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}

	/**
	 * @param address
	 *            the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}

	public String toString() {
		return "User [id=" + id + ", userId=" + userId + ", firstName="
				+ firstName + ", lastName=" + lastName + ", gender=" + gender
				+ ", adress=" + address + "]";
	}

}

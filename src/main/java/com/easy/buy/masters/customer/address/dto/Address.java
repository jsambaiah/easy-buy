/**
 * 
 */
package com.easy.buy.masters.customer.address.dto;

import org.springframework.data.annotation.Id;

/**
 * @author Sambaiah
 *
 */
public class Address {
	@Id
	private String id;
	private String address;
	private String landlineNumber;
	private String phoneNumber;

	public Address() {
	}

	/**
	 * @param id
	 * @param address
	 * @param landlineNumber
	 * @param phoneNumber
	 */
	public Address(String id, String address, String landlineNumber,
			String phoneNumber) {
		super();
		this.id = id;
		this.address = address;
		this.landlineNumber = landlineNumber;
		this.phoneNumber = phoneNumber;
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
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address
	 *            the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the landlineNumber
	 */
	public String getLandlineNumber() {
		return landlineNumber;
	}

	/**
	 * @param landlineNumber
	 *            the landlineNumber to set
	 */
	public void setLandlineNumber(String landlineNumber) {
		this.landlineNumber = landlineNumber;
	}

	/**
	 * @return the phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * @param phoneNumber
	 *            the phoneNumber to set
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}

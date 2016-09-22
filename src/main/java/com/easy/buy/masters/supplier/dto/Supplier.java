package com.easy.buy.masters.supplier.dto;

import java.sql.Timestamp;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import com.easy.buy.masters.customer.address.dto.Address;


/**
 * @author Rajesh Sandadi
 *
 */
@Document
public class Supplier { 
	@Id
	@Indexed
	private String id; 	  
	private	String name;
	private	String regNo;
	@DBRef
	private Address address1;
	@DBRef
	private Address address2;
	private int cityId;
	private int stateId;
	private int countryId;
	private String phone;
	private String faxNo;
	private String contactPersName;
	private String contactPersPhone;
	private String contactPersMobile;
	private String contactPersEmail;
	private Timestamp createdDate;
	private String createdBy;
	private Timestamp modifiedDate;
	private String modifiedBy;
	private char active;
	
	
	public Supplier(String id, String name, String regNo, Address address1,
			Address address2, int cityId, int stateId, int countryId,
			String phone, String faxNo, String contactPersName,
			String contactPersPhone, String contactPersMobile,
			String contactPersEmail, Timestamp createdDate, String createdBy,
			Timestamp modifiedDate, String modifiedBy, char active, char type) {
		super();
		this.id = id;
		this.name = name;
		this.regNo = regNo;
		this.address1 = address1;
		this.address2 = address2;
		this.cityId = cityId;
		this.stateId = stateId;
		this.countryId = countryId;
		this.phone = phone;
		this.faxNo = faxNo;
		this.contactPersName = contactPersName;
		this.contactPersPhone = contactPersPhone;
		this.contactPersMobile = contactPersMobile;
		this.contactPersEmail = contactPersEmail;
		this.createdDate = createdDate;
		this.createdBy = createdBy;
		this.modifiedDate = modifiedDate;
		this.modifiedBy = modifiedBy;
		this.active = active;
		this.type = type;
	}
	public String getRegNo() {
		return regNo;
	}
	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}
	public Address getAddress1() {
		return address1;
	}
	public void setAddress1(Address address1) {
		this.address1 = address1;
	}
	public Address getAddress2() {
		return address2;
	}
	public void setAddress2(Address address2) {
		this.address2 = address2;
	}
	public int getCityId() {
		return cityId;
	}
	public void setCityId(int cityId) {
		this.cityId = cityId;
	}
	public int getStateId() {
		return stateId;
	}
	public void setStateId(int stateId) {
		this.stateId = stateId;
	}
	public int getCountryId() {
		return countryId;
	}
	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getFaxNo() {
		return faxNo;
	}
	public void setFaxNo(String faxNo) {
		this.faxNo = faxNo;
	}
	public String getContactPersName() {
		return contactPersName;
	}
	public void setContactPersName(String contactPersName) {
		this.contactPersName = contactPersName;
	}
	public String getContactPersPhone() {
		return contactPersPhone;
	}
	public void setContactPersPhone(String contactPersPhone) {
		this.contactPersPhone = contactPersPhone;
	}
	public String getContactPersMobile() {
		return contactPersMobile;
	}
	public void setContactPersMobile(String contactPersMobile) {
		this.contactPersMobile = contactPersMobile;
	}
	public String getContactPersEmail() {
		return contactPersEmail;
	}
	public void setContactPersEmail(String contactPersEmail) {
		this.contactPersEmail = contactPersEmail;
	}
	public Timestamp getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public Timestamp getModifiedDate() {
		return modifiedDate;
	}
	public void setModifiedDate(Timestamp modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	public String getModifiedBy() {
		return modifiedBy;
	}
	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
	public char getActive() {
		return active;
	}
	public void setActive(char active) {
		this.active = active;
	}
	private char type;
	public String getId( ) {
		return id;
	}
	public char getType() {
		return type;
	}
	public void setType(char type) {
		this.type = type;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}

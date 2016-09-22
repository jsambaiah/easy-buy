package com.easy.buy.masters.customer.dto;
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
public class CustomerComminication {
	@Id
	@Indexed
	private String id; 	
	private int belongTo;
	public String getId() {
		return id;
	}
	public CustomerComminication(String id, int belongTo, int cityId,
			int stateId, int countryId, String emailId, String mobile,
			String work, String homePhone, Timestamp createdDate,
			String createdBy, Timestamp modifiedDate, String modifiedBy,
			Address address1, Address address2) {
		super();
		this.id = id;
		this.belongTo = belongTo;
		CityId = cityId;
		this.stateId = stateId;
		this.countryId = countryId;
		this.emailId = emailId;
		this.mobile = mobile;
		this.work = work;
		this.homePhone = homePhone;
		this.createdDate = createdDate;
		this.createdBy = createdBy;
		this.modifiedDate = modifiedDate;
		this.modifiedBy = modifiedBy;
		this.address1 = address1;
		this.address2 = address2;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getBelongTo() {
		return belongTo;
	}
	public void setBelongTo(int belongTo) {
		this.belongTo = belongTo;
	}
	public int getCityId() {
		return CityId;
	}
	public void setCityId(int cityId) {
		CityId = cityId;
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
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getWork() {
		return work;
	}
	public void setWork(String work) {
		this.work = work;
	}
	public String getHomePhone() {
		return homePhone;
	}
	public void setHomePhone(String homePhone) {
		this.homePhone = homePhone;
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
	private int CityId;
	private int stateId;
	private int countryId;
	private String emailId;
	private String mobile;
	private String work;
	private String homePhone;	
	private Timestamp createdDate;
	private String createdBy;
	private Timestamp modifiedDate;
	private String modifiedBy;
	@DBRef
	private Address address1;
	@DBRef
	private Address address2;
	
	
	
}
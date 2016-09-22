package com.easy.buy.masters.product.item.dto;

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
public class Item { 
	public Item(String id, String name, String itemCode, String itemImage,
			int cityId, int stateId, int countryId, String unit, String weight,
			String description, String category, String companyId,
			int threshold, Timestamp createdDate, String createdBy,
			Timestamp modifiedDate, String modifiedBy, char active) {
		super();
		this.id = id;
		this.name = name;
		this.itemCode = itemCode;
		this.itemImage = itemImage;
		this.cityId = cityId;
		this.stateId = stateId;
		this.countryId = countryId;
		this.unit = unit;
		this.weight = weight;
		this.description = description;
		this.category = category;
		this.companyId = companyId;
		this.threshold = threshold;
		this.createdDate = createdDate;
		this.createdBy = createdBy;
		this.modifiedDate = modifiedDate;
		this.modifiedBy = modifiedBy;
		this.active = active;
	}
	@Id
	@Indexed
	private String id; 	  
	private	String name;
	private	String itemCode;
	private String itemImage;
	public String getItemImage() {
		return itemImage;
	}
	public void setItemImage(String itemImage) {
		this.itemImage = itemImage;
	}
	private int cityId;
	private int stateId;
	private int countryId;
	private String unit;
	private String weight;
	private String description;
	private String category;
	private String companyId;
	private int threshold;
	private Timestamp createdDate;
	private String createdBy;
	private Timestamp modifiedDate;
	private String modifiedBy;
	private char active;
	public String getId() {
		return id;
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
	public String getItemCode() {
		return itemCode;
	}
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
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
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getCompanyId() {
		return companyId;
	}
	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}
	public int getThreshold() {
		return threshold;
	}
	public void setThreshold(int threshold) {
		this.threshold = threshold;
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
	public Item(String id, String name, String itemCode, int cityId,
			int stateId, int countryId, String unit, String weight,
			String description, String category, String companyId,
			int threshold, Timestamp createdDate, String createdBy,
			Timestamp modifiedDate, String modifiedBy, char active) {
		super();
		this.id = id;
		this.name = name;
		this.itemCode = itemCode;
		this.cityId = cityId;
		this.stateId = stateId;
		this.countryId = countryId;
		this.unit = unit;
		this.weight = weight;
		this.description = description;
		this.category = category;
		this.companyId = companyId;
		this.threshold = threshold;
		this.createdDate = createdDate;
		this.createdBy = createdBy;
		this.modifiedDate = modifiedDate;
		this.modifiedBy = modifiedBy;
		this.active = active;
	}
	
	
	

}

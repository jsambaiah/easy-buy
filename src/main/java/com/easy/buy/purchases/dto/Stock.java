/**
 * 
 */
package com.easy.buy.purchases.dto;

import java.sql.Timestamp;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;

/**
 * @author Sambaiah
 *
 */
public class Stock
{
	@Id
	@Indexed
	private String id; 	  
	private	int invoiceId;
	private String itemCode;
	private int warehouseId;
	private int quantity;
	private float price;
	private float mrp;
	private float minPrice;
	private float maxPrice;
	private float total;
	private Timestamp pkdDate;
	private Timestamp expDate;
	private Timestamp invoiceDate;
	private Timestamp createdDate;
	private String createdBy;
	private Timestamp modifiedDate;
	private String modifiedBy;
	public Stock(String id, int invoiceId, String itemCode, int warehouseId,
			int quantity, float price, float mrp, float minPrice,
			float maxPrice, float total, Timestamp pkdDate, Timestamp expDate,
			Timestamp invoiceDate, Timestamp createdDate, String createdBy,
			Timestamp modifiedDate, String modifiedBy) {
		super();
		this.id = id;
		this.invoiceId = invoiceId;
		this.itemCode = itemCode;
		this.warehouseId = warehouseId;
		this.quantity = quantity;
		this.price = price;
		this.mrp = mrp;
		this.minPrice = minPrice;
		this.maxPrice = maxPrice;
		this.total = total;
		this.pkdDate = pkdDate;
		this.expDate = expDate;
		this.invoiceDate = invoiceDate;
		this.createdDate = createdDate;
		this.createdBy = createdBy;
		this.modifiedDate = modifiedDate;
		this.modifiedBy = modifiedBy;
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
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getInvoiceId() {
		return invoiceId;
	}
	public void setInvoiceId(int invoiceId) {
		this.invoiceId = invoiceId;
	}
	public String getItemCode() {
		return itemCode;
	}
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}
	public int getWarehouseId() {
		return warehouseId;
	}
	public void setWarehouseId(int warehouseId) {
		this.warehouseId = warehouseId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public float getMrp() {
		return mrp;
	}
	public void setMrp(float mrp) {
		this.mrp = mrp;
	}
	public float getMinPrice() {
		return minPrice;
	}
	public void setMinPrice(float minPrice) {
		this.minPrice = minPrice;
	}
	public float getMaxPrice() {
		return maxPrice;
	}
	public void setMaxPrice(float maxPrice) {
		this.maxPrice = maxPrice;
	}
	public float getTotal() {
		return total;
	}
	public void setTotal(float total) {
		this.total = total;
	}
	public Timestamp getPkdDate() {
		return pkdDate;
	}
	public void setPkdDate(Timestamp pkdDate) {
		this.pkdDate = pkdDate;
	}
	public Timestamp getExpDate() {
		return expDate;
	}
	public void setExpDate(Timestamp expDate) {
		this.expDate = expDate;
	}
	public Timestamp getInvoiceDate() {
		return invoiceDate;
	}
	public void setInvoiceDate(Timestamp invoiceDate) {
		this.invoiceDate = invoiceDate;
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
	
	
}

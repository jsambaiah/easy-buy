/**
 * 
 */
package com.easy.buy.sale.dto;

import java.sql.Timestamp;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;

/**
 * @author Sambaiah
 *
 */
public class SaleItems
{
	@Id
	@Indexed
	private String id; 	  
	private	int saleId;
	private int stockId;
	private String itemCode;
	private String batchNumber;	
	private Timestamp createdDate;
	private String createdBy;
	private int quantity;
	private char status;
	private float mrp;
	private float price;
	private Timestamp paymentDueDate;		
	public SaleItems(String id, int saleId, int stockId, String itemCode,
			String batchNumber, Timestamp createdDate, String createdBy,
			int quantity, char status, float mrp, float price,
			Timestamp paymentDueDate, Timestamp modifiedDate, String modifiedBy) {
		super();
		this.id = id;
		this.saleId = saleId;
		this.stockId = stockId;
		this.itemCode = itemCode;
		this.batchNumber = batchNumber;
		this.createdDate = createdDate;
		this.createdBy = createdBy;
		this.quantity = quantity;
		this.status = status;
		this.mrp = mrp;
		this.price = price;
		this.paymentDueDate = paymentDueDate;
		this.modifiedDate = modifiedDate;
		this.modifiedBy = modifiedBy;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getSaleId() {
		return saleId;
	}
	public void setSaleId(int saleId) {
		this.saleId = saleId;
	}
	public int getStockId() {
		return stockId;
	}
	public void setStockId(int stockId) {
		this.stockId = stockId;
	}
	public String getItemCode() {
		return itemCode;
	}
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}
	public String getBatchNumber() {
		return batchNumber;
	}
	public void setBatchNumber(String batchNumber) {
		this.batchNumber = batchNumber;
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
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public char getStatus() {
		return status;
	}
	public void setStatus(char status) {
		this.status = status;
	}
	public float getMrp() {
		return mrp;
	}
	public void setMrp(float mrp) {
		this.mrp = mrp;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public Timestamp getPaymentDueDate() {
		return paymentDueDate;
	}
	public void setPaymentDueDate(Timestamp paymentDueDate) {
		this.paymentDueDate = paymentDueDate;
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
	private Timestamp modifiedDate;
	private String modifiedBy;	
}

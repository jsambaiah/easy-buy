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
public class Sale
{
	@Id
	@Indexed
	private String id; 	  
	private	int customerId;
	private String billNumber;	
	private Timestamp saleDate;
	private Timestamp expDate;
	private Timestamp invoiceDate;
	private char type;
	private char status;
	private Timestamp createdDate;
	private Timestamp paymentDueDate;
	private String createdBy;
	private Timestamp modifiedDate;
	private String modifiedBy;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getBillNumber() {
		return billNumber;
	}
	public void setBillNumber(String billNumber) {
		this.billNumber = billNumber;
	}
	public Timestamp getSaleDate() {
		return saleDate;
	}
	public void setSaleDate(Timestamp saleDate) {
		this.saleDate = saleDate;
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
	public char getType() {
		return type;
	}
	public void setType(char type) {
		this.type = type;
	}
	public char getStatus() {
		return status;
	}
	public void setStatus(char status) {
		this.status = status;
	}
	public Timestamp getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}
	public Timestamp getPaymentDueDate() {
		return paymentDueDate;
	}
	public void setPaymentDueDate(Timestamp paymentDueDate) {
		this.paymentDueDate = paymentDueDate;
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
	public Sale(String id, int customerId, String billNumber,
			Timestamp saleDate, Timestamp expDate, Timestamp invoiceDate,
			char type, char status, Timestamp createdDate,
			Timestamp paymentDueDate, String createdBy, Timestamp modifiedDate,
			String modifiedBy) {
		super();
		this.id = id;
		this.customerId = customerId;
		this.billNumber = billNumber;
		this.saleDate = saleDate;
		this.expDate = expDate;
		this.invoiceDate = invoiceDate;
		this.type = type;
		this.status = status;
		this.createdDate = createdDate;
		this.paymentDueDate = paymentDueDate;
		this.createdBy = createdBy;
		this.modifiedDate = modifiedDate;
		this.modifiedBy = modifiedBy;
	}
	
}

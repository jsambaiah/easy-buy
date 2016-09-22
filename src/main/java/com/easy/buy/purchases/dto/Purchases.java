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
public class Purchases
{
	@Id
	@Indexed
	private String id; 	  
	private	int supplierId;
	private int companyId;
	private String invoiceNumber;
	private Timestamp invoiceDate;
	private Timestamp createdDate;
	private String createdBy;
	private char type;
	private char status;
	private float amount;
	private Timestamp paymentDueDate;	
	public Purchases(String id, int supplierId, int companyId,
			String invoiceNumber, Timestamp invoiceDate, Timestamp createdDate,
			String createdBy, char type, char status, float amount,
			Timestamp paymentDueDate, Timestamp modifiedDate,
			String modifiedBy, int action) {
		super();
		this.id = id;
		this.supplierId = supplierId;
		this.companyId = companyId;
		this.invoiceNumber = invoiceNumber;
		this.invoiceDate = invoiceDate;
		this.createdDate = createdDate;
		this.createdBy = createdBy;
		this.type = type;
		this.status = status;
		this.amount = amount;
		this.paymentDueDate = paymentDueDate;
		this.modifiedDate = modifiedDate;
		this.modifiedBy = modifiedBy;
		this.action = action;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getSupplierId() {
		return supplierId;
	}
	public void setSupplierId(int supplierId) {
		this.supplierId = supplierId;
	}
	public int getCompanyId() {
		return companyId;
	}
	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}
	public String getInvoiceNumber() {
		return invoiceNumber;
	}
	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
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
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
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
	public int getAction() {
		return action;
	}
	public void setAction(int action) {
		this.action = action;
	}
	private Timestamp modifiedDate;
	private String modifiedBy;
	private int action;
}

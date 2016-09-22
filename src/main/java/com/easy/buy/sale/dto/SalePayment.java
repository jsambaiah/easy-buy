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
public class SalePayment
{
	@Id
	@Indexed
	private String id; 	  
	private	int saleId;
	private char modeOfPayment;
	private int expenseId;	
	private float paymentAmount;
	private String paymentReference;
	private Timestamp paymentDate;
	private String paymentRemarks;
	private Timestamp createdDate;
	private String createdBy;
	private Timestamp modifiedDate;
	private String modifiedBy;
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
	public char getModeOfPayment() {
		return modeOfPayment;
	}
	public void setModeOfPayment(char modeOfPayment) {
		this.modeOfPayment = modeOfPayment;
	}
	public int getExpenseId() {
		return expenseId;
	}
	public void setExpenseId(int expenseId) {
		this.expenseId = expenseId;
	}
	public float getPaymentAmount() {
		return paymentAmount;
	}
	public void setPaymentAmount(float paymentAmount) {
		this.paymentAmount = paymentAmount;
	}
	public String getPaymentReference() {
		return paymentReference;
	}
	public void setPaymentReference(String paymentReference) {
		this.paymentReference = paymentReference;
	}
	public Timestamp getPaymentDate() {
		return paymentDate;
	}
	public void setPaymentDate(Timestamp paymentDate) {
		this.paymentDate = paymentDate;
	}
	public String getPaymentRemarks() {
		return paymentRemarks;
	}
	public void setPaymentRemarks(String paymentRemarks) {
		this.paymentRemarks = paymentRemarks;
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
	public SalePayment(String id, int saleId, char modeOfPayment,
			int expenseId, float paymentAmount, String paymentReference,
			Timestamp paymentDate, String paymentRemarks,
			Timestamp createdDate, String createdBy, Timestamp modifiedDate,
			String modifiedBy) {
		super();
		this.id = id;
		this.saleId = saleId;
		this.modeOfPayment = modeOfPayment;
		this.expenseId = expenseId;
		this.paymentAmount = paymentAmount;
		this.paymentReference = paymentReference;
		this.paymentDate = paymentDate;
		this.paymentRemarks = paymentRemarks;
		this.createdDate = createdDate;
		this.createdBy = createdBy;
		this.modifiedDate = modifiedDate;
		this.modifiedBy = modifiedBy;
	}
	
}

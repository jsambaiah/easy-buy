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
public class SaleExpenses
{
	@Id
	@Indexed
	private String id; 	  
	private	int saleId;
	private	int expenseId;
	private String expenseRemarks;	
	private float expenseAmount;	
	private Timestamp expenseDate;	
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
	public int getExpenseId() {
		return expenseId;
	}
	public void setExpenseId(int expenseId) {
		this.expenseId = expenseId;
	}
	public String getExpenseRemarks() {
		return expenseRemarks;
	}
	public void setExpenseRemarks(String expenseRemarks) {
		this.expenseRemarks = expenseRemarks;
	}
	public float getExpenseAmount() {
		return expenseAmount;
	}
	public void setExpenseAmount(float expenseAmount) {
		this.expenseAmount = expenseAmount;
	}
	public Timestamp getExpenseDate() {
		return expenseDate;
	}
	public void setExpenseDate(Timestamp expenseDate) {
		this.expenseDate = expenseDate;
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
	public SaleExpenses(String id, int saleId, int expenseId,
			String expenseRemarks, float expenseAmount, Timestamp expenseDate,
			Timestamp createdDate, String createdBy, Timestamp modifiedDate,
			String modifiedBy) {
		super();
		this.id = id;
		this.saleId = saleId;
		this.expenseId = expenseId;
		this.expenseRemarks = expenseRemarks;
		this.expenseAmount = expenseAmount;
		this.expenseDate = expenseDate;
		this.createdDate = createdDate;
		this.createdBy = createdBy;
		this.modifiedDate = modifiedDate;
		this.modifiedBy = modifiedBy;
	}
	
	
}

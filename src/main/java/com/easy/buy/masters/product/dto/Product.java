/**
 * 
 */
package com.easy.buy.masters.product.dto;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import com.easy.buy.masters.customer.address.dto.Address;

/**
 * @author Rajesh
 *
 */
@Document
public class Product {
	@Id
	private String id;
	@Indexed
	private int prdouctId;
	private String productName;	
	private boolean active;
	private String productimagePath;
	public int getPrdouctId() {
		return prdouctId;
	}

	public void setPrdouctId(int prdouctId) {
		this.prdouctId = prdouctId;
	}

	public String getProductimagePath() {
		return productimagePath;
	}

	public void setProductimagePath(String productimagePath) {
		this.productimagePath = productimagePath;
	}

	public char getProductType() {
		return productType;
	}

	public void setProductType(char productType) {
		this.productType = productType;
	}

	private char productType;
	
	public Product() {
	}

	/**
	 * @param id
	 * @param prdouctId
	 * @param productName
	 * @param active	 
	 * @param productimagePath
	 * @param productType 
	 */
	public Product(String id, int prdouctId, String productName,
			boolean active, String productimagePath,char productType) {
		super();
		this.id = id;
		this.prdouctId = prdouctId;
		this.productName = productName;
		this.active = active;
		this.productimagePath = productimagePath;
		this.productType = productType;
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
	 * @return the userId
	 */
	public int getProductId() {
		return prdouctId;
	}

	/**
	 * @param productId
	 *            the productId to set
	 */
	public void setProductId(int productId) {
		this.prdouctId = productId;
	}

	/**
	 * @return the productName
	 */
	public String getProductName() {
		return productName;
	}

	/**	 
	 * @param productName
	 *            the productName to set
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}

	/**
	 * @return the active
	 */
	public Boolean getActive() {
		return active;
	}

	/**
	 * @param active
	 *            the active to set
	 */
	public void setActive(boolean active) {
		this.active = active;
	}

	/**
	 * @return the productImagePath
	 */
	public String getproductImagePath() {
		return productimagePath;
	}

	/**
	 * @param productimagePath
	 *            the productimagePath to set
	 */
	public void setproductimagePath(String productimagePath) {
		this.productimagePath = productimagePath;
	}

	/**
	 * @return the productType
	 */
	public char getproductType() {
		return productType;
	}

	/**
	 * @param productType
	 *            the productType to set
	 */
	public void setproductType(char productType) {
		this.productType = productType;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", prdouctId=" + prdouctId
				+ ", productName=" + productName + ", active=" + active
				+ ", productimagePath=" + productimagePath + ", productType="
				+ productType + "]";
	}

	

}

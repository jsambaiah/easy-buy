package com.easy.buy.accounting.dto;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;


/**
 * @author Rajesh Sandadi
 *
 */
@Document
public class Expense { 
	@Id
	@Indexed
	private String id; 	  
	private	String name;
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

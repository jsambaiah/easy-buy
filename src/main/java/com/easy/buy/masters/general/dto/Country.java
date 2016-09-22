package com.easy.buy.masters.general.dto;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;


/**
 * @author Rajesh Sandadi
 *
 */
@Document
public class Country {
	@Id
	@Indexed 
	private String id; 	
	private String name;
	public State getState() {
		return state;
	}
	public void setState(State state) {
		this.state = state;
	}
	private State state;
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

}

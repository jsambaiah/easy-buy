/**
 * 
 */
package com.easy.buy.admin.user.dto;

import java.util.Calendar;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author Sambaiah
 *
 */
@Document
public class User {
	@Id
	private String id;
	private String password;
	@Indexed
	private String email;
	private String status;// A - Active, B - Blocked, I - In Active
	private Calendar lastAccessTime;
	private String captcha;
	private byte failedAttempts;
	private Integer role;

	public User() {
	}

	/**
	 * @param id
	 * @param password
	 * @param email
	 */
	public User(String id, String password, String email) {
		super();
		this.id = id;
		this.password = password;
		this.email = email;
	}

	/**
	 * @param id
	 * @param password
	 * @param email
	 * @param status
	 * @param lastAccessTime
	 * @param captcha
	 * @param failedAttempts
	 */
	public User(String id, String password, String email, String status,
			Calendar lastAccessTime, String captcha, byte failedAttempts) {
		this(id, password, email);
		this.status = status;
		this.lastAccessTime = lastAccessTime;
		this.captcha = captcha;
		this.failedAttempts = failedAttempts;
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
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the lastAccessTime
	 */
	public Calendar getLastAccessTime() {
		return lastAccessTime;
	}

	/**
	 * @param lastAccessTime
	 *            the lastAccessTime to set
	 */
	public void setLastAccessTime(Calendar lastAccessTime) {
		this.lastAccessTime = lastAccessTime;
	}

	/**
	 * @return the captcha
	 */
	public String getCaptcha() {
		return captcha;
	}

	/**
	 * @param captcha
	 *            the captcha to set
	 */
	public void setCaptcha(String captcha) {
		this.captcha = captcha;
	}

	/**
	 * @return the failedAttempts
	 */
	public byte getFailedAttempts() {
		return failedAttempts;
	}

	/**
	 * @param failedAttempts
	 *            the failedAttempts to set
	 */
	public void setFailedAttempts(byte failedAttempts) {
		this.failedAttempts = failedAttempts;
	}

	/**
	 * @return the role
	 */
	public Integer getRole() {
		return role;
	}

	/**
	 * @param role
	 *            the role to set
	 */
	public void setRole(Integer role) {
		this.role = role;
	}

	public String toString() {
		return "User [id=" + id + ", email=" + email + ", status=" + status
				+ ", lastAccessTime=" + lastAccessTime + ", captcha=" + captcha
				+ ", failedAttempts=" + failedAttempts + ", role=" + role + "]";
	}

}

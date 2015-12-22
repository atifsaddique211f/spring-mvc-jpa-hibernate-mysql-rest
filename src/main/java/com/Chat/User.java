/**
 * 
 */
package com.Chat;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author atif
 *
 */

@Entity
@Table(name = "T_Users")
public class User implements Serializable {

	/**
	 *  serial version uid
	 *  
	 */
	private static final long serialVersionUID = -3393866699730826791L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "username")
	private String username;

	@Column(name = "password")
	private String password;

	public User(){
		this.username="";
		this.password="";
	}
	
	public User(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString(){
		return "{username : "+username+"  password:"+password+"}";
		
	}
}

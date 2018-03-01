package com.learn.pf;

import java.io.Serializable;

public class UserView implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -190749943263119856L;

	private String firstname;
	private String lastname;

	public UserView() {
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

}

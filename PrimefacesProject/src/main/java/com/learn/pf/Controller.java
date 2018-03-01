package com.learn.pf;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

public class Controller implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4136412000733753871L;
	
	
	public UserView userView;

	public void showData() {
		System.out.println("aa " + getUserView().getFirstname());
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("You did it " + getUserView().getFirstname() + " " + getUserView().getLastname()));
		// userView.getFirstname();
	}

	public void save() {
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Welcome " + getUserView().getFirstname() + " " + getUserView().getLastname()));
	}
	
	public UserView getUserView() {
		return userView;
	}

	public void setUserView(UserView userView) {
		this.userView = userView;
	}

}

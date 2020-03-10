package model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User implements Serializable{
	
	@Id
	private String login;
	private String mdp;
	
	public User() {
	}

	public User(String login, String mdp) {
		this.login = login;
		this.mdp = mdp;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getMdp() {
		return mdp;
	}

	public void setMdp(String mdp) {
		this.mdp = mdp;
	}

	public String toString() {
		return "User [login=" + login + ", mdp=" + mdp + "]";
	}
	
	

}

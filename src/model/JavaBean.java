package model;

import javax.faces.bean.ManagedBean;

//classe est g�rer par le servlet faces
@ManagedBean (name="objet")
public class JavaBean {

	private String message = "Bonjour JSF";

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
}

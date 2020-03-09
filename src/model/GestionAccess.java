package model;

import javax.faces.bean.ManagedBean;

import dao.IUserDAO;
import dao.UserDAO;

@ManagedBean(name="ga")
public class GestionAccess {
	private User user = new User();
	private IUserDAO dao = new UserDAO();
	
	public String ajoutUser() {
		dao.saveUser(user);
		return "open";
	}
	
	public String verif() {
		if(dao.getTheUser(user)==true) {
			return "index";
		}
		return "error";
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public IUserDAO getDao() {
		return dao;
	}

	public void setDao(IUserDAO dao) {
		this.dao = dao;
	}

	
}

package model;

import javax.faces.bean.ManagedBean;

import dao.IMarqueDao;
import dao.MarqueDao;

@ManagedBean(name="gm")
public class GestionMarque {
	
	Marque marque = new Marque();
	IMarqueDao dao = new MarqueDao();
	
	public String ajoutMarque() {
		dao.saveMarque(marque);
		return "index";
	}

	public Marque getMarque() {
		return marque;
	}

	public void setMarque(Marque marque) {
		this.marque = marque;
	}

	public IMarqueDao getDao() {
		return dao;
	}

	public void setDao(IMarqueDao dao) {
		this.dao = dao;
	}

	
}

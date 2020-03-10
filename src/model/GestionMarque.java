package model;

import java.util.List;

import javax.faces.bean.ManagedBean;

import dao.IMarqueDao;
import dao.MarqueDao;

@ManagedBean(name="gm")
public class GestionMarque {
	
	private Marque marque = new Marque();
	private IMarqueDao dao = new MarqueDao();
	
	public GestionMarque() {
	}
	
	public Marque getMarque() {
		return marque;
	}

	public void setMarque(Marque marque) {
		this.marque = marque;
	}

	public String ajoutMarque() {
		dao.saveMarque(marque);
		return "listmarque";
	}
	
	public List<Marque> getListMarque(){
		return dao.getMarques();
	}

	

	
}

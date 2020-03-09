package model;

import javax.faces.bean.ManagedBean;
import dao.IProduitDao;
import dao.ProduitDao;

@ManagedBean(name="gp")
public class GestionProduit {
	
	private Produit produit = new Produit();
	private IProduitDao dao = new ProduitDao();
	
	public String ajoutProduit() {
		dao.saveProduit(produit);
		return "index";
	}

	public Produit getProduit() {
		return produit;
	}

	public void setProduit(Produit produit) {
		this.produit = produit;
	}

	public IProduitDao getDao() {
		return dao;
	}

	public void setDao(IProduitDao dao) {
		this.dao = dao;
	}

}

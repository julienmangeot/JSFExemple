package model;

import java.util.List;

import javax.faces.bean.ManagedBean;
import dao.IProduitDao;
import dao.ProduitDao;

@ManagedBean(name="gp")
public class GestionProduit {
	
	private Produit produit = new Produit();
	private IProduitDao dao = new ProduitDao();
	private Marque marque = new Marque();

	
	public GestionProduit() {
	}

	public String ajoutProduit() {
		produit.setMarque(marque);
		dao.saveProduit(produit);
		
		return "listproduit";
	}

	public List<Produit> getListProduit(){
		return dao.getProduits();
	}

	public List<Produit> getListProduits(){

		return dao.getProduits(marque);
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

	public Marque getMarque() {
		return marque;
	}

	public void setMarque(Marque marque) {
		this.marque = marque;
	}

	
}

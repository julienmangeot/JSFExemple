package model;

import java.util.List;

import javax.faces.bean.ManagedBean;
import dao.IProduitDao;
import dao.ProduitDao;

@ManagedBean(name="gp")
public class GestionProduit {
	
	private Produit produit = new Produit();
	private IProduitDao dao = new ProduitDao();
	
	public GestionProduit() {
	}

	public String ajoutProduit() {
		dao.saveProduit(produit);
		return "listproduit";
	}

	public List<Produit> getListProduit(){
		return dao.getProduits();
	}
//
//	public List<Produit> getListProduit(Marque marque){
//		return dao.getProduits(marque);
//	}
	
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

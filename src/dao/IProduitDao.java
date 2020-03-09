package dao;

import java.util.List;

import model.Marque;
import model.Produit;

public interface IProduitDao {
	
	public boolean saveProduit(Produit produit);
	
	public List<Produit> getProduits();
	
	public List<Produit> getProduits(Marque marque);

}

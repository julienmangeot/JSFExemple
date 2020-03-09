package dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import model.Produit;

public class ProduitDao implements IProduitDao{

	public boolean saveProduit(Produit produit) {
		try {
		SessionFactory factory = ConnectionDB.getInstance().getFactory();
		Session s=ConnectionDB.getInstance().getS();
		
		s.beginTransaction();
		s.save(produit);
		s.getTransaction().commit();
		
		System.out.println("Produit saving succeded");
		return true;
		}
		catch(HibernateException e) {
			e.printStackTrace();
			System.out.println("Produit saving failed");
			return false;
		}
	}

}

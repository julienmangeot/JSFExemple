package dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import model.Marque;
import model.Produit;

public class ProduitDao implements IProduitDao{
	
	private SessionFactory factory = ConnectionDB.getInstance().getFactory();


	public boolean saveProduit(Produit produit) {
		try {
			Session s=factory.openSession();
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

	
	public List<Produit> getProduits() {
		List<Produit> list = new ArrayList<Produit>();
		try {
			Session s=factory.openSession();
			s.beginTransaction();
			Query query = s.createQuery("from Produit");
			list=query.list();
			
			System.out.println("Produit display succeded");
			return list;
			}
			catch(HibernateException e) {
				e.printStackTrace();
				System.out.println("Produit display failed");
				return null;
			}
	}

	
	public List<Produit> getProduits(Marque marque) {
		List<Produit> list = new ArrayList<Produit>();
		try {
			Session s=factory.openSession();
			s.beginTransaction();
			Query query = s.createQuery("from Produit where marque.idMarque= :idMarque");
			query.setParameter("idMarque", marque.getIdMarque());
			list=query.list();
			
			System.out.println("Produit display with Marque succeded");
			return list;
			}
			catch(HibernateException e) {
				e.printStackTrace();
				System.out.println("Produit display with Marque failed");
				return null;
			}
	}

}

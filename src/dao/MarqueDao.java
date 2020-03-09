package dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import model.Marque;

public class MarqueDao implements IMarqueDao{
	private SessionFactory factory = ConnectionDB.getInstance().getFactory();
	
	public boolean saveMarque(Marque marque) {
		try {
			Session s=factory.openSession();
			s.beginTransaction();
			s.save(marque);
			s.getTransaction().commit();
			
			System.out.println("Marque saving succeded");
			return true;
		} 
		catch (HibernateException e) {
			e.printStackTrace();
			System.out.println("Marque saving failed");
			return false;
		}
	}

	
	public List<Marque> getMarques() {
		List<Marque> list= new ArrayList<Marque>();
		try {
			Session s=factory.openSession();
			s.beginTransaction();
			Query query=s.createQuery("from Marque");
			list=query.list();
			
			System.out.println("Marque display succeded");
			return list;
		} 
		catch (HibernateException e) {
			e.printStackTrace();
			System.out.println("Marque display failed");
			return null;
		}
	
	}

	
}

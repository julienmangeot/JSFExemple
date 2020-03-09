package dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import model.Marque;

public class MarqueDao implements IMarqueDao{

	
	public boolean saveMarque(Marque marque) {
		try {
			SessionFactory factory = ConnectionDB.getInstance().getFactory();
			Session s=ConnectionDB.getInstance().getS();
			
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

}

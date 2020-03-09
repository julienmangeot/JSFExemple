package dao;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import model.User;

public class UserDAO implements IUserDAO{
	
	private SessionFactory factory = ConnectionDB.getInstance().getFactory();


	public boolean saveUser(User user) {
		try {
			Session s=factory.openSession();
			s.beginTransaction();
			s.save(user);
			s.getTransaction().commit();
		
			System.out.println("User saving succeded");
			return true;
		}
		catch(HibernateException e) {
			e.printStackTrace();
			System.out.println("User saving failed");
			return false;
		}
	}

	public boolean getTheUser(User user) {
		try {
			Session s=factory.openSession();
			s.beginTransaction();
			Query query = s.createQuery("from User where user.login= :login and user.mdp= :mdp");
//			user=(User) query.list();
			if((User) query.list()!=null) {
			
			System.out.println("User display succeded");
			return true;
			}
			else 
				System.out.println("User doesn't exist");
				return false;
			}
			catch(HibernateException e) {
				e.printStackTrace();
				System.out.println("User display failed");
				return false;
			}
	}
}

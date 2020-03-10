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

	public boolean findUser(User user) {
		try {
			Session s=factory.openSession();
			s.beginTransaction();
			Query query = s.createQuery("from User where login= :login and mdp= :mdp");
			query.setParameter("login", user.getLogin());
			query.setParameter("mdp", user.getMdp());
			if((User) query.uniqueResult()!=null) {
			
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
	
//	public User findUser(User userf) {
//		try {
//			Session s=factory.openSession();
//			s.beginTransaction();
//			Query query =session.createQuery("from User where username= :username and password= :password");
//			query.setParameter("username", userf.getLogin());
//			query.setParameter("password", userf.getMdp());
//			User user =(User) query.uniqueResult();
//			return user;
//		}
//		catch(HibernateException e){
//			e.printStackTrace();
//			return null;
//		}
//	}
}

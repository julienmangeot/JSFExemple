package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ConnectionDB {
	
	private SessionFactory factory=null;
	private Session s=null;
	private static ConnectionDB instance=null;
	
	private ConnectionDB() {
	}
	
	public SessionFactory getFactory() {
		if(factory==null) {
			factory = new Configuration().configure().buildSessionFactory();
		}
		return factory;
	}

	public Session getS() {
		if(s==null) {
			s = factory.openSession();
		}
		return s;
	}

	public static ConnectionDB getInstance() {
		if(instance==null) {
			instance = new ConnectionDB();
		}
		return instance;
	}
}

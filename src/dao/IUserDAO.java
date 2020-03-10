package dao;

import model.User;

public interface IUserDAO {
	
	public boolean saveUser(User user);
	
	public boolean findUser(User user);

}

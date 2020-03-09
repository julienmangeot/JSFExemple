package dao;

import java.util.List;

import model.Marque;

public interface IMarqueDao {
	
	public boolean saveMarque(Marque marque);
	
	public List<Marque> getMarques();
	

}

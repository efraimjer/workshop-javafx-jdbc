package model.services;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class SellerService {
	
	private SellerDao dao = DaoFactory.createSellerDao();
	
	public List <Seller> findAll(){
		return dao.findAll();
				
		/*
		 * List<Seller> list = new ArrayList<>(); list.add(new Seller(1,
		 * "Avulso1")); list.add(new Seller(2, "Avulso2")); list.add(new
		 * Seller(3, "Avulso3"));
		 */
			
			//return list;
		
		
	}
	public void saveOrUpdate(Seller obj) {
		if (obj.getId() == null) {
			dao.insert(obj);
		}
		else {
			dao.update(obj);
		}
	}
	
	public void remove(Seller obj) {
		dao.deleteById(obj.getId());
	}
	

}

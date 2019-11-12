package model.services;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class DepartmentService {
	
	private DepartmentDao dao = DaoFactory.createDepartmentDao();
	
	public List <Department> findAll(){
		return dao.findAll();
		
		
		/*
		 * List<Department> list = new ArrayList<>(); list.add(new Department(1,
		 * "Avulso1")); list.add(new Department(2, "Avulso2")); list.add(new
		 * Department(3, "Avulso3"));
		 */
			
			//return list;
		
		
	}
	

}

package model.services;

import java.util.ArrayList;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class DepartmentService {
	
	private DepartmentDao dao = DaoFactory.createDepartmentDAO();
	
	public List<Department> findAll() {
		return dao.findAll();
	}
	
	public void insert(Department obj) {
		dao.insert(obj);
	}
	
	public void update(Department obj) {
		dao.update(obj);
	}
	
	public void delete(Department obj) {
		dao.deleteById(obj.getId());
	}
}

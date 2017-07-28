package service;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.sun.org.apache.regexp.internal.recompile;

import dao.AdminDao;
import entity.Admin;
import utils.JdbcUtils;

public class AdminService {

	AdminDao adminDao=new AdminDao();
	public AdminService() {
		// TODO Auto-generated constructor stub
	}

	public Admin login(Admin admin){
		try {
			  return adminDao.login(admin);
		} catch (Exception e) {
			throw  new RuntimeException(e);
		}
	
	}
	
	public List<Admin> getAll(){
		
		try {
			return adminDao.getAll();
		} catch (Exception e) {
			throw  new RuntimeException(e);
		}
	
		 
	}
	
	
	
	
	
}

package Action;

import java.io.File;
import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import entity.Admin;
import service.AdminService;

public class UesrAction extends ActionSupport {
      Admin admin=new Admin();
      private AdminService adminService = new AdminService();
	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	public UesrAction() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public String login()  {
		// TODO Auto-generated method stub
		try {
			Admin userInfo = adminService.login(admin);
		if (userInfo==null) {
			return "input";
		}
		
		ActionContext.getContext().getSession().put("userInfo", userInfo);
		return "loginSuccess";
			
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		
	}
	
	public String list()  {
		// TODO Auto-generated method stub
		try {
			List<Admin> Adminlist = adminService.getAll();
			ActionContext.getContext().getContextMap().put("listAdmin", Adminlist);
			return "list";
		} catch (Exception e) {
			return ERROR;
		}
		
	}
	
}

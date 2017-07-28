package interceptor;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.ActionProxy;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class UserCheckInterceptor extends AbstractInterceptor {

	public UserCheckInterceptor() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		// TODO Auto-generated method stub
		ActionContext ac = invocation.getInvocationContext();
		 ActionProxy proxy = invocation.getProxy();
		 String methodName = proxy.getMethod();
		 if (!"login".equals(methodName))
		 
		 {
			 
			 Object object = ac.getSession().get("userInfo");
			 if(object!=null)
			 {
				 return invocation.invoke(); 
				 
			 }
			 else {
				 return "input"; 
			}
			
		} else {
			return invocation.invoke();
		}
		 
	}

}

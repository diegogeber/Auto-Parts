package br.com.auto.action;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;

import br.com.auto.dao.UserDAO;
import br.com.auto.dao.UserDAOFacade;
import br.com.auto.model.User;

public class LoginAction extends ActionSupport {
    /**
	 * 
	 */
	private static final long serialVersionUID = -6108698923798669542L;
	
	@Autowired
	private UserDAOFacade userDAO;
    
	private User user;
     
    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }
 
    public void setUser(User user) {
        this.user = user;
    }
     
    public User getUser() {
        return user;
    }
 
    public String execute() {
        if (userDAO.checkLogin(user)) {
            return SUCCESS;
        }
         
        return ERROR;
    }

}

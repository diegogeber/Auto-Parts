package action;

import com.opensymphony.xwork2.ActionSupport;

import dao.UserDAO;
import model.User;

public class LoginAction extends ActionSupport {
    /**
	 * 
	 */
	private static final long serialVersionUID = -6108698923798669542L;
	private UserDAO userDAO;
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

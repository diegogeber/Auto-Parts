package br.com.auto.dao;

import org.springframework.stereotype.Service;

import br.com.auto.model.User;

@Service
public class UserDAO implements UserDAOFacade{
	
	public boolean checkLogin(User user) {
        return user.getUsername().equals("admin")
                && user.getPassword().equals("admin");
    }
}

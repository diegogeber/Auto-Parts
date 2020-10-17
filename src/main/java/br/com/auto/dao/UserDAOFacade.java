package br.com.auto.dao;

import br.com.auto.model.User;

public interface UserDAOFacade {
	
	boolean checkLogin(User user);
}

package br.com.auto.dao;

import br.com.auto.model.User;

public class UserDAO {
	public boolean checkLogin(User user) {
        return user.getUsername().equals("admin")
                && user.getPassword().equals("admin");
    }
}

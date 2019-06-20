package app.dao.impl;

import java.io.Serializable;
import java.util.List;

import app.dao.GenericDAO;
import app.dao.UserDAO;
import app.model.User;

public class UserDAOImpl extends GenericDAO<Integer, User>implements UserDAO{

	@Override
	public User findByUsenameAndPassword(String username, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> loadUsers() {
		// TODO Auto-generated method stub
		return null;
	}

}

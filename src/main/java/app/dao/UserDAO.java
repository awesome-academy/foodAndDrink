package app.dao;

import java.util.List;

import app.model.User;

public interface UserDAO extends BaseDAO<Integer, User> {

	User findByUsenameAndPassword(String username, String password);
	
	List<User> loadUsers();
	
}

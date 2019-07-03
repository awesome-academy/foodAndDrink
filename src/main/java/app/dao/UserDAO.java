package app.dao;

import java.util.List;

import app.model.User;

public interface UserDAO extends BaseDAO<Integer, User> {
	
	List<User> loadUsers(String userName, int size, int page);
	
	int userCount(String userName);

	User findByEmailAndPassword(String email, String password);

	boolean checkEmail(String email);
	
}

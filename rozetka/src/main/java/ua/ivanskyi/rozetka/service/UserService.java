package ua.ivanskyi.rozetka.service;

import java.util.List;

import ua.ivanskyi.rozetka.model.User;

public interface UserService {

	List<User> getAllUsers();

	User getUserInfo(long userId);

	void saveUser(String userName, String userEmail, String userLogin, String userPassword);
}

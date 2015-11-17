package ua.ivanskyi.rozetka.service.impl;

import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import ua.ivanskyi.rozetka.dao.UserDao;
import ua.ivanskyi.rozetka.model.User;
import ua.ivanskyi.rozetka.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Inject
	private UserDao userDao;

	@Transactional
	public List<User> getAllUsers() {
		return userDao.findAll();
	}

	@Transactional
	public User getUserInfo(long userId) {
		User user = userDao.findById(userId);
		if (user != null) {
			return user;
		} else {
			return new User();
		}
	}

	@Transactional
	public void saveUser(String userName, String userEmail, String userLogin, String userPassword) {
		userDao.save(new User(userName, userEmail, userLogin, userPassword));
	}

}

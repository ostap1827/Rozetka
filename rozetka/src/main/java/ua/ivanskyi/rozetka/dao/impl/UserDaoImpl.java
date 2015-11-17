package ua.ivanskyi.rozetka.dao.impl;

import org.springframework.stereotype.Repository;

import ua.ivanskyi.rozetka.dao.UserDao;
import ua.ivanskyi.rozetka.model.User;

@Repository
public class UserDaoImpl extends BaseDaoImpl<User, Long> implements UserDao {

	public UserDaoImpl() {
		super(User.class);

	}

}

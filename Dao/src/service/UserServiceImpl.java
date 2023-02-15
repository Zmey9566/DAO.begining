package service;

import dao.UserDaoImpl;
import model.BD;
import model.User;

import java.util.ArrayList;

public class UserServiceImpl implements UserService {
    private UserDaoImpl userDao;

    public UserServiceImpl(UserDaoImpl userDao) {
        this.userDao = userDao;
    }

    @Override
    public void saveUser(User user) {userDao.saveUser(user);}
    @Override
    public void createTable() {userDao.createTable();}

    @Override
    public void dropTable() {userDao.dropTable();}

    @Override
    public void removeUserById(int Id) {userDao.removeUserById(Id);}

    @Override
    public void getUserBuId(int Id) {userDao.getUserBuId(Id);}

    @Override
    public void getAllUsers() {userDao.getAllUsers();}

    @Override
    public void cleanUserTable() {userDao.cleanUserTable();}
}

package dao;

import model.BD;
import model.User;

import java.util.ArrayList;

public class UserDaoImpl implements UserDao {
    @Override
    public void saveUser(User user) {
        BD.users.add(user);
    }

    @Override
    public void createTable() {
        BD.users = new ArrayList<User>();
    }

    @Override
    public void dropTable() {
        BD.users = null;
    }

    @Override
    public void removeUserById(int Id) {
        BD.users.remove(Id);
    }

    @Override
    public void getUserBuId(int Id) {
        System.out.println(BD.users.get(Id));
    }

    @Override
    public void getAllUsers() {
        System.out.println(BD.users);
    }

    @Override
    public void cleanUserTable() {
        BD.users.clear();
    }


}

package dao;

import model.BD;
import model.User;
// Настройка базы данных
public interface UserDao {
    //createTable
    //dropTable users = null
    //saveUser
    //removeUserById
    //getUserById
    //getAllUsers
    //cleanUserTable

    void saveUser(User user);
    void createTable();
    void dropTable();
    void removeUserById(int Id);
    void getUserBuId(int Id);
    void getAllUsers();
    void cleanUserTable();
}

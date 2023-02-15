package service;

import model.User;
// Реализация DAO слоя
public interface UserService {
    void saveUser(User user);
    void createTable();
    void dropTable();
    void removeUserById(int Id);
    void getUserBuId(int Id);
    void getAllUsers();
    void cleanUserTable();
}

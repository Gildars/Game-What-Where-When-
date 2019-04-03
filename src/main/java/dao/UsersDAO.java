package dao;

import entity.Users;

import java.sql.SQLException;
import java.util.List;

public interface UsersDAO {

    //create
    void add(Users user) throws SQLException;

    //read
    List<Users> getAll();

    Users getById(Integer id);

    //update
    void update(Users user);

    //delete
    void remove(Users user);
}

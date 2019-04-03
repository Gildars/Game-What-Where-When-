package dao;

import entity.Tips;

import java.util.List;

public interface TipsDAO {
    void add(Tips tips);

    //read
    List<Tips> getAll();

    Tips getById(Integer id);

    //update
    void update(Tips tips);

    //delete
    void remove(Tips tips);
}

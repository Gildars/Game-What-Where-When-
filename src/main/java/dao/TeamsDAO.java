package dao;

import entity.Teams;

import java.util.List;

public interface TeamsDAO {
    void add(Teams teams);

    //read
    List<Teams> getAll();

    Teams getByTeamId(Integer id);

    //update
    void update(Teams teams);

    //delete
    void remove(Teams teams);
}

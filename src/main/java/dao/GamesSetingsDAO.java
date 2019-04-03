package dao;

import entity.GamesSetings;

import java.util.List;

public interface GamesSetingsDAO {
    void add(GamesSetings gamesSetings);

    //read
    List<GamesSetings> getAll();

    GamesSetings getById(Integer id);

    //update
    void update(GamesSetings gamesSetings);

    //delete
    void remove(GamesSetings gamesSetings);
}

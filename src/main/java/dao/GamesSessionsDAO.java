package dao;

import entity.GamesSessions;

import java.util.List;

public interface GamesSessionsDAO {
    //create
    void add(GamesSessions gamesSessions);

    //read
    List<GamesSessions> getAll();

    GamesSessions getByTeamId(Integer id);
    GamesSessions getByJudgeId(Integer id);

    //update
    void update(GamesSessions gamesSessions);

    //delete
    void remove(GamesSessions gamesSessions);
}

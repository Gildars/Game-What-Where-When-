package com.wwwgame.account.service;

import com.wwwgame.account.entity.Team;

import java.util.List;

public interface TeamService {
    void save(Team user);

    List<Team> findAll();

    Team findByName(String name);
}

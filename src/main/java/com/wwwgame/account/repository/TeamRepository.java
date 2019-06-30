package com.wwwgame.account.repository;

import com.wwwgame.account.entity.Team;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TeamRepository extends JpaRepository<Team, Long> {
    List<Team> findAll();
    Team findByName(String name);


}

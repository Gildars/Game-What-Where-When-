package com.wwwgame.account.service;

import com.wwwgame.account.entity.Team;
import com.wwwgame.account.entity.User;
import com.wwwgame.account.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamServiceImpl implements TeamService {

    @Autowired
    private TeamRepository teamRepository;

    @Autowired
    private UserService userService;

    @Override
    public void save(Team team) {
        team.setName(team.getName());
        teamRepository.save(team);

        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        User user = userService.findByUsername(auth.getName());
        user.setTeam_id(team.getId());

        userService.save(user);
    }

   @Override
    public List<Team> findAll() {
       return teamRepository.findAll();
    }

    @Override
    public Team findByName(String name) {
        return teamRepository.findByName(name);
    }
}


package com.wwwgame.account.service;

import com.wwwgame.account.entity.GameSetting;
import com.wwwgame.account.entity.Team;
import com.wwwgame.account.entity.User;
import com.wwwgame.account.repository.GameSettingRepository;
import com.wwwgame.account.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;

@Service
public class GameSettingServiceImpl implements GameSettingService {

    @Autowired
    private GameSettingRepository gameSettingRepository;


    @Override
    public void save(GameSetting gameSetting) {
        gameSetting.setCountPlayers(gameSetting.getCountPlayers());
        gameSetting.setCountQuestions(gameSetting.getCountQuestions());
        gameSetting.setTimePerQuestion(gameSetting.getTimePerQuestion());
        gameSetting.setTipsType(gameSetting.getTipsType());
        gameSettingRepository.save(gameSetting);
    }

    @Override
    public GameSetting findById(Long id) {
        return gameSettingRepository.findById(id);
    }

}


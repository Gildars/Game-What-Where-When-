package com.wwwgame.account.service;

import com.wwwgame.account.entity.GameSetting;

public interface GameSettingService {
    void save(GameSetting gameSetting);

    GameSetting findById(Long id);
}

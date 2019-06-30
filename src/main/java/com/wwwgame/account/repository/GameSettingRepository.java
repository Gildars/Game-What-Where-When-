package com.wwwgame.account.repository;

import com.wwwgame.account.entity.GameSetting;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameSettingRepository extends JpaRepository<GameSetting, Long> {
    GameSetting findById(Number id);
}

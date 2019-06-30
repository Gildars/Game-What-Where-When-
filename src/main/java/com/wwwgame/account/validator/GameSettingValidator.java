package com.wwwgame.account.validator;

import com.wwwgame.account.entity.GameSetting;
import com.wwwgame.account.entity.Team;
import com.wwwgame.account.service.GameSettingService;
import com.wwwgame.account.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Component
public class GameSettingValidator implements Validator {
    @Autowired
    private GameSettingService gameSettingService;

    @Override
    public boolean supports(Class<?> aClass) {
        return GameSetting.class.equals(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        GameSetting gameSetting = (GameSetting) o;

       /* ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "NotEmpty");
        if (gameSetting.time().length() < 6 || gameSetting.getName().length() > 32) {
            errors.rejectValue("name", "Size.createGameSettingForm.name");
        }*/
    }
}

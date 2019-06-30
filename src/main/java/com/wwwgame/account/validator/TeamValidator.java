package com.wwwgame.account.validator;

import com.wwwgame.account.entity.Team;
import com.wwwgame.account.entity.User;
import com.wwwgame.account.service.TeamService;
import com.wwwgame.account.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Component
public class TeamValidator implements Validator {

    @Autowired
    private TeamService teamService;

    @Override
    public boolean supports(Class<?> aClass) {
        return Team.class.equals(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        Team team = (Team) o;

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "NotEmpty");
        if (team.getName().length() < 6 || team.getName().length() > 32) {
            errors.rejectValue("name", "Size.createTeamForm.name");
        }
        if (teamService.findByName(team.getName()) != null) {
            errors.rejectValue("name", "Duplicate.createTeamForm.name");
        }
    }
}

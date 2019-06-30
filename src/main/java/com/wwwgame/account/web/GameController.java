package com.wwwgame.account.web;

import com.wwwgame.account.entity.GameSetting;
import com.wwwgame.account.entity.Team;
import com.wwwgame.account.entity.User;
import com.wwwgame.account.service.GameSettingService;
import com.wwwgame.account.service.TeamService;
import com.wwwgame.account.service.UserService;
import com.wwwgame.account.validator.GameSettingValidator;
import com.wwwgame.account.validator.TeamValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class GameController {

    @Autowired
    private TeamValidator teamValidator;

    @Autowired
    private TeamService teamService;

    @Autowired
    private GameSettingValidator gameSettingValidator;

    @Autowired
    private GameSettingService gameSettingService;

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/game/create/stepTwo", method = RequestMethod.GET)
    public String creatingGameSettings(Model model) {
        model.addAttribute("gameSetting", new GameSetting());
        return "creatingGameSettings";
    }

    @RequestMapping(value = "/game/create/stepTwo", method = RequestMethod.POST)
    public String createGameSettings(@ModelAttribute("gameSetting") GameSetting gameSettingForm, BindingResult bindingResult, Model model) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        User user = userService.findByUsername(auth.getName());
        if (user.getTeam_id() == null) {
            model.addAttribute("team", new Team());
            return "createTeam";
        } else {
            gameSettingValidator.validate(gameSettingForm, bindingResult);

            if (bindingResult.hasErrors()) {
                return "creatingGameSettings";
            }
            gameSettingService.save(gameSettingForm);
            return "redirect:/";
        }
    }

    @RequestMapping(value = "/game/create/stepOne", method = RequestMethod.GET)
    public String createGame(Model model) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        User user = userService.findByUsername(auth.getName());
        if (user.getTeam_id() == null) {
            model.addAttribute("team", new Team());
            return "createTeam";
        } else {
            return "redirect:/game/create/stepTwo";
        }
    }

    @RequestMapping(value = "/game/create/stepOne", method = RequestMethod.POST)
    public String createTeam(@ModelAttribute("team") Team createTeamForm, BindingResult bindingResult, Model model) {
        teamValidator.validate(createTeamForm, bindingResult);

        if (bindingResult.hasErrors()) {
            return "createTeam";
        }

        teamService.save(createTeamForm);

        return "redirect:/game/create/stepTwo";
    }
}

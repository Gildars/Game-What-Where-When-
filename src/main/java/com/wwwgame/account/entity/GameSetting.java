package com.wwwgame.account.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.Time;

@Entity
@Table(name = "game_setting")
public class GameSetting {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name= "increment", strategy= "increment")
    @Column(name = "id", length = 11, nullable = false)
    private Integer id;
    @Column(name = "time_per_question")
    private Time timePerQuestion;
    @Column(name = "count_players")
    private Integer countPlayers;
    @Column(name = "count_questions")
    private Integer countQuestions;
    @Column(name = "tips_type")
    private String tipsType;

    public GameSetting() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Time getTimePerQuestion() {
        return timePerQuestion;
    }

    public void setTimePerQuestion(Time timePerQuestion) {
        this.timePerQuestion = timePerQuestion;
    }

    public Integer getCountPlayers() {
        return countPlayers;
    }

    public void setCountPlayers(Integer countPlayers) {
        this.countPlayers = countPlayers;
    }

    public Integer getCountQuestions() {
        return countQuestions;
    }

    public void setCountQuestions(Integer countQuestions) {
        this.countQuestions = countQuestions;
    }

    public String getTipsType() {
        return tipsType;
    }

    public void setTipsType(String tipsType) {
        this.tipsType = tipsType;
    }
}

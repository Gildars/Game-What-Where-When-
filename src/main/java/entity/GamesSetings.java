package entity;

import java.sql.Time;

public class GamesSetings {
    private Integer gameSetingsId;
    private Time timePerQuestion;
    private Byte countPlayers;
    private Byte countQuestions;
    private String tipsType;

    public GamesSetings() {

    }

    public Integer getGameSetingsId() {
        return gameSetingsId;
    }

    public void setGameSetingsId(Integer gameSetingsId) {
        this.gameSetingsId = gameSetingsId;
    }

    public Time getTimePerQuestion() {
        return timePerQuestion;
    }

    public void setTimePerQuestion(Time timePerQuestion) {
        this.timePerQuestion = timePerQuestion;
    }

    public Byte getCountPlayers() {
        return countPlayers;
    }

    public void setCountPlayers(Byte countPlayers) {
        this.countPlayers = countPlayers;
    }

    public Byte getCountQuestions() {
        return countQuestions;
    }

    public void setCountQuestions(Byte countQuestions) {
        this.countQuestions = countQuestions;
    }

    public String getTipsType() {
        return tipsType;
    }

    public void setTipsType(String tipsType) {
        this.tipsType = tipsType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GamesSetings that = (GamesSetings) o;

        if (gameSetingsId != null ? !gameSetingsId.equals(that.gameSetingsId) : that.gameSetingsId != null)
            return false;
        if (timePerQuestion != null ? !timePerQuestion.equals(that.timePerQuestion) : that.timePerQuestion != null)
            return false;
        if (countPlayers != null ? !countPlayers.equals(that.countPlayers) : that.countPlayers != null) return false;
        if (countQuestions != null ? !countQuestions.equals(that.countQuestions) : that.countQuestions != null)
            return false;
        return tipsType != null ? tipsType.equals(that.tipsType) : that.tipsType == null;
    }

    @Override
    public int hashCode() {
        int result = gameSetingsId != null ? gameSetingsId.hashCode() : 0;
        result = 31 * result + (timePerQuestion != null ? timePerQuestion.hashCode() : 0);
        result = 31 * result + (countPlayers != null ? countPlayers.hashCode() : 0);
        result = 31 * result + (countQuestions != null ? countQuestions.hashCode() : 0);
        result = 31 * result + (tipsType != null ? tipsType.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "GamesSetingsDAO{" +
                "gameSetingsId=" + gameSetingsId +
                ", timePerQuestion=" + timePerQuestion +
                ", countPlayers=" + countPlayers +
                ", countQuestions=" + countQuestions +
                ", tipsType='" + tipsType + '\'' +
                '}';
    }
}

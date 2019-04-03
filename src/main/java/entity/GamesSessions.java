package entity;

import java.sql.Timestamp;

public class GamesSessions {
    private Integer gameSessionId;
    private Integer teamId;
    private Integer judgeId;
    private Integer gameSetingId;
    private Byte score;
    private Timestamp createdAt;
    private Byte isGameOver;

    public GamesSessions() {

    }

    public Integer getGameSessionId() {
        return gameSessionId;
    }

    public void setGameSessionId(Integer gameSessionId) {
        this.gameSessionId = gameSessionId;
    }

    public Integer getTeamId() {
        return teamId;
    }

    public void setTeamId(Integer teamId) {
        this.teamId = teamId;
    }

    public Integer getJudgeId() {
        return judgeId;
    }

    public void setJudgeId(Integer judgeId) {
        this.judgeId = judgeId;
    }

    public Integer getGameSetingId() {
        return gameSetingId;
    }

    public void setGameSetingId(Integer gameSetingId) {
        this.gameSetingId = gameSetingId;
    }

    public Byte getScore() {
        return score;
    }

    public void setScore(Byte score) {
        this.score = score;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public Byte getIsGameOver() {
        return isGameOver;
    }

    public void setIsGameOver(Byte isGameOver) {
        this.isGameOver = isGameOver;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GamesSessions that = (GamesSessions) o;

        if (gameSessionId != null ? !gameSessionId.equals(that.gameSessionId) : that.gameSessionId != null)
            return false;
        if (teamId != null ? !teamId.equals(that.teamId) : that.teamId != null) return false;
        if (judgeId != null ? !judgeId.equals(that.judgeId) : that.judgeId != null) return false;
        if (gameSetingId != null ? !gameSetingId.equals(that.gameSetingId) : that.gameSetingId != null) return false;
        if (score != null ? !score.equals(that.score) : that.score != null) return false;
        if (createdAt != null ? !createdAt.equals(that.createdAt) : that.createdAt != null) return false;
        return isGameOver != null ? isGameOver.equals(that.isGameOver) : that.isGameOver == null;
    }

    @Override
    public int hashCode() {
        int result = gameSessionId != null ? gameSessionId.hashCode() : 0;
        result = 31 * result + (teamId != null ? teamId.hashCode() : 0);
        result = 31 * result + (judgeId != null ? judgeId.hashCode() : 0);
        result = 31 * result + (gameSetingId != null ? gameSetingId.hashCode() : 0);
        result = 31 * result + (score != null ? score.hashCode() : 0);
        result = 31 * result + (createdAt != null ? createdAt.hashCode() : 0);
        result = 31 * result + (isGameOver != null ? isGameOver.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "GamesSessions{" +
                "gameSessionId=" + gameSessionId +
                ", teamId=" + teamId +
                ", judgeId=" + judgeId +
                ", gameSetingId=" + gameSetingId +
                ", score=" + score +
                ", createdAt=" + createdAt +
                ", isGameOver=" + isGameOver +
                '}';
    }
}

package entity;

public class Teams {
    private Integer teamId;
    private String name;

    public Teams() {

    }

    public Integer getTeamId() {
        return teamId;
    }

    public void setTeamId(Integer teamId) {
        this.teamId = teamId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Teams teams = (Teams) o;

        if (teamId != null ? !teamId.equals(teams.teamId) : teams.teamId != null) return false;
        return name != null ? name.equals(teams.name) : teams.name == null;
    }

    @Override
    public int hashCode() {
        int result = teamId != null ? teamId.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Teams{" +
                "teamId=" + teamId +
                ", name='" + name + '\'' +
                '}';
    }
}

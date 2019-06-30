package com.wwwgame.account.entity;

public class Tips {
    private Integer tipId;
    private String title;

    public Integer getTipId() {
        return tipId;
    }

    public void setTipId(Integer tipId) {
        this.tipId = tipId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tips tips = (Tips) o;

        if (tipId != null ? !tipId.equals(tips.tipId) : tips.tipId != null) return false;
        return title != null ? title.equals(tips.title) : tips.title == null;
    }

    @Override
    public int hashCode() {
        int result = tipId != null ? tipId.hashCode() : 0;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Tips{" +
                "tipId=" + tipId +
                ", title='" + title + '\'' +
                '}';
    }
}

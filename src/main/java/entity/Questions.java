package entity;

public class Questions {
    private Integer questionId;
    private Integer tipId;
    private String title;

    public Questions() {

    }

    public Integer getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

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

        Questions questions = (Questions) o;

        if (questionId != null ? !questionId.equals(questions.questionId) : questions.questionId != null) return false;
        if (tipId != null ? !tipId.equals(questions.tipId) : questions.tipId != null) return false;
        return title != null ? title.equals(questions.title) : questions.title == null;
    }

    @Override
    public int hashCode() {
        int result = questionId != null ? questionId.hashCode() : 0;
        result = 31 * result + (tipId != null ? tipId.hashCode() : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Questions{" +
                "questionId=" + questionId +
                ", tipId=" + tipId +
                ", title='" + title + '\'' +
                '}';
    }
}

package entity;

public class Answers {
    private Integer answerId;
    private Integer questionId;
    private String title;
    private Byte isRight;

    public Answers() {

    }

    public Integer getAnswerId() {
        return answerId;
    }

    public void setAnswerId(Integer answerId) {
        this.answerId = answerId;
    }

    public Integer getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Byte getIsRight() {
        return isRight;
    }

    public void setIsRight(Byte isRight) {
        this.isRight = isRight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Answers answers = (Answers) o;

        if (answerId != null ? !answerId.equals(answers.answerId) : answers.answerId != null) return false;
        if (questionId != null ? !questionId.equals(answers.questionId) : answers.questionId != null) return false;
        if (title != null ? !title.equals(answers.title) : answers.title != null) return false;
        return isRight != null ? isRight.equals(answers.isRight) : answers.isRight == null;
    }

    @Override
    public int hashCode() {
        int result = answerId != null ? answerId.hashCode() : 0;
        result = 31 * result + (questionId != null ? questionId.hashCode() : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (isRight != null ? isRight.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Answers{" +
                "answerId=" + answerId +
                ", questionId=" + questionId +
                ", title='" + title + '\'' +
                ", isRight=" + isRight +
                '}';
    }
}

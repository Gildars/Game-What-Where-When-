package com.wwwgame.account.entity;

public class Answer {
    private Integer answerId;
    private Integer questionId;
    private String title;
    private Byte isRight;

    public Answer() {

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

        Answer answer = (Answer) o;

        if (answerId != null ? !answerId.equals(answer.answerId) : answer.answerId != null) return false;
        if (questionId != null ? !questionId.equals(answer.questionId) : answer.questionId != null) return false;
        if (title != null ? !title.equals(answer.title) : answer.title != null) return false;
        return isRight != null ? isRight.equals(answer.isRight) : answer.isRight == null;
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
        return "Answer{" +
                "answerId=" + answerId +
                ", questionId=" + questionId +
                ", title='" + title + '\'' +
                ", isRight=" + isRight +
                '}';
    }
}

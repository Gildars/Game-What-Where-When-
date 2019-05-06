package dao;

import entity.Answers;

import java.util.List;

public interface AnswerDAO {
    //create
    void add(Answers answers);

    //read
    List<Answers> getAll();

    Answers getByAnswerId(Integer id);
    //update
    void update(Answers answers);

    //delete
    void remove(Answers answers);
}

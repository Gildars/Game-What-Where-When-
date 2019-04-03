package dao;

import entity.Questions;

import java.util.List;

public interface QuestionsDAO {
    void add(Questions questions);

    //read
    List<Questions> getAll();

    Questions getById(Integer id);

    //update
    void update(Questions questions);

    //delete
    void remove(Questions questions);
}

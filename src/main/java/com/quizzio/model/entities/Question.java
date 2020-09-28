package com.quizzio.model.entities;

import javax.persistence.*;
import java.util.List;

/*
* Entity used for the creation of the question table
* */
@Entity
public class Question {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "quest_id", unique = true, nullable = false)
    private int idQuestion;

    private String intituleQuest;

    @OneToMany(fetch =FetchType.EAGER, mappedBy = "quest", cascade=CascadeType.ALL)
    private List<Response> resp;

    private int level;

    public int getIdQuestion() {
        return idQuestion;
    }

    public void setIdQuestion(int idQuestion) {
        this.idQuestion = idQuestion;
    }

    public String getIntituleQuest() {
        return intituleQuest;
    }

    public void setIntituleQuest(String intituleQuest) {
        this.intituleQuest = intituleQuest;
    }

    public List<Response> getResp() {
        return resp;
    }

    public void setResp(List<Response> resp) {
        this.resp = resp;
    }

    public int getLevel() {
        return level;
    }

    public Response getGoodResponse(){
        for (Response response: resp) {
            if (response.isGoodRep()){
                return response;
            }
        }
        return null;
    }

    public void setLevel(int level) {
        this.level = level;
    }

}

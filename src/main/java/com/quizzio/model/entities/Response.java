package com.quizzio.model.entities;

import javax.persistence.*;

/*
 * Entity used for the creation of the response table
 * */
@Entity
public class Response {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "Resp_ID", unique = true, nullable = false)
    private int idResponse;

    private String intituleResp;

    @ManyToOne (optional=false, cascade=CascadeType.ALL)
    @JoinColumn(
            name="Quest_ID", nullable=false)
    private Question quest;

    private boolean goodRep;

    public int getIdResponse() {
        return idResponse;
    }

    public void setIdResponse(int idResponse) {
        this.idResponse = idResponse;
    }

    public String getIntituleResp() {
        return intituleResp;
    }

    public void setIntituleResp(String intituleResp) {
        this.intituleResp = intituleResp;
    }

    public Question getQuest() {
        return quest;
    }

    public void setQuest(Question quest) {
        this.quest = quest;
    }

    public boolean isGoodRep() {
        return goodRep;
    }

    public void setGoodRep(boolean goodRep) {
        this.goodRep = goodRep;
    
    }
}

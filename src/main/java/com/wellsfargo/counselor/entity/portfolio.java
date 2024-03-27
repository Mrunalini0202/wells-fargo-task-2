package com.wellsfargo.counselor.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class portfolio {

    @Id
    @GeneratedValue()
    private long portfolioId;

    @Id
    @GeneratedValue()
    private long clientId;

    protected portfolio(){

    }

    public Long getPortfolioId()  {return portfolioId;}

    public Long getClientId() {return clientId;}


}

package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class security {

    @Id
    @GeneratedValue()
    private long securityId;

    @Id
    @GeneratedValue()
    private long portfolioId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private String purchasePrice;

    @Column(nullable = false)
    private String purchaseDate;

    @Column(nullable = false)
    private String quantity;

    protected security(){

    }

    public security(String name , String category ,String purchaseDate, String purchasePrice ,String quantity){
        this.name = name;
        this.category= category;
        this.purchasePrice= purchasePrice;
        this.purchaseDate = purchaseDate;
        this.quantity= quantity;
    }

    public Long getSecurityId() {return securityId;}

    public Long getPortfolioId() {return portfolioId;}

    public String getName() {return name;}

    public void setName(String name) {this.name= name;}

    public String getCategory() {return category;}

    public void setCategory(String category) {this.category= category;}

    public String getPurchasePrice() {return purchasePrice;}

    public void setPurchasePrice(String purchasePrice) {this.purchasePrice= purchasePrice;}

    public String getPurchaseDate() {return purchaseDate;}

    public void setPurchaseDate(String purchaseDate) {this.purchaseDate= purchaseDate;}

    public String getQuantity() {return quantity;}

    public void  setQuantity(String quantity) {this.quantity= quantity;}
}

package com.wellsfargo.counselor.entity;

import ch.qos.logback.core.net.server.Client;
import jakarta.persistence.*;
import org.apache.commons.math3.analysis.function.Identity;


public class Portfolio {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String portfolioName;

    @Column(nullable = false)
    private double totalValue;

    @ManyToOne
    private Client client;

    // Constructor
    public Portfolio(String portfolioName, double totalValue, Client client) {
        this.portfolioName = portfolioName;
        this.totalValue = totalValue;
        this.client = client;
    }

    // Default constructor for JPA
    public Portfolio() {
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public String getPortfolioName() {
        return portfolioName;
    }

    public void setPortfolioName(String portfolioName) {
        this.portfolioName = portfolioName;
    }

    public double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(double totalValue) {
        this.totalValue = totalValue;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}

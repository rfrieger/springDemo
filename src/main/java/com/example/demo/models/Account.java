package com.example.demo.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Account {

    public Account() {
    }

    @Id
    private Integer accountNumber;

    private String name;

    private String address;

    private Double balance;


    public Integer getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Integer accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }


}

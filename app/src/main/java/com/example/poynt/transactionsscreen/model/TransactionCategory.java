package com.example.poynt.transactionsscreen.model;

import java.util.List;

public class TransactionCategory {

    private String category;
    private List<Transaction> transactions;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    @Override
    public String toString() {
        return "TransactionCategory{" +
                "category='" + category + '\'' +
                ", transactions=" + transactions +
                '}';
    }
}

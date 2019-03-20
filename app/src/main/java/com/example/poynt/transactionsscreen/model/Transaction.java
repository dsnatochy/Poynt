package com.example.poynt.transactionsscreen.model;

public class Transaction {

    private String summary;
    private String category;
    private long date;
    private float amount;

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public long getDate() {
        return date;
    }

    public void setDate(long date) {
        this.date = date;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "summary='" + summary + '\'' +
                ", category='" + category + '\'' +
                ", date=" + date +
                ", amount=" + amount +
                '}';
    }
}

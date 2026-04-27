package com.example.smartcity.backend.model;

import jakarta.persistence.*;

@Entity
public class Feedback {

    @Id
    @GeneratedValue
    private Long id;

    private int rating;
    private String message;

    public Long getId() {
        return id;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
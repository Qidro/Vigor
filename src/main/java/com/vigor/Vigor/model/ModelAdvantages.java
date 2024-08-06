package com.vigor.Vigor.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class ModelAdvantages {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String Text;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return Text;
    }

    public void setText(String text) {
        Text = text;
    }
}

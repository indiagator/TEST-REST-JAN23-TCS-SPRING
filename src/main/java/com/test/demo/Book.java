package com.test.demo;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Book { // Business Pojo
    @Id
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}

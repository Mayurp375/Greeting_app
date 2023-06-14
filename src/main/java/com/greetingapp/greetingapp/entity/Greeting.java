package com.greetingapp.greetingapp.entity;

public class Greeting {
    private int id;
    private String masage;

    public Greeting(int id, String masage) {
        this.id = id;
        this.masage = masage;
    }

    public Greeting() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMasage() {
        return masage;
    }

    public void setMasage(String masage) {
        this.masage = masage;
    }

    @Override
    public String toString() {
        return "Greeting{" +
                "id=" + id +
                ", masage='" + masage + '\'' +
                '}';
    }
}

package com.example.app.simpleCrud.entity;

import javax.persistence.*;


@Entity
@Table(name = "auto", schema = "public")
public class Auto {

    public Auto() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "auto_generator")
    @SequenceGenerator(name = "auto_generator", sequenceName = "auto_seq", allocationSize = 1)
    private int id;

    private String name;
    private String color;
    private String power;


    @ManyToOne(cascade = {
            CascadeType.DETACH,
            CascadeType.MERGE,
            CascadeType.PERSIST,
            CascadeType.REFRESH
    }, fetch = FetchType.LAZY)
    @JoinColumn(name = "person_id")
    private Person person;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}

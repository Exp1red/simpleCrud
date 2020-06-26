package com.example.app.simpleCrud.dto;

public class AutoDto {

    private int id;
    private String name;
    private String color;
    private String power;


    public AutoDto(int id, String name, String color, String power) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.power = power;
    }

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
}

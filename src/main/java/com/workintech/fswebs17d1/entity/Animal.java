package com.workintech.fswebs17d1.entity;

public class Animal {
    private int id;
    private String name;

    public Animal(int animalID, String name) {
        this.id = animalID;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int animalID) {
        this.id = animalID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || o.getClass() != this.getClass()) return false;
        Animal animal = (Animal) o;
        if(this.id == animal.id) return true;
        else return false;
    }
}

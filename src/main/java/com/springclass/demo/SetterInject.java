package com.springclass.demo;

public class SetterInject {
    private String name;
    private int id;

    public SetterInject(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public SetterInject() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "SetterInject{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}

package com.vertex.prof.HomeWork1;

public class Listener  {
    private String name;
    private Sex sex;
    private int respect;


    public Listener(String name, Sex sex, int respect) {
        this.name = name;
        this.sex = sex;
        this.respect = respect;
    }

    public String getName() {
        return name;
    }

    public int getRespect() {
        return respect;
    }

    public Sex getSex() {
        return sex;
    }


    @Override
    public String toString() {
        return "[Name " + name  +
                ", respect " + respect + ']';
    }
}

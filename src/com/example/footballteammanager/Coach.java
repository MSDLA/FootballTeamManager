package com.example.footballteammanager;

public class Coach {

    String name;
    int age;
    String strategy;

    public Coach(String name, int age, String strategy) {
        this.name = name;
        this.age = age;
        this.strategy = strategy;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getStrategy() {
        return strategy;
    }
}

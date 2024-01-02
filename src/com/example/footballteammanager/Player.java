package com.example.footballteammanager;

public class Player {

    String name;
    int age;
    String goal;

    public Player(String name, int age, String goal) {
        this.name = name;
        this.age = age;
        this.goal = goal;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGoal() {
        return goal;
    }
}


package com.example.footballteammanager;

public class Test {

    public static void main(String[] args) {
        Player player = new Player("John Doe", 20, "Score goals");
        Coach coach = new Coach("Jane Doe", 40, "Offensive");

        System.out.println("Player: " + player.getName() + ", Age: " + player.getAge() + ", Goal: " + player.getGoal());
        System.out.println("Coach: " + coach.getName() + ", Age: " + coach.getAge() + ", Strategy: " + coach.getStrategy());
    }
}





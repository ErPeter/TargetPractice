package com.udemy;

import java.util.Random;

public class Main {

    public static void displayHighScorePosition(String name, int position){
        System.out.println(name + " managed to get into position "+ position + " on th high score table \n");
    }

    public static int calculateHighScorePosition(int playerScore){
        if (playerScore >1000){
            return 1;
        }else if(playerScore >= 500){
            return 2;
        }
        else if(playerScore >= 100) {
            return 3;
        }
        return 4;
    }

    public static void main(String[] args) {

        String name = "Hagymas Janos";
        int score = 1500;

        displayHighScorePosition(name, calculateHighScorePosition(score));
        score = 900;
        displayHighScorePosition(name, calculateHighScorePosition(score));
        score = 400;
        displayHighScorePosition(name, calculateHighScorePosition(score));
        score = 50;
        displayHighScorePosition(name, calculateHighScorePosition(score));
        displayHighScorePosition("valaki", calculateHighScorePosition(1000));
    }
}
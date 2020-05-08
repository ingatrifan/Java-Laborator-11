package com.lab11.entities;

public class Game {
    String firstPlayer;
    String secondPlayer;
    String content;

    Game(String firstPlayer, String secondPlayer, String content) {
        this.firstPlayer = firstPlayer;
        this.secondPlayer = secondPlayer;
        this.content = content;
    }

    public String getFirstPlayer() {
        return firstPlayer;
    }

    public String getSecondPlayer() {
        return secondPlayer;
    }

    public void setFirstPlayer(String firstPlayer) {
        this.firstPlayer = firstPlayer;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setSecondPlayer(String secondPlayer) {
        this.secondPlayer = secondPlayer;
    }
}

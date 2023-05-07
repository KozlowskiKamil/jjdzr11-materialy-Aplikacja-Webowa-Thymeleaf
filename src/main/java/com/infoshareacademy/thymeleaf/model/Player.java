package com.infoshareacademy.thymeleaf.model;

public class Player {
    private long id;
    private String name;
    private int gamesPlayed;
    private int gamesWon;

    public static Player init(long id, String name) {
        return new Player(id, name);
    }

    private Player(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGamesPlayed() {
        return gamesPlayed;
    }

    public int getGamesWon() {
        return gamesWon;
    }
}

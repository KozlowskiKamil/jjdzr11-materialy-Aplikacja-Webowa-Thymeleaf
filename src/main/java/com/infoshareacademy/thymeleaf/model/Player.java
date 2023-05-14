package com.infoshareacademy.thymeleaf.model;

public class Player {
    private long id;
    private String name;
    private int gamesPlayed;
    private int gamesWon;
    private PlayerLevel level;

    public static Player create(long id, String name, PlayerLevel level) {
        return new Player(id, name, level);
    }

    private Player(long id, String name, PlayerLevel level) {
        this.id = id;
        this.name = name;
        this.level = level;
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

    public PlayerLevel getLevel() {
        return level;
    }

    public enum PlayerLevel {
        BEGINNER("Początkujący"),
        ADVANCED("Zaawansowany"),
        EXPERT("Ekspert");

        private final String label;

        PlayerLevel(String label) {
            this.label = label;
        }

        public String getLabel() {
            return label;
        }
    }
}

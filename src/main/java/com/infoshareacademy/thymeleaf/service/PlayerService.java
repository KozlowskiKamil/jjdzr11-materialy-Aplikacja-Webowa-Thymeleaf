package com.infoshareacademy.thymeleaf.service;

import com.infoshareacademy.thymeleaf.model.Player;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.IntStream;

import static com.infoshareacademy.thymeleaf.model.Constants.PLAYER_NAMES;

@Service
public class PlayerService {
    private List<Player> players;

    public PlayerService() {
        players = IntStream.range(1, 6)
            .mapToObj(i ->
                Player.create(i,
                        PLAYER_NAMES.get(i-1),
                        Player.PlayerLevel.values()[i % Player.PlayerLevel.values().length])
            ).toList();
    }

    public List<Player> getPlayers() {
        return players;
    }

    public Player getPlayer(long id) {
        return players.stream()
            .filter(p -> p.getId() == id)
            .findFirst()
            .orElseThrow(
                    () -> new RuntimeException("Player with given ID does not exist")
            );
    }
}

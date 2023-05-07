package com.infoshareacademy.thymeleaf.service;

import com.infoshareacademy.thymeleaf.model.Player;
import org.springframework.stereotype.Service;

@Service
public class PlayerService {
    private Player p1 = Player.init(1, "Player 1");
    private Player p2 = Player.init(2, "Player 2");

    public Player getPlayer(long id) {
        if (id == 1) return p1;
        if (id == 2) return p2;
        return null;
    }
}

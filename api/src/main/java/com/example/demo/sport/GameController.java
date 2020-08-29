package com.example.demo.sport;


import com.example.demo.BoardController;
import com.google.gson.Gson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class GameController {
    private static final Logger LOGGER = LoggerFactory.getLogger(GameController.class);

    @Autowired
    GameService gameService;
    @Autowired
    private Gson gson;

    @GetMapping(value = {"/games"}, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> getGames(
            Pageable pageable
    ) {

        List<Game> games = gameService.findAll();
        String resp = gson.toJson(games);

        return ResponseEntity.ok(resp);
    }

    @GetMapping(value = {"/game/me"})
    public ResponseEntity<String> getMyGames(
            Pageable pageable
    ) {

        return ResponseEntity.ok("");
    }

    @GetMapping(value = {"/game/{id}"})
    public ResponseEntity<String> getGame(
            @PathVariable("id") Long id
    ) {

        return ResponseEntity.ok("");
    }
}

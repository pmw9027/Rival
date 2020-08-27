package com.example.demo.sport;


import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GameController {

    @GetMapping(value = {"/game"})
    public ResponseEntity<String> getGames(
            Pageable pageable
    ) {

        return ResponseEntity.ok("");
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

package com.example.demo;

import com.google.gson.Gson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class BoardController {
    private static final Logger LOGGER = LoggerFactory.getLogger(BoardController.class);

    @Autowired
    private Gson gson;

    @GetMapping(value = {"/board"})
    public ResponseEntity<ArrayList<Map<String, Object>>> getBoards(
            @RequestParam(name = "page") String page
    ) {
        ArrayList<Map<String, Object>> responseBody = new ArrayList<>();

        return ResponseEntity.ok(responseBody);
    }
    @GetMapping(value = {"/board/{id}"})
    public ResponseEntity<Map<String, Object>> getBoard(
            @PathVariable("id") String id
    ) {
        Map<String, Object> responseBody = new HashMap<>();

        return ResponseEntity.ok(responseBody);
    }

    @PostMapping(value = {"/board"})
    public ResponseEntity<Map<String, Object>> test1(
            @RequestBody String payload
    ) {

        BoardBO boardBO = gson.fromJson(payload, BoardBO.class);
        Map<String, Object> responseBody = new HashMap<>();

        responseBody.put("t", boardBO.getContent());

        return ResponseEntity.ok(responseBody);
    }

    @PutMapping(value = {"/board/{id}"})
    public String test2(
        @PathVariable("id") String id
    ) {

        return "";
    }
    @DeleteMapping(value = {"/board/{id}"})
    public String test3(
            @PathVariable("id") String id
    ) {

        return "";
    }
}

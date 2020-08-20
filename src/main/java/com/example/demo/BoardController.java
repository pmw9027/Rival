package com.example.demo;

import com.google.gson.Gson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PagedResourcesAssembler;
import org.springframework.hateoas.PagedModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class BoardController {
    private static final Logger LOGGER = LoggerFactory.getLogger(BoardController.class);

    @Autowired
    private Gson gson;

    @Autowired
    private BoardService boardService;

    @GetMapping(value = {"/board"})
    public ResponseEntity<String> getBoards(
            Pageable pageable
    ) {

        return ResponseEntity.ok("");
    }
    @GetMapping(value = {"/board/{id}"})
    public ResponseEntity<Object> getBoard(
            @PathVariable("id") Long id
    ) {
        BoardBO boardBO = boardService.getBoard(id);

        if (boardBO == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return ResponseEntity.ok(boardBO);
    }

    @PostMapping(value = {"/board"})
    public ResponseEntity<Map<String, Object>> test1(
            @RequestBody String payload
    ) {

        BoardBO boardBO = gson.fromJson(payload, BoardBO.class);
        boardService.create(boardBO);

        Map<String, Object> responseBody = new HashMap<>();

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

package com.example.demo.sport;


import com.google.gson.Gson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class SportController {

    @Autowired
    private static final Logger LOGGER = LoggerFactory.getLogger(SportController.class);
    @Autowired
    SportService sportService;
    @Autowired
    Gson gson;

    @GetMapping(value = {"/sports"}, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> getSports() {

        String resp = gson.toJson(sportService.findAll());

        return ResponseEntity.ok(resp);
    }
}

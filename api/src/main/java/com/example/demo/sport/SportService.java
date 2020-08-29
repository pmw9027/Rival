package com.example.demo.sport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class SportService {

    @Autowired
    private SportRepository sportRepository;

    public List<Sport> findAll() {
        return new ArrayList<>(sportRepository.findAll());
    }
}

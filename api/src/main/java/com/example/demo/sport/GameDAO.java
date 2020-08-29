package com.example.demo.sport;

import java.util.List;

public interface GameDAO {

    public void save(Game g);
    public List<Game> list();

}

package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService {

    @Autowired
    private BoardRepository boardRepository;

    public BoardBO getBoard(Long id) {

        return  boardRepository.findById(id).orElse(null);
    }

    public List<BoardBO> list() {
        return boardRepository.findAll();
    }

    public List<BoardBO> list(Pageable pageable) {
        return boardRepository.findAll();
    }

    public BoardBO create(BoardBO boardBO) {
        BoardBO boardBO1 = boardRepository.save(boardBO);
        return boardBO1;
    }
}

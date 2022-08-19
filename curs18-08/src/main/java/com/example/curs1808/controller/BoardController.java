package com.example.curs1808.controller;

import com.example.curs1808.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class BoardController {

    private final BoardService boardService;

    @GetMapping("/set/{boardId}/{coordX}/{coordY}")
    public int[][] setBoard(@PathVariable Integer boardId, @PathVariable Integer coordX, @PathVariable Integer coordY){
        if(boardService.chackBoard(boardId)){
            return boardService.setBoard(boardId,coordX, coordY);
        }else {
            return boardService.initSetBoard(boardId,coordX,coordY);
        }
    }

}

package com.example.curs1808.service;

import com.example.curs1808.data.BoardData;
import com.example.curs1808.model.Board;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BoardService {
    public int[][] setBoard(Integer boardId, Integer coordX, Integer coordY){
        BoardData.boardList.get(boardId).getMatrix()[coordX][coordY] = BoardData.boardList.get(boardId).getMatrix()[coordX][coordY]%2;
        BoardData.boardList.get(boardId).setMoveNr(BoardData.boardList.get(boardId).getMoveNr() + 1);
        return BoardData.boardList.get(boardId).getMatrix();
    }

    public boolean chackBoard(Integer boardId){
        return BoardData.boardList.get(boardId)!=null;
    }

    public int[][] initSetBoard(Integer boardId, Integer coordX, Integer coordY){
        BoardData.boardList.add(boardId, new Board(boardId));
        return setBoard(boardId,coordX,coordY);
    }
}

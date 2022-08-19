package com.example.curs1808.model;

import com.example.curs1808.data.BoardData;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.ArrayList;

@Data
public class Board {

    Integer id;
    int[][] matrix;
    Integer moveNr = 0;

    public Board(Integer boardId){
        this.id = boardId;
        for (int i =0; i<3; i++){
            for (int j=0; j<3; j++){
                matrix[i][j] = -1;
            }
        }
    }

}

package com.example.course1608.model;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    @NotNull
    String roomId;
    @NotNull
    Integer counter;
    @NotNull
    String word;
    @NotNull
    String hiddenWord;
    @Transient
    List<String> usedLetters = new ArrayList<>();

    @PostLoad
    public void handleNull(){
        if (counter == null)
            counter = 0;
    }


}

package com.example.course1608.service;

import com.example.course1608.exception.AlreadyUsedLetterException;
import com.example.course1608.model.Game;
import com.example.course1608.model.TryResponse;
import com.example.course1608.repository.GameRepository;
import lombok.RequiredArgsConstructor;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class GameService {
    private final GameRepository gameRepository;

    public Game createRoom(String hiddenWord){
        int length = 4;
        boolean useLetters = true;
        boolean useNumbers = true;
        String generatedKey = RandomStringUtils.random(length, useLetters, useNumbers);

        String shownWord = "";
        for(int i =0; i<hiddenWord.length();i++){
            shownWord = shownWord.concat("*");
        }
        return gameRepository.save(new Game(null, generatedKey, 0 , hiddenWord, shownWord, new ArrayList<>()));
    }
    public TryResponse guessWord(String roomId, String guess) throws AlreadyUsedLetterException {
        Game game = gameRepository.findByRoomId(roomId);
        if(game.getUsedLetters().contains(guess)){
            throw  new AlreadyUsedLetterException();
        }
        game.getUsedLetters().add(guess);
        List<String> showWord = new ArrayList<>();
        List<String> hiddenWord = new ArrayList<>();
        for (int i =0;i < game.getWord().length(); i++){
            showWord.add(String.valueOf(game.getWord().charAt(i)));
            hiddenWord.add(String.valueOf(game.getHiddenWord().charAt(i)));
        }
        Boolean guessed = false;
        while (showWord.contains(guess) && !hiddenWord.contains(guess)){
            guessed =true;
            hiddenWord.set(showWord.indexOf(guess), showWord.get(showWord.indexOf(guess)));
        }
        if(!guessed){
            game.setCounter(game.getCounter() + 1);
        }
        String tmpHiddenWord = "";
        for (int i = 0; i < game.getWord().length(); i++){
            tmpHiddenWord = tmpHiddenWord.concat(hiddenWord.get(i));
        }

        return tmpHiddenWord;
    }
}

package com.example.course1608.model;

public class TryResponse {
    Boolean guessed;
    Integer triesLeft;
    GameState gameState;

    public TryResponse(Boolean guessed, Game game) {
        this.guessed = guessed;
        this.triesLeft = 10 - game.counter;

        if(!game.hiddenWord.contains("*") && this.triesLeft >0){
            this.gameState = GameState.WON;
        }else if(game.hiddenWord.contains("*") && this.triesLeft <= 0){
            this.gameState = GameState.LOST;
        }else {
            this.gameState = GameState.IN_PROGRESS;
        }
    }
}

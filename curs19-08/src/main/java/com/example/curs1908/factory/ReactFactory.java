package com.example.curs1908.factory;

import com.example.curs1908.model.*;

public class ReactFactory {
    public static React createReact(String name){
        switch (name){
            case "Laugh" : return new LaughReaction();
            case "Like": return new LikeReaction();
            case "Love" : return new LoveReaction();
            case "Sad" : return new SadReaction();
            default: return null;
        }
    }
}

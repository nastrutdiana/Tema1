package com.example.course1608.repository;

import com.example.course1608.model.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Integer> {
    Game findByRoomId(String roomId);
}

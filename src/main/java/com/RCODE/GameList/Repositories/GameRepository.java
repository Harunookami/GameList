package com.RCODE.GameList.Repositories;

import com.RCODE.GameList.Entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;


public interface GameRepository extends JpaRepository<Game, Long> {

}

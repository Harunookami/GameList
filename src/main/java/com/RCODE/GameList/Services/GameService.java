package com.RCODE.GameList.Services;

import com.RCODE.GameList.DTO.GameMinDTO;
import com.RCODE.GameList.Entities.Game;
import com.RCODE.GameList.Repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll() {
       List<Game> result =  gameRepository.findAll();
       List<GameMinDTO> dto = result.stream()
               .map(x -> new GameMinDTO(x))
               .toList();
       return dto;
    }

}

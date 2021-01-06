package games.service;

import games.model.Game;
import games.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {
    GameRepository gameRepository;

    @Autowired
    public GameService(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    public void addGame(Game game){
        gameRepository.save(game);
    }

    public List<Game> getAll(){
        return gameRepository.findAll();
    }
}

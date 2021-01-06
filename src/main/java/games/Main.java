package games;

import games.config.DataConfig;
import games.model.Game;
import games.service.GameService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(DataConfig.class);
        GameService service = context.getBean(GameService.class);
        Game game = new Game();
        game.setName("GTA 5");
        game.setNumberOfPlayers(64);
        game.setGameTime("1 hour");
        System.out.println(service.getAll());
    }
}

package creatures;

import creatures.model.Creature;
import creatures.model.Monster;
import creatures.model.Player;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class GameTest {

    @Test
    void whenInitAndPlayerWins() {
        Game game = new Game();
        Creature player = new Player(223, 226, 100000, 5, 3);
        Creature monster = new Monster(25, 28,  100, 6, 1);
        game.init(player, monster);
        assertTrue(monster.getHealth() <= 0);
    }

    @Test
    void whenAttackModificatorException() {
        Game game = new Game();
        Player player = new Player(23, 26, 100, 5, 3);
        Monster monster = new Monster(25, 28, 100, 6, 6);
        assertThatThrownBy(() -> game.init(player, monster))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Неправильные параметры игрока и монстра");
    }
}
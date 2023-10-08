package creatures.action;

import creatures.model.Monster;
import creatures.model.Player;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerActionTest {
    @Test
    public void whenHarmAndOk() {
        PlayerAction playerAction = new PlayerAction();
        Monster monster = new Monster(25, 28, 100, 6, 1);
        playerAction.harm(25, monster);
        assertEquals(monster.getHealth(), 75);
    }

    @Test
    public void whenHealAndOk() {
        PlayerAction playerAction = new PlayerAction();
        Player player = new Player(23, 26, 100, 5, 3);
        int playerHealth = player.getHealth();
        playerAction.harm(25, player);
        playerAction.heal(player, playerHealth);
        assertEquals(player.getHealth(), 100);
    }

}
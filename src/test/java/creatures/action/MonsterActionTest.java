package creatures.action;

import creatures.model.Monster;
import creatures.model.Player;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MonsterActionTest {

    @Test
    public void whenHarmAndOk() {
        MonsterAction monsterAction = new MonsterAction();
        Player player = new Player(23, 26, 100, 5, 3);
        monsterAction.harm(25, player);
        assertEquals(player.getHealth(), 75);
    }

    @Test
    public void whenHealAndOk() {
        MonsterAction monsterAction = new MonsterAction();
        Monster monster = new Monster(25, 28, 100, 6, 1);
        int monsterHealth = monster.getHealth();
        monsterAction.harm(25, monster);
        monsterAction.heal(monster, monsterHealth);
        assertEquals(monster.getHealth(), 100);
    }
}
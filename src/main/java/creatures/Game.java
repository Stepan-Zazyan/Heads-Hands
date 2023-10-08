package creatures;

import creatures.action.*;
import creatures.action.CreatureAction;
import creatures.model.*;

public class Game {

    public static void main(String[] args) {
        Game game = new Game();
        Creature player = new Player(23,  26, 100, 5, 3);
        Creature monster = new Monster(25, 28, 100, 6, 1);
        game.init(player, monster);
    }

    public void init(Creature player, Creature monster) {
        CreatureAction monsterAction = new MonsterAction();
        int monsterHealth = monster.getHealth();
        int monsterHealCount = 4;
        CreatureAction playerAction = new PlayerAction();
        int playerHealth = player.getHealth();
        int playerHealCount = 4;
        while (player.getHealth() > 0 && monster.getHealth() > 0) {
            int monsterAttackModificator = monster.getAttack() - player.getDefence() + 1;
            int playerAttackModificator = player.getAttack() - monster.getDefence() + 1;
            if (monsterAttackModificator < 1 || playerAttackModificator < 1) {
                throw new IllegalArgumentException("Неправильные параметры игрока и монстра");
            }
            monsterAction.creatureAttack(monster, player, monsterAttackModificator);
            if (player.getHealth() < 0) {
                System.out.println("Монстр выиграл");
                break;
            }
            if (player.getHealth() < playerHealth && playerHealCount > 0) {
                playerAction.heal(player, playerHealth);
                playerHealCount--;
            }
            playerAction.creatureAttack(player, monster, playerAttackModificator);
            if (monster.getHealth() < 0) {
                System.out.println("Игрок выиграл");
                break;
            }
            if (monster.getHealth() < monsterHealth && monsterHealCount > 0) {
                monsterAction.heal(monster, monsterHealth);
                monsterHealCount--;
            }
        }
    }
}

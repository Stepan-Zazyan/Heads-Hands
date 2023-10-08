package creatures.action;

import creatures.model.Creature;

public class PlayerAction implements CreatureAction {

    public void harm(int range, Creature creature) {
        creature.setHealth(creature.getHealth() - range);
    }

    public void heal(Creature creature, int playerHealth) {
        creature.setHealth((creature.getHealth() + (int) (playerHealth * 0.3)));
        if (creature.getHealth() > playerHealth) {
            creature.setHealth(playerHealth);
        }
    }

    public void creatureAttack(Creature player, Creature monster, int attackModificator) {
        while (attackModificator > 0) {
            int random = (int) (Math.random() * 7);
            if (random > 4) {
                int harmPlayerRange = new RandomNumberCreature()
                        .random(player.getMinDamage(), player.getMaxDamage());
                harm(harmPlayerRange, monster);
                break;
            }
            attackModificator--;
        }
    }
}

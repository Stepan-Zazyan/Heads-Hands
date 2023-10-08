package creatures.action;

import creatures.model.Creature;

public class MonsterAction implements CreatureAction {

    public void harm(int range, Creature creature) {
        creature.setHealth(creature.getHealth() - range);
    }

    public void heal(Creature creature, int monsterHealth) {
        creature.setHealth((creature.getHealth() + (int) (monsterHealth * 0.3)));
        if (creature.getHealth() > monsterHealth) {
            creature.setHealth(monsterHealth);
        }
    }

    public void creatureAttack(Creature monster, Creature player, int attackModificator) {
        while (attackModificator > 0) {
            int random = (int) (Math.random() * 7);
            if (random > 4) {
                int harmMonsterRange = new RandomNumberCreature()
                        .random(player.getMinDamage(), player.getMaxDamage());
                harm(harmMonsterRange, player);
                break;
            }
            attackModificator--;
        }
    }
}

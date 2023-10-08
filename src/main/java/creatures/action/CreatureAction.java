package creatures.action;

import creatures.model.Creature;

public interface CreatureAction {

    void harm(int range, Creature creature);

    void heal(Creature creature, int heal);

    void creatureAttack(Creature monster, Creature player, int attackModificator);

}

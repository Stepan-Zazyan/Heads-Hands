package creatures.model;

public interface Creature {
    
    int MINDAMAGE = 0;

    int MAXDAMAGE = 0;

    int HEALTH = 0;

    int ATTACK = 0;

    int DEFENCE = 0;

    int getHealth();

    void setHealth(int health);

   int getAttack();

    void setAttack(int damage);

    int getDefence();

    void setDefence(int defence);

    int getMinDamage();

    void setMinDamage(int minDamage);

    int getMaxDamage();

    void setMaxDamage(int maxDamage);
}

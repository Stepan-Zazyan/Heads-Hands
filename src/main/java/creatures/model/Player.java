package creatures.model;

public class Player implements Creature {

    private int minDamage;

    private int maxDamage;
    private int health;

    private int attack;

    private int defence;

    public Player(int minDamage, int maxDamage, int health, int attack, int defence) {
        if (minDamage < 1 || maxDamage < minDamage) {
            throw new IllegalArgumentException("Урон игрока введен неверно");
        }
        if (health < 1) {
            throw new IllegalArgumentException("Здоровье игрока введено неверно");
        }
        if (attack > 30 || attack < 1) {
            throw new IllegalArgumentException("Атака игрока введена неверно");
        }
        if (defence > 30 || defence < 1) {
            throw new IllegalArgumentException("Защита игрока введена неверно");
        }
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
        this.health = health;
        this.attack = attack;
        this.defence = defence;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public int getMinDamage() {
        return minDamage;
    }

    public void setMinDamage(int minDamage) {
        this.minDamage = minDamage;
    }

    public int getMaxDamage() {
        return maxDamage;
    }

    public void setMaxDamage(int maxDamage) {
        this.maxDamage = maxDamage;
    }
}

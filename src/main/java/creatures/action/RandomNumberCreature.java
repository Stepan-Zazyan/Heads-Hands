package creatures.action;

public class RandomNumberCreature {

    public int random(int min, int max) {
        return (int) (Math.random() * (max - min) + min);
    }
}

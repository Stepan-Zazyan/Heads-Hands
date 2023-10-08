package creatures.action;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RandomNumberCreatureTest {

    @Test
    public void whenGetRandomThenOk() {
       int i = 1000;
        while (i > 0) {
           int result = new RandomNumberCreature().random(2, 7);
           assertTrue(result > 1);
           assertTrue(result < 8);
           i--;
       }
    }

}
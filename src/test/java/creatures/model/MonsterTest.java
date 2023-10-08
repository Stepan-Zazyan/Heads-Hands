package creatures.model;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class MonsterTest {

    @Test
    public void whenLowDamageAndException() {
        assertThatThrownBy(() -> new Monster(0, 26, 100, 6, 3))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Урон монстра введен неверно");
    }

    @Test
    public void whenWrongRangeDamageAndException() {
        assertThatThrownBy(() -> new Monster(23, 2, 100, 6, 3))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Урон монстра введен неверно");
    }

    @Test
    public void whenIllegalDefenceAndException() {
        assertThatThrownBy(() -> new Monster(25, 28, 100, 6, 300))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Защита монстра введена неверно");
    }

    @Test
    public void whenIllegalAttackAndException() {
        assertThatThrownBy(() -> new Monster(25, 28, 100, 600, 22))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Атака монстра введена неверно");
    }

    @Test
    public void whenIllegalHealthAndException() {
        assertThatThrownBy(() -> new Monster(25, 28, -10, 6, 3))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Здоровье монстра введено неверно");
    }

}
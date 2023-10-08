package creatures.model;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class PlayerTest {

    @Test
    public void whenLowDamageAndException() {
        assertThatThrownBy(() -> new Player(0, 26, 100, 6, 3))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Урон игрока введен неверно");
    }

    @Test
    public void whenWrongRangeDamageAndException() {
        assertThatThrownBy(() -> new Player(23, 2, 100, 6, 3))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Урон игрока введен неверно");
    }

    @Test
    public void whenIllegalDefenceAndException() {
        assertThatThrownBy(() -> new Player(23, 26, 100, 6, 300))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Защита игрока введена неверно");
    }

    @Test
    public void whenIllegalAttackAndException() {
        assertThatThrownBy(() -> new Player(23, 26, 100, 600, 22))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Атака игрока введена неверно");
    }

    @Test
    public void whenIllegalHealthAndException() {
        assertThatThrownBy(() -> new Player(23, 26, -10, 6, 3))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Здоровье игрока введено неверно");
    }

}
package ru.job4j.oop;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaxTest {

    @Test
    public void when318Then8() {
        Max max = new Max();
        double result = max.max(3, 1, 8);
        double expected = 8;
        Assertions.assertThat(result).isEqualTo(expected);
    }

    @Test
    public void when19443Then43() {
        Max max = new Max();
        double result = max.max(1,  9, 4, 43);
        double expected = 43;
        Assertions.assertThat(result).isEqualTo(expected);
    }

}

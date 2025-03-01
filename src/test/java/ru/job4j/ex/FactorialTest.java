package ru.job4j.ex;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class FactorialTest {

    @Test
    public void whenFactorial5Then120() {
        Factorial factorial = new Factorial();
        int fact = factorial.calc(5);
        Assertions.assertEquals(120, fact);
    }

    @Test
    public void whenException() {
        Factorial factorial = new Factorial();
        IllegalArgumentException exception = Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> factorial.calc(-10)
        );
        assertThat(exception.getMessage()).isEqualTo("Number could not be less than 0");
    }
}

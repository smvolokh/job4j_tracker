package ru.job4j.oop;


import org.assertj.core.data.Offset;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
public class PointTest {

    @Test
    public void when00And02Then2() {
        Point first = new Point(0, 0);
        Point second = new Point(0, 2);
        Assertions.assertEquals(first.distance(second), 2);
    }

    @Test
    public void when55And59Then4() {
        Point first = new Point(5, 5);
        Point second = new Point(5, 9);
        Assertions.assertEquals(first.distance(second), 4);
    }

    @Test
    public void when345And567Then346() {
        Point first = new Point(3, 4, 5);
        Point second = new Point(5, 6, 7);
        assertThat(first.distance3d(second)).isCloseTo(3.46D, Offset.offset(0.01));
    }

}

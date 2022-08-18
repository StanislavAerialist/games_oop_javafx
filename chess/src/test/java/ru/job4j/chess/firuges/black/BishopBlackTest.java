package ru.job4j.chess.firuges.black;

import org.junit.jupiter.api.Test;
import ru.job4j.chess.firuges.Cell;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class BishopBlackTest {

    @Test
    void position() {
        BishopBlack bishopBlack = new BishopBlack(Cell.A6);
        assertThat(bishopBlack.position().equals(Cell.A6));
    }

    @Test
    void whenCopyBishopA3toB2() {
        BishopBlack bishopBlack = new BishopBlack(Cell.A3);
        assertThat(bishopBlack.copy(Cell.B2).position().equals(Cell.B2));
    }

    @Test
    void whenWayBishopC1toG5() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Cell[] way = bishopBlack.way(Cell.G5);
        Cell[] exp = new Cell[]{Cell.D2, Cell.E3, Cell.D4, Cell.G5};
        assertThat(way.equals(exp));
    }
}
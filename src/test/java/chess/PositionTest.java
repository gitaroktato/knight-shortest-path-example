package chess;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class PositionTest {

    @Test
    public void testAdvance() throws Exception {
        var rank = Rank.A;
        assertEquals(Rank.C, rank.advance(2));
        assertEquals(Rank.E, rank.advance(4));
    }

    @Test
    public void testAdvanceBackward() throws Exception {
        var rank = Rank.C;
        assertEquals(Rank.A, rank.advance(-2));
    }

    @Test
    public void testAdvanceIllegal() {
        var rank = Rank.C;
        assertThrows(IllegalMoveException.class,
                () -> rank.advance(-3));
    }
    @Test
    public void testAdvanceFile() throws Exception {
        var file = File.FOUR;
        assertEquals(File.SIX, file.advance(2));
        assertEquals(File.EIGHT, file.advance(4));
    }
}
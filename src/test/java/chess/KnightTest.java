package chess;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;


public class KnightTest {


    @Test
    public void testMaxStepsFor() {
        var knight = new Knight(
                new Position(Rank.A, File.ONE));
        var solver = new KnightSolver(knight);
        assertEquals(1, solver.maxStepsFor(
                new Position(Rank.B, File.THREE)));
    }

    @Test
    public void testGetPossibleMoves() {
        var knight = new Knight(
                new Position(Rank.D, File.FIVE));
        var moves = knight.getPossibleMoves();
        assertEquals(8, moves.size());
        assertTrue(moves.contains(new Position(Rank.C, File.SEVEN)));
        assertTrue(moves.contains(new Position(Rank.C, File.THREE)));
        assertTrue(moves.contains(new Position(Rank.E, File.SEVEN)));
        assertTrue(moves.contains(new Position(Rank.E, File.THREE)));
        assertTrue(moves.contains(new Position(Rank.B, File.SIX)));
        assertTrue(moves.contains(new Position(Rank.B, File.FOUR)));
        assertTrue(moves.contains(new Position(Rank.F, File.SIX)));
        assertTrue(moves.contains(new Position(Rank.F, File.FOUR)));
    }

    @Test
    public void testGetPossibleMovesFromCorner() {
        var knight = new Knight(
                new Position(Rank.A, File.ONE));
        var moves = knight.getPossibleMoves();
        assertEquals(2, moves.size());
        assertTrue(moves.contains(new Position(Rank.C, File.TWO)));
        assertTrue(moves.contains(new Position(Rank.B, File.THREE)));
    }
}

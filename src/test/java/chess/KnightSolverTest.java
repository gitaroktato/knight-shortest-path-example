package chess;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class KnightSolverTest {

    @Test
    void testMaxStepsForCallingTwice() {
        var solver = new KnightSolver(new Knight(new Position(Rank.D, File.FIVE)));
        var result = solver.maxStepsFor(new Position(Rank.C, File.THREE));
        assertEquals(1, result);
        assertEquals(2, solver.maxStepsFor(new Position(Rank.B, File.ONE)));
    }

    @Test
    void testMaxStepsForWithTwoSteps() {
        var solver = new KnightSolver(new Knight(new Position(Rank.D, File.FIVE)));
        var result = solver.maxStepsFor(new Position(Rank.B, File.ONE));
        assertEquals(2, result);
    }

    @Test
    void testMaxStepsForWithTwoStepsAgain() {
        var solver = new KnightSolver(new Knight(new Position(Rank.D, File.FIVE)));
        var result = solver.maxStepsFor(new Position(Rank.A, File.TWO));
        assertEquals(2, result);
    }

    @Test
    void testMaxStepsForWithTwoStepsAgainAndAgain() {
        var solver = new KnightSolver(new Knight(new Position(Rank.D, File.FIVE)));
        var result = solver.maxStepsFor(new Position(Rank.E, File.FOUR));
        assertEquals(2, result);
    }

    @Test
    void testMaxStepsForWithThreeSteps() {
        var solver = new KnightSolver(new Knight(new Position(Rank.A, File.ONE)));
        var result = solver.maxStepsFor(new Position(Rank.D, File.FIVE));
        assertEquals(3, result);
    }

    @Test
    void testMaxStepsForWithThreeStepsVeryClose() {
        var solver = new KnightSolver(new Knight(new Position(Rank.A, File.ONE)));
        var result = solver.maxStepsFor(new Position(Rank.A, File.TWO));
        assertEquals(3, result);
    }

    @Test
    void testMaxStepsForWithFourSteps() {
        var solver = new KnightSolver(new Knight(new Position(Rank.A, File.ONE)));
        var result = solver.maxStepsFor(new Position(Rank.C, File.THREE));
        assertEquals(4, result);
    }

    @Test
    void testMaxStepsForWithFourStepsVeryFar() {
        var solver = new KnightSolver(new Knight(new Position(Rank.A, File.ONE)));
        var result = solver.maxStepsFor(new Position(Rank.F, File.EIGHT));
        assertEquals(4, result);
    }
}
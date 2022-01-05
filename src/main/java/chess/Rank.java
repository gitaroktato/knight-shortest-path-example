package chess;

import java.util.Optional;

public enum Rank {

    A, B, C, D, E, F, G, H;

    public Rank advance(int steps) throws IllegalMoveException {
        try {
            return Rank.values()[this.ordinal() + steps];
        } catch (ArrayIndexOutOfBoundsException ex) {
            throw new IllegalMoveException();
        }
    }
}

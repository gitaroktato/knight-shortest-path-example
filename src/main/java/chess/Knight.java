package chess;

import java.util.HashSet;
import java.util.Set;

public class Knight {

    private final Position position;

    public Knight(Position position) {
        this.position = position;
    }

    Set<Position> getPossibleMoves() {
        var result = new HashSet<Position>();
        position.advance(1, 2).ifPresent(result::add);
        position.advance(1, -2).ifPresent(result::add);
        position.advance(2, 1).ifPresent(result::add);
        position.advance(2, -1).ifPresent(result::add);
        position.advance(-1, 2).ifPresent(result::add);
        position.advance(-1, -2).ifPresent(result::add);
        position.advance(-2, 1).ifPresent(result::add);
        position.advance(-2, -1).ifPresent(result::add);
        return result;
    }

    public Position getPosition() {
        return position;
    }
}

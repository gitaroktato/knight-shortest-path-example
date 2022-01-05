package chess;

import java.util.Objects;
import java.util.Optional;

public final class Position {

    private final Rank rank;
    private final File file;

    public Position(Rank rank, File file) {
        this.rank = rank;
        this.file = file;
    }

    public Optional<Position> advance(int rankChange, int fileChange) {
        try {
            return Optional.of(new Position(rank.advance(rankChange),
                    file.advance(fileChange)));
        } catch (IllegalMoveException e) {
            return Optional.empty();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position position = (Position) o;
        return rank == position.rank && file == position.file;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rank, file);
    }
}

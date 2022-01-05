package chess;

import java.util.*;

public class KnightSolver {

    private final Knight knight;
    private final Set<Position> seen = new HashSet<>();
    private final Queue<Position> candidates = new LinkedList<>();
    private final Map<Position, Integer> stepsNeeded = new HashMap<>();

    public KnightSolver(Knight knight) {
        this.knight = knight;
    }

    private void initialize() {
        var start = knight.getPosition();
        seen.clear();
        candidates.clear();
        stepsNeeded.clear();
        seen.add(start);
        candidates.add(start);
        stepsNeeded.put(start, 0);
    }

    public int maxStepsFor(Position endPosition) {
        initialize();
        while (!candidates.isEmpty()) {
            var currentKnight = new Knight(candidates.poll());
            var positions = currentKnight.getPossibleMoves();
            positions.removeAll(seen);
            for (var position : positions) {
                stepsNeeded.put(position, stepsNeeded.get(currentKnight.getPosition()) + 1);
                if (endPosition.equals(position)) {
                    return stepsNeeded.get(endPosition);
                }
                seen.addAll(positions);
                candidates.add(position);
            }
        }
        throw new RuntimeException("Should not be possible");
    }
}

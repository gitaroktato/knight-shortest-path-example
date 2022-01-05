package chess;

public enum File {

    ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT;

    public File advance(int steps) throws IllegalMoveException {
        try {
            return File.values()[this.ordinal() + steps];
        } catch (ArrayIndexOutOfBoundsException ex) {
            throw new IllegalMoveException();
        }
    }
}

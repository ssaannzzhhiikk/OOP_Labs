package Lab2.problem2;

public class Pawn extends Piece {
    public Pawn(Position position, boolean isWhite) {
        super(position, isWhite);
    }

    @Override
    public boolean isLegalMove(Position b) {
        int rowDiff = b.getRow() - position.getRow();
        int colDiff = Math.abs(b.getCol() - position.getCol());
        int direction = isWhite ? 1 : -1;

        // Move forward one square
        if (colDiff == 0 && rowDiff == direction) return true;

        // Initial two-square advance
        int startRow = isWhite ? 1 : 6;
        if (colDiff == 0 && rowDiff == 2 * direction && position.getRow() == startRow) return true;

        // Diagonal capture
        if (colDiff == 1 && rowDiff == direction) return true;

        return false;
    }
}
